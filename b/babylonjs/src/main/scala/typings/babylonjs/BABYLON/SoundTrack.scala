package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundTrack extends js.Object {
  
  var _connectedAnalyser: js.Any = js.native
  
  var _initializeSoundTrackAudioGraph: js.Any = js.native
  
  var _isInitialized: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _outputAudioNode: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  /**
    * Adds a sound to this sound track
    * @param sound define the cound to add
    * @ignoreNaming
    */
  def addSound(sound: Sound): Unit = js.native
  
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit = js.native
  
  /**
    * Release the sound track and its associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * The unique identifier of the sound track in the scene.
    */
  var id: Double = js.native
  
  /**
    * Removes a sound to this sound track
    * @param sound define the cound to remove
    * @ignoreNaming
    */
  def removeSound(sound: Sound): Unit = js.native
  
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  def setVolume(newVolume: Double): Unit = js.native
  
  /**
    * The list of sounds included in the sound track.
    */
  var soundCollection: js.Array[Sound] = js.native
  
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToEqualPower(): Unit = js.native
  
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToHRTF(): Unit = js.native
}
object SoundTrack {
  
  @scala.inline
  def apply(
    _connectedAnalyser: js.Any,
    _initializeSoundTrackAudioGraph: js.Any,
    _isInitialized: js.Any,
    _options: js.Any,
    _outputAudioNode: js.Any,
    _scene: js.Any,
    addSound: Sound => Unit,
    connectToAnalyser: Analyser => Unit,
    dispose: () => Unit,
    id: Double,
    removeSound: Sound => Unit,
    setVolume: Double => Unit,
    soundCollection: js.Array[Sound],
    switchPanningModelToEqualPower: () => Unit,
    switchPanningModelToHRTF: () => Unit
  ): SoundTrack = {
    val __obj = js.Dynamic.literal(_connectedAnalyser = _connectedAnalyser.asInstanceOf[js.Any], _initializeSoundTrackAudioGraph = _initializeSoundTrackAudioGraph.asInstanceOf[js.Any], _isInitialized = _isInitialized.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _outputAudioNode = _outputAudioNode.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], addSound = js.Any.fromFunction1(addSound), connectToAnalyser = js.Any.fromFunction1(connectToAnalyser), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], removeSound = js.Any.fromFunction1(removeSound), setVolume = js.Any.fromFunction1(setVolume), soundCollection = soundCollection.asInstanceOf[js.Any], switchPanningModelToEqualPower = js.Any.fromFunction0(switchPanningModelToEqualPower), switchPanningModelToHRTF = js.Any.fromFunction0(switchPanningModelToHRTF))
    __obj.asInstanceOf[SoundTrack]
  }
  
  @scala.inline
  implicit class SoundTrackOps[Self <: SoundTrack] (val x: Self) extends AnyVal {
    
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
    def set_connectedAnalyser(value: js.Any): Self = this.set("_connectedAnalyser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initializeSoundTrackAudioGraph(value: js.Any): Self = this.set("_initializeSoundTrackAudioGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isInitialized(value: js.Any): Self = this.set("_isInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_options(value: js.Any): Self = this.set("_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_outputAudioNode(value: js.Any): Self = this.set("_outputAudioNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scene(value: js.Any): Self = this.set("_scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSound(value: Sound => Unit): Self = this.set("addSound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnectToAnalyser(value: Analyser => Unit): Self = this.set("connectToAnalyser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSound(value: Sound => Unit): Self = this.set("removeSound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVolume(value: Double => Unit): Self = this.set("setVolume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSoundCollectionVarargs(value: Sound*): Self = this.set("soundCollection", js.Array(value :_*))
    
    @scala.inline
    def setSoundCollection(value: js.Array[Sound]): Self = this.set("soundCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchPanningModelToEqualPower(value: () => Unit): Self = this.set("switchPanningModelToEqualPower", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSwitchPanningModelToHRTF(value: () => Unit): Self = this.set("switchPanningModelToHRTF", js.Any.fromFunction0(value))
  }
}
