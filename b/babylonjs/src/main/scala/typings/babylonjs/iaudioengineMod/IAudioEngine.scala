package typings.babylonjs.iaudioengineMod

import typings.babylonjs.analyserMod.Analyser
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import typings.std.AudioContext
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAudioEngine extends IDisposable {
  
  /**
    * Defines if Babylon should emit a warning if WebAudio is not supported.
    * @ignoreNaming
    */
  var WarnedWebAudioUnsupported: Boolean = js.native
  
  /**
    * Gets the current AudioContext if available.
    */
  val audioContext: Nullable[AudioContext] = js.native
  
  /**
    * Gets whether the current host supports Web Audio and thus could create AudioContexts.
    */
  val canUseWebAudio: Boolean = js.native
  
  /**
    * Connect the audio engine to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit = js.native
  
  /**
    * Gets the global volume sets on the master gain.
    * @returns the global volume if set or -1 otherwise
    */
  def getGlobalVolume(): Double = js.native
  
  /**
    * Gets whether or not mp3 are supported by your browser.
    */
  val isMP3supported: Boolean = js.native
  
  /**
    * Gets whether or not ogg are supported by your browser.
    */
  val isOGGsupported: Boolean = js.native
  
  /**
    * Flags the audio engine in Locked state.
    * This happens due to new browser policies preventing audio to autoplay.
    */
  def lock(): Unit = js.native
  
  /**
    * The master gain node defines the global audio volume of your audio engine.
    */
  val masterGain: GainNode = js.native
  
  /**
    * Event raised when audio has been locked on the browser.
    */
  var onAudioLockedObservable: Observable[IAudioEngine] = js.native
  
  /**
    * Event raised when audio has been unlocked on the browser.
    */
  var onAudioUnlockedObservable: Observable[IAudioEngine] = js.native
  
  /**
    * Sets the global volume of your experience (sets on the master gain).
    * @param newVolume Defines the new global volume of the application
    */
  def setGlobalVolume(newVolume: Double): Unit = js.native
  
  /**
    * Unlocks the audio engine once a user action has been done on the dom.
    * This is helpful to resume play once browser policies have been satisfied.
    */
  def unlock(): Unit = js.native
  
  /**
    * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
    */
  val unlocked: Boolean = js.native
  
  /**
    * Defines if the audio engine relies on a custom unlocked button.
    * In this case, the embedded button will not be displayed.
    */
  var useCustomUnlockedButton: Boolean = js.native
}
object IAudioEngine {
  
  @scala.inline
  def apply(
    WarnedWebAudioUnsupported: Boolean,
    canUseWebAudio: Boolean,
    connectToAnalyser: Analyser => Unit,
    dispose: () => Unit,
    getGlobalVolume: () => Double,
    isMP3supported: Boolean,
    isOGGsupported: Boolean,
    lock: () => Unit,
    masterGain: GainNode,
    onAudioLockedObservable: Observable[IAudioEngine],
    onAudioUnlockedObservable: Observable[IAudioEngine],
    setGlobalVolume: Double => Unit,
    unlock: () => Unit,
    unlocked: Boolean,
    useCustomUnlockedButton: Boolean
  ): IAudioEngine = {
    val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported.asInstanceOf[js.Any], canUseWebAudio = canUseWebAudio.asInstanceOf[js.Any], connectToAnalyser = js.Any.fromFunction1(connectToAnalyser), dispose = js.Any.fromFunction0(dispose), getGlobalVolume = js.Any.fromFunction0(getGlobalVolume), isMP3supported = isMP3supported.asInstanceOf[js.Any], isOGGsupported = isOGGsupported.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), masterGain = masterGain.asInstanceOf[js.Any], onAudioLockedObservable = onAudioLockedObservable.asInstanceOf[js.Any], onAudioUnlockedObservable = onAudioUnlockedObservable.asInstanceOf[js.Any], setGlobalVolume = js.Any.fromFunction1(setGlobalVolume), unlock = js.Any.fromFunction0(unlock), unlocked = unlocked.asInstanceOf[js.Any], useCustomUnlockedButton = useCustomUnlockedButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEngine]
  }
  
  @scala.inline
  implicit class IAudioEngineOps[Self <: IAudioEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWarnedWebAudioUnsupported(value: Boolean): Self = this.set("WarnedWebAudioUnsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseWebAudio(value: Boolean): Self = this.set("canUseWebAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectToAnalyser(value: Analyser => Unit): Self = this.set("connectToAnalyser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGlobalVolume(value: () => Double): Self = this.set("getGlobalVolume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMP3supported(value: Boolean): Self = this.set("isMP3supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOGGsupported(value: Boolean): Self = this.set("isOGGsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: () => Unit): Self = this.set("lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMasterGain(value: GainNode): Self = this.set("masterGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAudioLockedObservable(value: Observable[IAudioEngine]): Self = this.set("onAudioLockedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAudioUnlockedObservable(value: Observable[IAudioEngine]): Self = this.set("onAudioUnlockedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetGlobalVolume(value: Double => Unit): Self = this.set("setGlobalVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = this.set("unlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlocked(value: Boolean): Self = this.set("unlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomUnlockedButton(value: Boolean): Self = this.set("useCustomUnlockedButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContext(value: Nullable[AudioContext]): Self = this.set("audioContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContextNull: Self = this.set("audioContext", null)
  }
}
