package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundTrack extends js.Object {
  var _connectedAnalyser: js.Any
  var _initializeSoundTrackAudioGraph: js.Any
  var _isInitialized: js.Any
  var _options: js.Any
  var _outputAudioNode: js.Any
  var _scene: js.Any
  /**
    * The unique identifier of the sound track in the scene.
    */
  var id: Double
  /**
    * The list of sounds included in the sound track.
    */
  var soundCollection: js.Array[Sound]
  /**
    * Adds a sound to this sound track
    * @param sound define the cound to add
    * @ignoreNaming
    */
  def AddSound(sound: Sound): Unit
  /**
    * Removes a sound to this sound track
    * @param sound define the cound to remove
    * @ignoreNaming
    */
  def RemoveSound(sound: Sound): Unit
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit
  /**
    * Release the sound track and its associated resources
    */
  def dispose(): Unit
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  def setVolume(newVolume: Double): Unit
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToEqualPower(): Unit
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToHRTF(): Unit
}

object SoundTrack {
  @scala.inline
  def apply(
    AddSound: Sound => Unit,
    RemoveSound: Sound => Unit,
    _connectedAnalyser: js.Any,
    _initializeSoundTrackAudioGraph: js.Any,
    _isInitialized: js.Any,
    _options: js.Any,
    _outputAudioNode: js.Any,
    _scene: js.Any,
    connectToAnalyser: Analyser => Unit,
    dispose: () => Unit,
    id: Double,
    setVolume: Double => Unit,
    soundCollection: js.Array[Sound],
    switchPanningModelToEqualPower: () => Unit,
    switchPanningModelToHRTF: () => Unit
  ): SoundTrack = {
    val __obj = js.Dynamic.literal(AddSound = js.Any.fromFunction1(AddSound), RemoveSound = js.Any.fromFunction1(RemoveSound), _connectedAnalyser = _connectedAnalyser.asInstanceOf[js.Any], _initializeSoundTrackAudioGraph = _initializeSoundTrackAudioGraph.asInstanceOf[js.Any], _isInitialized = _isInitialized.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _outputAudioNode = _outputAudioNode.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], connectToAnalyser = js.Any.fromFunction1(connectToAnalyser), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], setVolume = js.Any.fromFunction1(setVolume), soundCollection = soundCollection.asInstanceOf[js.Any], switchPanningModelToEqualPower = js.Any.fromFunction0(switchPanningModelToEqualPower), switchPanningModelToHRTF = js.Any.fromFunction0(switchPanningModelToHRTF))
    __obj.asInstanceOf[SoundTrack]
  }
}

