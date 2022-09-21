package typings.blackEngine

import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import typings.blackEngine.soundClipMod.SoundClip
import typings.blackEngine.stereoPannerMod.StereoPanner
import typings.std.AnalyserNode
import typings.std.AudioNode
import typings.std.PannerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundInstanceMod {
  
  @JSImport("black-engine/audio/SoundInstance", "SoundInstance")
  @js.native
  open class SoundInstance protected () extends MessageDispatcher {
    def this(sound: SoundClip) = this()
    
    /* private */ var __onComplete: Any = js.native
    
    /* private */ var __reconnectSource: Any = js.native
    
    def _outputNode: AudioNode = js.native
    
    def _play(): SoundInstance = js.native
    
    def channel: String = js.native
    def channel_=(arg: String): Unit = js.native
    
    def currentPosition: Double = js.native
    
    def duration: Double = js.native
    
    def enableAnalyser(): AnalyserNode = js.native
    
    def enableSpacePan(): PannerNode = js.native
    
    def enableStereoPan(): StereoPanner = js.native
    
    def fade(from: Double, to: Double): Unit = js.native
    def fade(from: Double, to: Double, duration: Double): Unit = js.native
    def fade(from: Double, to: Double, duration: Double, `type`: String): Unit = js.native
    def fade(from: Double, to: Double, duration: Unit, `type`: String): Unit = js.native
    
    def isPlaying: Boolean = js.native
    
    def loop: Boolean = js.native
    def loop_=(arg: Boolean): Unit = js.native
    
    /* private */ var mAnalyser: Any = js.native
    
    /* private */ var mChannel: Any = js.native
    
    /* private */ var mFirstNode: Any = js.native
    
    /* private */ var mGainNode: Any = js.native
    
    /* private */ var mId: Any = js.native
    
    /* private */ var mLoop: Any = js.native
    
    /* private */ var mPausePosition: Any = js.native
    
    /* private */ var mPlayNode: Any = js.native
    
    /* private */ var mSound: Any = js.native
    
    /* private */ var mSpatialPanner: Any = js.native
    
    /* private */ var mSrc: Any = js.native
    
    /* private */ var mStartTime: Any = js.native
    
    /* private */ var mState: Any = js.native
    
    /* private */ var mStereoPanner: Any = js.native
    
    /* private */ var mStopPosition: Any = js.native
    
    /* private */ var mVolume: Any = js.native
    
    def pan: Double = js.native
    def pan_=(arg: Double): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(duration: Double): Unit = js.native
    
    def volume: Double = js.native
    def volume_=(arg: Double): Unit = js.native
  }
}
