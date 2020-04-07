package typings.babylonjs.soundTrackMod

import typings.babylonjs.analyserMod.Analyser
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.soundMod.Sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Audio/soundTrack", "SoundTrack")
@js.native
class SoundTrack protected () extends js.Object {
  /**
    * Creates a new sound track.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: ISoundTrackOptions) = this()
  var _connectedAnalyser: js.Any = js.native
  var _initializeSoundTrackAudioGraph: js.Any = js.native
  var _isInitialized: js.Any = js.native
  var _options: js.Any = js.native
  var _outputAudioNode: js.Any = js.native
  var _scene: js.Any = js.native
  /**
    * The unique identifier of the sound track in the scene.
    */
  var id: Double = js.native
  /**
    * The list of sounds included in the sound track.
    */
  var soundCollection: js.Array[Sound] = js.native
  /**
    * Adds a sound to this sound track
    * @param sound define the cound to add
    * @ignoreNaming
    */
  def AddSound(sound: Sound): Unit = js.native
  /**
    * Removes a sound to this sound track
    * @param sound define the cound to remove
    * @ignoreNaming
    */
  def RemoveSound(sound: Sound): Unit = js.native
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit = js.native
  /**
    * Release the sound track and its associated resources
    */
  def dispose(): Unit = js.native
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  def setVolume(newVolume: Double): Unit = js.native
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToEqualPower(): Unit = js.native
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToHRTF(): Unit = js.native
}

