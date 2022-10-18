package typings.blackEngine

import typings.blackEngine.audioSoundEffectMod.SoundEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioEffectsStereoPannerMod {
  
  @JSImport("black-engine/audio/effects/StereoPanner", "StereoPanner")
  @js.native
  open class StereoPanner () extends SoundEffect {
    
    /* private */ var mGainL: Any = js.native
    
    /* private */ var mGainR: Any = js.native
    
    /* private */ var mMerger: Any = js.native
    
    /* private */ var mSplitter: Any = js.native
    
    /* private */ var mValue: Any = js.native
    
    def pan: Double = js.native
    def pan_=(arg: Double): Unit = js.native
  }
}
