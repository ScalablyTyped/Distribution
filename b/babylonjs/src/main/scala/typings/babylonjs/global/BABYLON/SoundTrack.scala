package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISoundTrackOptions
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SoundTrack")
@js.native
/**
  * Creates a new sound track.
  * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
  * @param scene Define the scene the sound track belongs to
  * @param options
  */
open class SoundTrack ()
  extends StObject
     with typings.babylonjs.BABYLON.SoundTrack {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(scene: Unit, options: ISoundTrackOptions) = this()
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene], options: ISoundTrackOptions) = this()
  
  /* private */ /* CompleteClass */
  var _connectedAnalyser: Any = js.native
  
  /* private */ /* CompleteClass */
  var _initializeSoundTrackAudioGraph: Any = js.native
  
  /* private */ /* CompleteClass */
  var _isInitialized: Any = js.native
  
  /* private */ /* CompleteClass */
  var _options: Any = js.native
  
  /* private */ /* CompleteClass */
  var _outputAudioNode: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /**
    * Adds a sound to this sound track
    * @param sound define the sound to add
    * @ignoreNaming
    */
  /* CompleteClass */
  override def addSound(sound: typings.babylonjs.BABYLON.Sound): Unit = js.native
  
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchronization between the sounds/music and your visualization (VuMeter for instance).
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
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
    * The unique identifier of the sound track in the scene.
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * Removes a sound to this sound track
    * @param sound define the sound to remove
    * @ignoreNaming
    */
  /* CompleteClass */
  override def removeSound(sound: typings.babylonjs.BABYLON.Sound): Unit = js.native
  
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  /* CompleteClass */
  override def setVolume(newVolume: Double): Unit = js.native
  
  /**
    * The list of sounds included in the sound track.
    */
  /* CompleteClass */
  var soundCollection: js.Array[typings.babylonjs.BABYLON.Sound] = js.native
  
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  /* CompleteClass */
  override def switchPanningModelToEqualPower(): Unit = js.native
  
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  /* CompleteClass */
  override def switchPanningModelToHRTF(): Unit = js.native
}
