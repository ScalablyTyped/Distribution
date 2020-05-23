package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISoundTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SoundTrack")
@js.native
class SoundTrack protected ()
  extends typings.babylonjs.BABYLON.SoundTrack {
  /**
    * Creates a new sound track.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, options: ISoundTrackOptions) = this()
  /* CompleteClass */
  override var _connectedAnalyser: js.Any = js.native
  /* CompleteClass */
  override var _initializeSoundTrackAudioGraph: js.Any = js.native
  /* CompleteClass */
  override var _isInitialized: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _outputAudioNode: js.Any = js.native
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /**
    * The unique identifier of the sound track in the scene.
    */
  /* CompleteClass */
  override var id: Double = js.native
  /**
    * The list of sounds included in the sound track.
    */
  /* CompleteClass */
  override var soundCollection: js.Array[typings.babylonjs.BABYLON.Sound] = js.native
  /**
    * Adds a sound to this sound track
    * @param sound define the cound to add
    * @ignoreNaming
    */
  /* CompleteClass */
  override def AddSound(sound: typings.babylonjs.BABYLON.Sound): Unit = js.native
  /**
    * Removes a sound to this sound track
    * @param sound define the cound to remove
    * @ignoreNaming
    */
  /* CompleteClass */
  override def RemoveSound(sound: typings.babylonjs.BABYLON.Sound): Unit = js.native
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  /* CompleteClass */
  override def connectToAnalyser(analyser: typings.babylonjs.BABYLON.Analyser): Unit = js.native
  /**
    * Release the sound track and its associated resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  /* CompleteClass */
  override def setVolume(newVolume: Double): Unit = js.native
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  /* CompleteClass */
  override def switchPanningModelToEqualPower(): Unit = js.native
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  /* CompleteClass */
  override def switchPanningModelToHRTF(): Unit = js.native
}

