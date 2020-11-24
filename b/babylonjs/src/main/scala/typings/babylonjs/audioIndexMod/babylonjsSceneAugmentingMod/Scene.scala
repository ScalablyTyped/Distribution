package typings.babylonjs.audioIndexMod.babylonjsSceneAugmentingMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.soundMod.Sound
import typings.babylonjs.soundTrackMod.SoundTrack
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene extends js.Object {
  
  /**
    * @hidden
    * Backing field
    */
  var _mainSoundTrack: SoundTrack = js.native
  
  /**
    * Gets or sets if audio support is enabled
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEnabled: Boolean = js.native
  
  /**
    * Gets or sets custom audio listener position provider
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
  
  /**
    * Gets or sets a refresh rate when using 3D audio positioning
    */
  var audioPositioningRefreshRate: Double = js.native
  
  /**
    * Gets a sound using a given name
    * @param name defines the name to search for
    * @return the found sound or null if not found at all.
    */
  def getSoundByName(name: String): Nullable[Sound] = js.native
  
  /**
    * Gets or sets if audio will be output to headphones
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var headphone: Boolean = js.native
  
  /**
    * The main sound track played by the scene.
    * It cotains your primary collection of sounds.
    */
  var mainSoundTrack: SoundTrack = js.native
  
  /**
    * The list of sound tracks added to the scene
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var soundTracks: Nullable[js.Array[SoundTrack]] = js.native
}
object Scene {
  
  @scala.inline
  def apply(
    _mainSoundTrack: SoundTrack,
    audioEnabled: Boolean,
    audioPositioningRefreshRate: Double,
    getSoundByName: String => Nullable[Sound],
    headphone: Boolean,
    mainSoundTrack: SoundTrack
  ): Scene = {
    val __obj = js.Dynamic.literal(_mainSoundTrack = _mainSoundTrack.asInstanceOf[js.Any], audioEnabled = audioEnabled.asInstanceOf[js.Any], audioPositioningRefreshRate = audioPositioningRefreshRate.asInstanceOf[js.Any], getSoundByName = js.Any.fromFunction1(getSoundByName), headphone = headphone.asInstanceOf[js.Any], mainSoundTrack = mainSoundTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    
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
    def set_mainSoundTrack(value: SoundTrack): Self = this.set("_mainSoundTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEnabled(value: Boolean): Self = this.set("audioEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioPositioningRefreshRate(value: Double): Self = this.set("audioPositioningRefreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSoundByName(value: String => Nullable[Sound]): Self = this.set("getSoundByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadphone(value: Boolean): Self = this.set("headphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainSoundTrack(value: SoundTrack): Self = this.set("mainSoundTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioListenerPositionProvider(value: () => Vector3): Self = this.set("audioListenerPositionProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAudioListenerPositionProviderNull: Self = this.set("audioListenerPositionProvider", null)
    
    @scala.inline
    def setSoundTracksVarargs(value: SoundTrack*): Self = this.set("soundTracks", js.Array(value :_*))
    
    @scala.inline
    def setSoundTracks(value: Nullable[js.Array[SoundTrack]]): Self = this.set("soundTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundTracksNull: Self = this.set("soundTracks", null)
  }
}
