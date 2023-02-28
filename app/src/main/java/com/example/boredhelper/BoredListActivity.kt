package com.example.boredhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.boredhelper.databinding.ActivityBoredListBinding

class BoredListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBoredListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoredListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}