package com.example.resta

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class inicio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val btn: Button = findViewById(R.id.btnloby)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, comida:: class.java)
            startActivity(intent)
        }
    }
}