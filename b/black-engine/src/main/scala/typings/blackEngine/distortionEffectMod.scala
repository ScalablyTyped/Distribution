package typings.blackEngine

import typings.blackEngine.soundEffectMod.SoundEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distortionEffectMod {
  
  @JSImport("black-engine/audio/effects/DistortionEffect", "DistortionEffect")
  @js.native
  open class DistortionEffect () extends SoundEffect {
    def this(value: Double) = this()
    
    /* private */ var __makeDistortionCurve: Any = js.native
    
    def distortion: Double = js.native
    def distortion_=(arg: Double): Unit = js.native
    
    /* private */ var mCurve: Any = js.native
    
    /* private */ var mSamples: Any = js.native
    
    /* private */ var mValue: Any = js.native
    
    /* private */ var mWaveShaperNode: Any = js.native
  }
}
