package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundTrack extends StObject {
  
  /* private */ var _connectedAnalyser: js.Any
  
  /* private */ var _initializeSoundTrackAudioGraph: js.Any
  
  /* private */ var _isInitialized: js.Any
  
  /* private */ var _options: js.Any
  
  /* private */ var _outputAudioNode: js.Any
  
  /* private */ var _scene: js.Any
  
  /**
    * Adds a sound to this sound track
    * @param sound define the cound to add
    * @ignoreNaming
    */
  def addSound(sound: Sound): Unit
  
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit
  
  /**
    * Release the sound track and its associated resources
    */
  def dispose(): Unit
  
  /**
    * The unique identifier of the sound track in the scene.
    */
  var id: Double
  
  /**
    * Removes a sound to this sound track
    * @param sound define the cound to remove
    * @ignoreNaming
    */
  def removeSound(sound: Sound): Unit
  
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  def setVolume(newVolume: Double): Unit
  
  /**
    * The list of sounds included in the sound track.
    */
  var soundCollection: js.Array[Sound]
  
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToEqualPower(): Unit
  
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToHRTF(): Unit
}
object SoundTrack {
  
  inline def apply(
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
  
  extension [Self <: SoundTrack](x: Self) {
    
    inline def setAddSound(value: Sound => Unit): Self = StObject.set(x, "addSound", js.Any.fromFunction1(value))
    
    inline def setConnectToAnalyser(value: Analyser => Unit): Self = StObject.set(x, "connectToAnalyser", js.Any.fromFunction1(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRemoveSound(value: Sound => Unit): Self = StObject.set(x, "removeSound", js.Any.fromFunction1(value))
    
    inline def setSetVolume(value: Double => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    
    inline def setSoundCollection(value: js.Array[Sound]): Self = StObject.set(x, "soundCollection", value.asInstanceOf[js.Any])
    
    inline def setSoundCollectionVarargs(value: Sound*): Self = StObject.set(x, "soundCollection", js.Array(value :_*))
    
    inline def setSwitchPanningModelToEqualPower(value: () => Unit): Self = StObject.set(x, "switchPanningModelToEqualPower", js.Any.fromFunction0(value))
    
    inline def setSwitchPanningModelToHRTF(value: () => Unit): Self = StObject.set(x, "switchPanningModelToHRTF", js.Any.fromFunction0(value))
    
    inline def set_connectedAnalyser(value: js.Any): Self = StObject.set(x, "_connectedAnalyser", value.asInstanceOf[js.Any])
    
    inline def set_initializeSoundTrackAudioGraph(value: js.Any): Self = StObject.set(x, "_initializeSoundTrackAudioGraph", value.asInstanceOf[js.Any])
    
    inline def set_isInitialized(value: js.Any): Self = StObject.set(x, "_isInitialized", value.asInstanceOf[js.Any])
    
    inline def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    inline def set_outputAudioNode(value: js.Any): Self = StObject.set(x, "_outputAudioNode", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: js.Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
