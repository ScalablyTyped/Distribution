package typings.babylonjs.audioSceneComponentMod.babylonjsSceneAugmentingMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.soundMod.Sound
import typings.babylonjs.soundTrackMod.SoundTrack
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /**
    * @hidden
    * Backing field
    */
  var _mainSoundTrack: SoundTrack
  /**
    * Gets or sets if audio support is enabled
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEnabled: Boolean
  /**
    * Gets or sets custom audio listener position provider
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioListenerPositionProvider: Nullable[js.Function0[Vector3]]
  /**
    * Gets or sets a refresh rate when using 3D audio positioning
    */
  var audioPositioningRefreshRate: Double
  /**
    * Gets or sets if audio will be output to headphones
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var headphone: Boolean
  /**
    * The main sound track played by the scene.
    * It cotains your primary collection of sounds.
    */
  var mainSoundTrack: SoundTrack
  /**
    * The list of sound tracks added to the scene
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var soundTracks: Nullable[js.Array[SoundTrack]]
  /**
    * Gets a sound using a given name
    * @param name defines the name to search for
    * @return the found sound or null if not found at all.
    */
  def getSoundByName(name: String): Nullable[Sound]
}

object Scene {
  @scala.inline
  def apply(
    _mainSoundTrack: SoundTrack,
    audioEnabled: Boolean,
    audioPositioningRefreshRate: Double,
    getSoundByName: String => Nullable[Sound],
    headphone: Boolean,
    mainSoundTrack: SoundTrack,
    audioListenerPositionProvider: () => Vector3 = null,
    soundTracks: Nullable[js.Array[SoundTrack]] = null
  ): Scene = {
    val __obj = js.Dynamic.literal(_mainSoundTrack = _mainSoundTrack.asInstanceOf[js.Any], audioEnabled = audioEnabled.asInstanceOf[js.Any], audioPositioningRefreshRate = audioPositioningRefreshRate.asInstanceOf[js.Any], getSoundByName = js.Any.fromFunction1(getSoundByName), headphone = headphone.asInstanceOf[js.Any], mainSoundTrack = mainSoundTrack.asInstanceOf[js.Any])
    if (audioListenerPositionProvider != null) __obj.updateDynamic("audioListenerPositionProvider")(js.Any.fromFunction0(audioListenerPositionProvider))
    if (soundTracks != null) __obj.updateDynamic("soundTracks")(soundTracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

