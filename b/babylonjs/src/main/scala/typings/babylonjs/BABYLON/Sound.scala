package typings.babylonjs.BABYLON

import typings.std.AudioBuffer
import typings.std.AudioBufferSourceNode
import typings.std.AudioNode
import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sound extends StObject {
  
  /* private */ var _audioBuffer: Any = js.native
  
  /* private */ var _audioBufferLoaded: Any = js.native
  
  /* private */ var _coneInnerAngle: Any = js.native
  
  /* private */ var _coneOuterAngle: Any = js.native
  
  /* private */ var _coneOuterGain: Any = js.native
  
  /* private */ var _connectedTransformNode: Any = js.native
  
  /* private */ var _createSpatialParameters: Any = js.native
  
  /* private */ var _currentTime: Any = js.native
  
  /* private */ var _customAttenuationFunction: Any = js.native
  
  /* private */ var _htmlAudioElement: Any = js.native
  
  /* private */ var _inputAudioNode: Any = js.native
  
  /* private */ var _isDirectional: Any = js.native
  
  /* private */ var _isOutputConnected: Any = js.native
  
  /* private */ var _isReadyToPlay: Any = js.native
  
  /* private */ var _length: Any = js.native
  
  /* private */ var _localDirection: Any = js.native
  
  /* private */ var _loop: Any = js.native
  
  /* private */ var _offset: Any = js.native
  
  /* private */ var _onRegisterAfterWorldMatrixUpdate: Any = js.native
  
  /* private */ var _onended: Any = js.native
  
  /* private */ var _outputAudioNode: Any = js.native
  
  /* private */ var _panningModel: Any = js.native
  
  /* private */ var _playbackRate: Any = js.native
  
  /* private */ var _position: Any = js.native
  
  /* private */ var _readyToPlayCallback: Any = js.native
  
  /* private */ var _registerFunc: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _setOffset: Any = js.native
  
  /* private */ var _soundGain: Any = js.native
  
  /* private */ var _soundLoaded: Any = js.native
  
  /* private */ var _soundPanner: Any = js.native
  
  /* private */ var _soundSource: Any = js.native
  
  /* private */ var _spatialSound: Any = js.native
  
  /* private */ var _startTime: Any = js.native
  
  /* private */ var _streaming: Any = js.native
  
  /* private */ var _streamingSource: Any = js.native
  
  /* private */ var _switchPanningModel: Any = js.native
  
  /* private */ var _updateDirection: Any = js.native
  
  /* private */ var _updateSpatialParameters: Any = js.native
  
  /* private */ var _urlType: Any = js.native
  
  /* private */ var _volume: Any = js.native
  
  /**
    * Attach the sound to a dedicated mesh
    * @param transformNode The transform node to connect the sound with
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#attaching-a-sound-to-a-mesh
    */
  def attachToMesh(transformNode: TransformNode): Unit = js.native
  
  /**
    * Does the sound autoplay once loaded.
    */
  var autoplay: Boolean = js.native
  
  /**
    * Connect this sound to a sound track audio node like gain...
    * @param soundTrackAudioNode the sound track audio node to connect to
    */
  def connectToSoundTrackAudioNode(soundTrackAudioNode: AudioNode): Unit = js.native
  
  /**
    * Gets the current time for the sound.
    */
  def currentTime: Double = js.native
  
  /**
    * Detach the sound from the previously attached mesh
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#attaching-a-sound-to-a-mesh
    */
  def detachFromMesh(): Unit = js.native
  
  /**
    * Gets or sets the inner angle for the directional cone.
    */
  def directionalConeInnerAngle: Double = js.native
  /**
    * Gets or sets the inner angle for the directional cone.
    */
  def directionalConeInnerAngle_=(value: Double): Unit = js.native
  
  /**
    * Gets or sets the outer angle for the directional cone.
    */
  def directionalConeOuterAngle: Double = js.native
  /**
    * Gets or sets the outer angle for the directional cone.
    */
  def directionalConeOuterAngle_=(value: Double): Unit = js.native
  
  /**
    * Release the sound and its associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Define the distance attenuation model the sound will follow.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  var distanceModel: String = js.native
  
  /**
    * Gets the current underlying audio buffer containing the data
    * @returns the audio buffer
    */
  def getAudioBuffer(): Nullable[AudioBuffer] = js.native
  
  /**
    * Get the current class name.
    * @returns current class name
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the sound play back rate.
    * @returns the  play back rate of the sound
    */
  def getPlaybackRate(): Double = js.native
  
  /**
    * Gets the WebAudio GainNode, gives you precise control over the gain of instances of this Sound.
    * @returns the gain node
    */
  def getSoundGain(): Nullable[GainNode] = js.native
  
  /**
    * Gets the WebAudio AudioBufferSourceNode, lets you keep track of and stop instances of this Sound.
    * @returns the source node
    */
  def getSoundSource(): Nullable[AudioBufferSourceNode] = js.native
  
  /**
    * Gets the volume of the sound.
    * @returns the volume of the sound
    */
  def getVolume(): Double = js.native
  
  /**
    * Is this sound currently paused.
    */
  var isPaused: Boolean = js.native
  
  /**
    * Is this sound currently played.
    */
  var isPlaying: Boolean = js.native
  
  /**
    * Gets if the sounds is ready to be played or not.
    * @returns true if ready, otherwise false
    */
  def isReady(): Boolean = js.native
  
  /**
    * Does the sound loop after it finishes playing once.
    */
  def loop: Boolean = js.native
  def loop_=(value: Boolean): Unit = js.native
  
  /**
    * Define the max distance the sound should be heard (intensity just became 0 at this point).
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  var maxDistance: Double = js.native
  
  /**
    * Gets or sets an object used to store user defined information for the sound.
    */
  var metadata: Any = js.native
  
  /**
    * The name of the sound in the scene.
    */
  var name: String = js.native
  
  /**
    * Observable event when the current playing sound finishes.
    */
  var onEndedObservable: Observable[Sound] = js.native
  
  /**
    * @internal
    * Back Compat
    **/
  def onended(): Any = js.native
  
  /**
    * Put the sound in pause
    */
  def pause(): Unit = js.native
  
  /**
    * Play the sound
    * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
    * @param offset (optional) Start the sound at a specific time in seconds
    * @param length (optional) Sound duration (in seconds)
    */
  def play(): Unit = js.native
  def play(time: Double): Unit = js.native
  def play(time: Double, offset: Double): Unit = js.native
  def play(time: Double, offset: Double, length: Double): Unit = js.native
  def play(time: Double, offset: Unit, length: Double): Unit = js.native
  def play(time: Unit, offset: Double): Unit = js.native
  def play(time: Unit, offset: Double, length: Double): Unit = js.native
  def play(time: Unit, offset: Unit, length: Double): Unit = js.native
  
  /**
    * Define the reference distance the sound should be heard perfectly.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  var refDistance: Double = js.native
  
  /**
    * Define the roll off factor of spatial sounds.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  var rolloffFactor: Double = js.native
  
  /**
    * Serializes the Sound in a JSON representation
    * @returns the JSON representation of the sound
    */
  def serialize(): Any = js.native
  
  /**
    * Sets a new custom attenuation function for the sound.
    * @param callback Defines the function used for the attenuation
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-your-own-custom-attenuation-function
    */
  def setAttenuationFunction(
    callback: js.Function5[
      /* currentVolume */ Double, 
      /* currentDistance */ Double, 
      /* maxDistance */ Double, 
      /* refDistance */ Double, 
      /* rolloffFactor */ Double, 
      Double
    ]
  ): Unit = js.native
  
  /**
    * Sets the data of the sound from an audiobuffer
    * @param audioBuffer The audioBuffer containing the data
    */
  def setAudioBuffer(audioBuffer: AudioBuffer): Unit = js.native
  
  /**
    * Transform this sound into a directional source
    * @param coneInnerAngle Size of the inner cone in degree
    * @param coneOuterAngle Size of the outer cone in degree
    * @param coneOuterGain Volume of the sound outside the outer cone (between 0.0 and 1.0)
    */
  def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): Unit = js.native
  
  /**
    * Sets the local direction of the emitter if spatial sound is enabled
    * @param newLocalDirection Defines the new local direction
    */
  def setLocalDirectionToMesh(newLocalDirection: Vector3): Unit = js.native
  
  /**
    * Set the sound play back rate
    * @param newPlaybackRate Define the playback rate the sound should be played at
    */
  def setPlaybackRate(newPlaybackRate: Double): Unit = js.native
  
  /**
    * Sets the position of the emitter if spatial sound is enabled
    * @param newPosition Defines the new position
    */
  def setPosition(newPosition: Vector3): Unit = js.native
  
  /**
    * Sets a dedicated volume for this sounds
    * @param newVolume Define the new volume of the sound
    * @param time Define time for gradual change to new volume
    */
  def setVolume(newVolume: Double): Unit = js.native
  def setVolume(newVolume: Double, time: Double): Unit = js.native
  
  /**
    * The sound track id this sound belongs to.
    */
  var soundTrackId: Double = js.native
  
  /**
    * Does this sound enables spatial sound.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  def spatialSound: Boolean = js.native
  /**
    * Does this sound enables spatial sound.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  def spatialSound_=(newValue: Boolean): Unit = js.native
  
  /**
    * Stop the sound
    * @param time (optional) Stop the sound after X seconds. Stop immediately (0) by default.
    */
  def stop(): Unit = js.native
  def stop(time: Double): Unit = js.native
  
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  def switchPanningModelToEqualPower(): Unit = js.native
  
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
    */
  def switchPanningModelToHRTF(): Unit = js.native
  
  /** @internal */
  def updateDistanceFromListener(): Unit = js.native
  
  /**
    * Updates the current sounds options such as maxdistance, loop...
    * @param options A JSON object containing values named as the object properties
    */
  def updateOptions(options: ISoundOptions): Unit = js.native
  
  /**
    * Does the sound use a custom attenuation curve to simulate the falloff
    * happening when the source gets further away from the camera.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-your-own-custom-attenuation-function
    */
  var useCustomAttenuation: Boolean = js.native
}
