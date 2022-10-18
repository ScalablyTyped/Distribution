package typings.blackEngine

import typings.blackEngine.audioSoundAtlasClipMod.SoundAtlasClip
import typings.blackEngine.audioSoundChannelMod.SoundChannel
import typings.blackEngine.audioSoundInstanceMod.SoundInstance
import typings.blackEngine.audioSoundListenerMod.SoundListener
import typings.blackEngine.coreSystemMod.System
import typings.std.AudioContext
import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioMasterAudioMod {
  
  @JSImport("black-engine/audio/MasterAudio", "MasterAudio")
  @js.native
  open class MasterAudio () extends System {
    
    def __initialize(): Unit = js.native
    
    /* private */ var __unlock: Any = js.native
    
    def _newGainNode(): GainNode = js.native
    
    def _resolveChannel(snd: SoundInstance): SoundChannel = js.native
    
    def context: AudioContext = js.native
    
    def createChannel(name: String): SoundChannel = js.native
    
    def currentListener: SoundListener = js.native
    def currentListener_=(arg: SoundListener): Unit = js.native
    
    def getChannel(name: String): SoundChannel | Null = js.native
    
    def looseListener(): Unit = js.native
    
    /* private */ var mChannels: Any = js.native
    
    /* private */ var mContext: Any = js.native
    
    /* private */ var mCurrentListener: Any = js.native
    
    /* private */ var mIsPendingResume: Any = js.native
    
    /* private */ var mMasterChannel: Any = js.native
    
    /* private */ var mPendingResume: Any = js.native
    
    /* private */ var mResumeTimeout: Any = js.native
    
    def masterChannel: SoundChannel = js.native
    
    def masterVolume: Double = js.native
    def masterVolume_=(arg: Double): Unit = js.native
    
    def pauseAll(): Unit = js.native
    def pauseAll(channelName: String): Unit = js.native
    
    def play(nameOrSound: String): SoundInstance = js.native
    def play(nameOrSound: String, channel: String): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Double, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Double, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Double, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Unit, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: String, volume: Unit, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Double, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Double, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Double, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Unit, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: String, channel: Unit, volume: Unit, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Double, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Double, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Double, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Unit, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: String, volume: Unit, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Double, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Double, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Double, loop: Unit, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Unit, loop: Boolean): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Unit, loop: Boolean, pan: Double): SoundInstance = js.native
    def play(nameOrSound: SoundAtlasClip, channel: Unit, volume: Unit, loop: Unit, pan: Double): SoundInstance = js.native
    
    def resumeAll(): Unit = js.native
    def resumeAll(channelName: String): Unit = js.native
    
    def resumeTimeout: Double = js.native
    def resumeTimeout_=(arg: Double): Unit = js.native
    
    def stopAll(): Unit = js.native
    def stopAll(channelName: String): Unit = js.native
  }
}
