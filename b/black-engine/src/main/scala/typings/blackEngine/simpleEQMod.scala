package typings.blackEngine

import typings.blackEngine.soundEffectMod.SoundEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleEQMod {
  
  @JSImport("black-engine/audio/effects/SimpleEQ", "SimpleEQ")
  @js.native
  open class SimpleEQ protected () extends SoundEffect {
    def this(frequencies: Double*) = this()
    
    /* private */ var __createFilter: Any = js.native
    
    def addPreset(name: String, values: Double*): Unit = js.native
    
    def applyPreset(name: String): Unit = js.native
    
    /* private */ var mFilters: Any = js.native
    
    /* private */ var mMaxGainLevel: Any = js.native
    
    /* private */ var mPresets: Any = js.native
    
    def savePreset(name: String): Unit = js.native
    
    def setLevelByFrequency(freq: Double, value: Double): Unit = js.native
    
    def setLevelByIndex(freqIndex: Double, value: Double): Unit = js.native
  }
}
