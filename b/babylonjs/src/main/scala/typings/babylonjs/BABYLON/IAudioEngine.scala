package typings.babylonjs.BABYLON

import typings.std.AudioContext
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudioEngine extends IDisposable {
  /**
    * Defines if Babylon should emit a warning if WebAudio is not supported.
    * @ignoreNaming
    */
  var WarnedWebAudioUnsupported: Boolean
  /**
    * Gets the current AudioContext if available.
    */
  val audioContext: Nullable[AudioContext]
  /**
    * Gets whether the current host supports Web Audio and thus could create AudioContexts.
    */
  val canUseWebAudio: Boolean
  /**
    * Gets whether or not mp3 are supported by your browser.
    */
  val isMP3supported: Boolean
  /**
    * Gets whether or not ogg are supported by your browser.
    */
  val isOGGsupported: Boolean
  /**
    * The master gain node defines the global audio volume of your audio engine.
    */
  val masterGain: GainNode
  /**
    * Event raised when audio has been locked on the browser.
    */
  var onAudioLockedObservable: Observable[AudioEngine]
  /**
    * Event raised when audio has been unlocked on the browser.
    */
  var onAudioUnlockedObservable: Observable[AudioEngine]
  /**
    * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
    */
  val unlocked: Boolean
  /**
    * Defines if the audio engine relies on a custom unlocked button.
    * In this case, the embedded button will not be displayed.
    */
  var useCustomUnlockedButton: Boolean
  /**
    * Flags the audio engine in Locked state.
    * This happens due to new browser policies preventing audio to autoplay.
    */
  def lock(): Unit
  /**
    * Unlocks the audio engine once a user action has been done on the dom.
    * This is helpful to resume play once browser policies have been satisfied.
    */
  def unlock(): Unit
}

object IAudioEngine {
  @scala.inline
  def apply(
    WarnedWebAudioUnsupported: Boolean,
    canUseWebAudio: Boolean,
    dispose: () => Unit,
    isMP3supported: Boolean,
    isOGGsupported: Boolean,
    lock: () => Unit,
    masterGain: GainNode,
    onAudioLockedObservable: Observable[AudioEngine],
    onAudioUnlockedObservable: Observable[AudioEngine],
    unlock: () => Unit,
    unlocked: Boolean,
    useCustomUnlockedButton: Boolean,
    audioContext: Nullable[AudioContext] = null
  ): IAudioEngine = {
    val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported.asInstanceOf[js.Any], canUseWebAudio = canUseWebAudio.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isMP3supported = isMP3supported.asInstanceOf[js.Any], isOGGsupported = isOGGsupported.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), masterGain = masterGain.asInstanceOf[js.Any], onAudioLockedObservable = onAudioLockedObservable.asInstanceOf[js.Any], onAudioUnlockedObservable = onAudioUnlockedObservable.asInstanceOf[js.Any], unlock = js.Any.fromFunction0(unlock), unlocked = unlocked.asInstanceOf[js.Any], useCustomUnlockedButton = useCustomUnlockedButton.asInstanceOf[js.Any])
    if (audioContext != null) __obj.updateDynamic("audioContext")(audioContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEngine]
  }
}

