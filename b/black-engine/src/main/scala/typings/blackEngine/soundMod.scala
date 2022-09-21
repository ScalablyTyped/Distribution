package typings.blackEngine

import typings.blackEngine.componentMod.Component
import typings.blackEngine.soundInstanceMod.SoundInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundMod {
  
  @JSImport("black-engine/audio/Sound", "Sound")
  @js.native
  open class Sound protected () extends Component {
    def this(name: String) = this()
    def this(name: String, channel: String) = this()
    def this(name: String, channel: String, spatialEffect: Boolean) = this()
    def this(name: String, channel: Unit, spatialEffect: Boolean) = this()
    def this(name: String, channel: String, spatialEffect: Boolean, rolloff: Double) = this()
    def this(name: String, channel: String, spatialEffect: Unit, rolloff: Double) = this()
    def this(name: String, channel: Unit, spatialEffect: Boolean, rolloff: Double) = this()
    def this(name: String, channel: Unit, spatialEffect: Unit, rolloff: Double) = this()
    
    /* private */ var __onSoundComplete: Any = js.native
    
    /* private */ var mChannelName: Any = js.native
    
    /* private */ var mCompleteBinding: Any = js.native
    
    /* private */ var mPlayOnAdded: Any = js.native
    
    /* private */ var mRolloff: Any = js.native
    
    /* private */ var mSoundClip: Any = js.native
    
    /* private */ var mSoundInstance: Any = js.native
    
    /* private */ var mSpatialEffect: Any = js.native
    
    /* private */ var mStopOnRemove: Any = js.native
    
    def onAdded(gameObject: Any): Unit = js.native
    
    def onRemoved(gameObject: Any): Unit = js.native
    
    def play(): SoundInstance = js.native
    def play(volume: Double): SoundInstance = js.native
    def play(volume: Double, loop: Boolean): SoundInstance = js.native
    def play(volume: Double, loop: Boolean, overwrite: Boolean): SoundInstance = js.native
    def play(volume: Double, loop: Unit, overwrite: Boolean): SoundInstance = js.native
    def play(volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(volume: Unit, loop: Boolean, overwrite: Boolean): SoundInstance = js.native
    def play(volume: Unit, loop: Unit, overwrite: Boolean): SoundInstance = js.native
    
    def playOnAdded: Boolean = js.native
    def playOnAdded_=(arg: Boolean): Unit = js.native
    
    def spatialEffect: Boolean = js.native
    def spatialEffect_=(arg: Boolean): Unit = js.native
    
    def stop(): Unit = js.native
    
    def stopOnRemove: Boolean = js.native
    def stopOnRemove_=(arg: Boolean): Unit = js.native
  }
}
