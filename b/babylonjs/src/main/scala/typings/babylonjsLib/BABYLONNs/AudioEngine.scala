package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents the default audio engine used in babylon.
  * It is responsible to play, synchronize and analyse sounds throughout the  application.
  * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
  */
@JSGlobal("BABYLON.AudioEngine")
@js.native
/**
  * Instantiates a new audio engine.
  *
  * There should be only one per page as some browsers restrict the number
  * of audio contexts you can create.
  * @param hostElement defines the host element where to display the mute icon if necessary
  */
class AudioEngine () extends IAudioEngine {
  def this(hostElement: Nullable[stdLib.HTMLElement]) = this()
  /**
    * Defines if Babylon should emit a warning if WebAudio is not supported.
    * @ignoreNaming
    */
  /* CompleteClass */
  override var WarnedWebAudioUnsupported: scala.Boolean = js.native
  var _audioContext: js.Any = js.native
  var _audioContextInitialized: js.Any = js.native
  var _connectedAnalyser: js.Any = js.native
  var _displayMuteButton: js.Any = js.native
  var _hideMuteButton: js.Any = js.native
  var _hostElement: js.Any = js.native
  var _initializeAudioContext: js.Any = js.native
  var _moveButtonToTopLeft: js.Any = js.native
  var _muteButton: js.Any = js.native
  var _onResize: js.Any = js.native
  var _resumeAudioContext: js.Any = js.native
  var _triggerRunningState: js.Any = js.native
  var _triggerSuspendedState: js.Any = js.native
  var _tryToRun: js.Any = js.native
  /**
    * Gets the current AudioContext if available.
    */
  /* CompleteClass */
  override val audioContext: Nullable[stdLib.AudioContext] = js.native
  /**
    * Gets whether the current host supports Web Audio and thus could create AudioContexts.
    */
  /* CompleteClass */
  override val canUseWebAudio: scala.Boolean = js.native
  /**
    * Gets whether or not mp3 are supported by your browser.
    */
  /* CompleteClass */
  override val isMP3supported: scala.Boolean = js.native
  /**
    * Gets whether or not ogg are supported by your browser.
    */
  /* CompleteClass */
  override val isOGGsupported: scala.Boolean = js.native
  /**
    * The master gain node defines the global audio volume of your audio engine.
    */
  /* CompleteClass */
  override val masterGain: stdLib.GainNode = js.native
  /**
    * Event raised when audio has been locked on the browser.
    */
  /* CompleteClass */
  override var onAudioLockedObservable: Observable[AudioEngine] = js.native
  /**
    * Event raised when audio has been unlocked on the browser.
    */
  /* CompleteClass */
  override var onAudioUnlockedObservable: Observable[AudioEngine] = js.native
  /**
    * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
    */
  /* CompleteClass */
  override val unlocked: scala.Boolean = js.native
  /**
    * Defines if the audio engine relies on a custom unlocked button.
    * In this case, the embedded button will not be displayed.
    */
  /* CompleteClass */
  override var useCustomUnlockedButton: scala.Boolean = js.native
  /**
    * Connect the audio engine to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): scala.Unit = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Gets the global volume sets on the master gain.
    * @returns the global volume if set or -1 otherwise
    */
  def getGlobalVolume(): scala.Double = js.native
  /**
    * Flags the audio engine in Locked state.
    * This happens due to new browser policies preventing audio to autoplay.
    */
  /* CompleteClass */
  override def lock(): scala.Unit = js.native
  /**
    * Sets the global volume of your experience (sets on the master gain).
    * @param newVolume Defines the new global volume of the application
    */
  def setGlobalVolume(newVolume: scala.Double): scala.Unit = js.native
  /**
    * Unlocks the audio engine once a user action has been done on the dom.
    * This is helpful to resume play once browser policies have been satisfied.
    */
  /* CompleteClass */
  override def unlock(): scala.Unit = js.native
}

