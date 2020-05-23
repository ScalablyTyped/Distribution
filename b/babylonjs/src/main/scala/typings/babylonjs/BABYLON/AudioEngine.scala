package typings.babylonjs.BABYLON

import typings.std.AudioContext
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioEngine extends IAudioEngine {
  var _audioContext: js.Any
  var _audioContextInitialized: js.Any
  var _connectedAnalyser: js.Any
  var _displayMuteButton: js.Any
  var _hideMuteButton: js.Any
  var _hostElement: js.Any
  var _initializeAudioContext: js.Any
  var _moveButtonToTopLeft: js.Any
  var _muteButton: js.Any
  var _onResize: js.Any
  var _resumeAudioContext: js.Any
  var _triggerRunningState: js.Any
  var _triggerSuspendedState: js.Any
  var _tryToRun: js.Any
  /**
    * Gets the current AudioContext if available.
    */
  @JSName("audioContext")
  def audioContext_MAudioEngine: Nullable[AudioContext]
  /**
    * Connect the audio engine to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit
  /**
    * Gets the global volume sets on the master gain.
    * @returns the global volume if set or -1 otherwise
    */
  def getGlobalVolume(): Double
  /**
    * Sets the global volume of your experience (sets on the master gain).
    * @param newVolume Defines the new global volume of the application
    */
  def setGlobalVolume(newVolume: Double): Unit
}

object AudioEngine {
  @scala.inline
  def apply(
    WarnedWebAudioUnsupported: Boolean,
    _audioContext: js.Any,
    _audioContextInitialized: js.Any,
    _connectedAnalyser: js.Any,
    _displayMuteButton: js.Any,
    _hideMuteButton: js.Any,
    _hostElement: js.Any,
    _initializeAudioContext: js.Any,
    _moveButtonToTopLeft: js.Any,
    _muteButton: js.Any,
    _onResize: js.Any,
    _resumeAudioContext: js.Any,
    _triggerRunningState: js.Any,
    _triggerSuspendedState: js.Any,
    _tryToRun: js.Any,
    audioContext: () => Nullable[AudioContext],
    canUseWebAudio: Boolean,
    connectToAnalyser: Analyser => Unit,
    dispose: () => Unit,
    getGlobalVolume: () => Double,
    isMP3supported: Boolean,
    isOGGsupported: Boolean,
    lock: () => Unit,
    masterGain: GainNode,
    onAudioLockedObservable: Observable[AudioEngine],
    onAudioUnlockedObservable: Observable[AudioEngine],
    setGlobalVolume: Double => Unit,
    unlock: () => Unit,
    unlocked: Boolean,
    useCustomUnlockedButton: Boolean
  ): AudioEngine = {
    val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported.asInstanceOf[js.Any], _audioContext = _audioContext.asInstanceOf[js.Any], _audioContextInitialized = _audioContextInitialized.asInstanceOf[js.Any], _connectedAnalyser = _connectedAnalyser.asInstanceOf[js.Any], _displayMuteButton = _displayMuteButton.asInstanceOf[js.Any], _hideMuteButton = _hideMuteButton.asInstanceOf[js.Any], _hostElement = _hostElement.asInstanceOf[js.Any], _initializeAudioContext = _initializeAudioContext.asInstanceOf[js.Any], _moveButtonToTopLeft = _moveButtonToTopLeft.asInstanceOf[js.Any], _muteButton = _muteButton.asInstanceOf[js.Any], _onResize = _onResize.asInstanceOf[js.Any], _resumeAudioContext = _resumeAudioContext.asInstanceOf[js.Any], _triggerRunningState = _triggerRunningState.asInstanceOf[js.Any], _triggerSuspendedState = _triggerSuspendedState.asInstanceOf[js.Any], _tryToRun = _tryToRun.asInstanceOf[js.Any], audioContext = js.Any.fromFunction0(audioContext), canUseWebAudio = canUseWebAudio.asInstanceOf[js.Any], connectToAnalyser = js.Any.fromFunction1(connectToAnalyser), dispose = js.Any.fromFunction0(dispose), getGlobalVolume = js.Any.fromFunction0(getGlobalVolume), isMP3supported = isMP3supported.asInstanceOf[js.Any], isOGGsupported = isOGGsupported.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), masterGain = masterGain.asInstanceOf[js.Any], onAudioLockedObservable = onAudioLockedObservable.asInstanceOf[js.Any], onAudioUnlockedObservable = onAudioUnlockedObservable.asInstanceOf[js.Any], setGlobalVolume = js.Any.fromFunction1(setGlobalVolume), unlock = js.Any.fromFunction0(unlock), unlocked = unlocked.asInstanceOf[js.Any], useCustomUnlockedButton = useCustomUnlockedButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEngine]
  }
}

