package typings.blackEngine

import typings.blackEngine.soundEffectMod.SoundEffect
import typings.blackEngine.soundInstanceMod.SoundInstance
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundChannelMod {
  
  @JSImport("black-engine/audio/SoundChannel", "SoundChannel")
  @js.native
  open class SoundChannel protected () extends StObject {
    def this(name: String) = this()
    
    /* private */ var __reconnectSounds: Any = js.native
    
    def _inputNode: AudioNode = js.native
    
    def _outputNode: AudioNode = js.native
    
    def addEffect(effect: SoundEffect): SoundEffect = js.native
    
    def attachSound(soundInstance: SoundInstance): Unit = js.native
    
    def detachSound(soundInstance: SoundInstance): Unit = js.native
    
    /* private */ var mEffects: Any = js.native
    
    /* private */ var mGain: Any = js.native
    
    /* private */ var mName: Any = js.native
    
    /* private */ var mSounds: Any = js.native
    
    def pauseAll(): Unit = js.native
    
    def removeAllEffects(): Unit = js.native
    
    def removeEffect(effect: SoundEffect): SoundEffect = js.native
    
    def resumeAll(): Unit = js.native
    
    def stopAll(): Unit = js.native
    
    def volume: Double = js.native
    def volume_=(arg: Double): Unit = js.native
  }
}
