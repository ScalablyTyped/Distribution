package typings.blackEngine

import typings.blackEngine.soundInstanceMod.SoundInstance
import typings.std.AudioBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundClipMod {
  
  @JSImport("black-engine/audio/SoundClip", "SoundClip")
  @js.native
  open class SoundClip protected () extends StObject {
    def this(nativeBuffer: AudioBuffer) = this()
    def this(nativeBuffer: AudioBuffer, offset: Double) = this()
    def this(nativeBuffer: AudioBuffer, offset: Double, duration: Double) = this()
    def this(nativeBuffer: AudioBuffer, offset: Unit, duration: Double) = this()
    def this(nativeBuffer: AudioBuffer, offset: Double, duration: Double, isSubClip: Boolean) = this()
    def this(nativeBuffer: AudioBuffer, offset: Double, duration: Unit, isSubClip: Boolean) = this()
    def this(nativeBuffer: AudioBuffer, offset: Unit, duration: Double, isSubClip: Boolean) = this()
    def this(nativeBuffer: AudioBuffer, offset: Unit, duration: Unit, isSubClip: Boolean) = this()
    
    /* private */ var __averagePeak: Any = js.native
    
    def collectWaveData(blockNum: Double): js.typedarray.Float32Array = js.native
    
    def duration: Double = js.native
    
    def isSubClip: Boolean = js.native
    
    /* private */ var mDuration: Any = js.native
    
    /* private */ var mIsSubClip: Any = js.native
    
    /* private */ var mNativeBuffer: Any = js.native
    
    /* private */ var mStartOffset: Any = js.native
    
    def native: AudioBuffer = js.native
    
    def offset: Double = js.native
    
    def play(): SoundInstance = js.native
    def play(channel: String): SoundInstance = js.native
    def play(channel: String, volume: Double): SoundInstance = js.native
    def play(channel: String, volume: Double, loop: Boolean): SoundInstance = js.native
    def play(channel: String, volume: Double, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(channel: String, volume: Double, loop: Unit, pan: Double): SoundInstance = js.native
    def play(channel: String, volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(channel: String, volume: Unit, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(channel: String, volume: Unit, loop: Unit, pan: Double): SoundInstance = js.native
    def play(channel: Unit, volume: Double): SoundInstance = js.native
    def play(channel: Unit, volume: Double, loop: Boolean): SoundInstance = js.native
    def play(channel: Unit, volume: Double, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(channel: Unit, volume: Double, loop: Unit, pan: Double): SoundInstance = js.native
    def play(channel: Unit, volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(channel: Unit, volume: Unit, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(channel: Unit, volume: Unit, loop: Unit, pan: Double): SoundInstance = js.native
  }
}
