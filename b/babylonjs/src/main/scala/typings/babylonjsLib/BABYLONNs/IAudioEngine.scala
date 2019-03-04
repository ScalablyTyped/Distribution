package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents an audio engine and it is responsible
  * to play, synchronize and analyse sounds throughout the application.
  * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
  */
trait IAudioEngine extends IDisposable {
  /**
    * Defines if Babylon should emit a warning if WebAudio is not supported.
    * @ignoreNaming
    */
  var WarnedWebAudioUnsupported: scala.Boolean
  /**
    * Gets the current AudioContext if available.
    */
  val audioContext: Nullable[stdLib.AudioContext]
  /**
    * Gets whether the current host supports Web Audio and thus could create AudioContexts.
    */
  val canUseWebAudio: scala.Boolean
  /**
    * Gets whether or not mp3 are supported by your browser.
    */
  val isMP3supported: scala.Boolean
  /**
    * Gets whether or not ogg are supported by your browser.
    */
  val isOGGsupported: scala.Boolean
  /**
    * The master gain node defines the global audio volume of your audio engine.
    */
  val masterGain: stdLib.GainNode
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
  val unlocked: scala.Boolean
  /**
    * Defines if the audio engine relies on a custom unlocked button.
    * In this case, the embedded button will not be displayed.
    */
  var useCustomUnlockedButton: scala.Boolean
  /**
    * Flags the audio engine in Locked state.
    * This happens due to new browser policies preventing audio to autoplay.
    */
  def lock(): scala.Unit
  /**
    * Unlocks the audio engine once a user action has been done on the dom.
    * This is helpful to resume play once browser policies have been satisfied.
    */
  def unlock(): scala.Unit
}

object IAudioEngine {
  @scala.inline
  def apply(
    WarnedWebAudioUnsupported: scala.Boolean,
    audioContext: Nullable[stdLib.AudioContext],
    canUseWebAudio: scala.Boolean,
    dispose: js.Function0[scala.Unit],
    isMP3supported: scala.Boolean,
    isOGGsupported: scala.Boolean,
    lock: js.Function0[scala.Unit],
    masterGain: stdLib.GainNode,
    onAudioLockedObservable: Observable[AudioEngine],
    onAudioUnlockedObservable: Observable[AudioEngine],
    unlock: js.Function0[scala.Unit],
    unlocked: scala.Boolean,
    useCustomUnlockedButton: scala.Boolean
  ): IAudioEngine = {
    val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported, audioContext = audioContext.asInstanceOf[js.Any], canUseWebAudio = canUseWebAudio, dispose = dispose, isMP3supported = isMP3supported, isOGGsupported = isOGGsupported, lock = lock, masterGain = masterGain, onAudioLockedObservable = onAudioLockedObservable, onAudioUnlockedObservable = onAudioUnlockedObservable, unlock = unlock, unlocked = unlocked, useCustomUnlockedButton = useCustomUnlockedButton)
  
    __obj.asInstanceOf[IAudioEngine]
  }
}

