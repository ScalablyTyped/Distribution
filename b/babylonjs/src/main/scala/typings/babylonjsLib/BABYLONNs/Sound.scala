package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a sound that can be played in the application.
     * The sound can either be an ambient track or a simple sound played in reaction to a user action.
     * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
     */
@JSGlobal("BABYLON.Sound")
@js.native
class Sound protected () extends js.Object {
  /**
          * Create a sound and attach it to a scene
          * @param name Name of your sound
          * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams
          * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
          * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
          */
  def this(name: java.lang.String, urlOrArrayBuffer: js.Any, scene: Scene) = this()
  /**
          * Create a sound and attach it to a scene
          * @param name Name of your sound
          * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams
          * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
          * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
          */
  def this(name: java.lang.String, urlOrArrayBuffer: js.Any, scene: Scene, readyToPlayCallback: Nullable[js.Function0[scala.Unit]]) = this()
  /**
          * Create a sound and attach it to a scene
          * @param name Name of your sound
          * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams
          * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
          * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
          */
  def this(name: java.lang.String, urlOrArrayBuffer: js.Any, scene: Scene, readyToPlayCallback: Nullable[js.Function0[scala.Unit]], options: js.Any) = this()
  var _audioBuffer: js.Any = js.native
  var _coneInnerAngle: js.Any = js.native
  var _coneOuterAngle: js.Any = js.native
  var _coneOuterGain: js.Any = js.native
  var _connectedMesh: js.Any = js.native
  var _createSpatialParameters: js.Any = js.native
  var _customAttenuationFunction: js.Any = js.native
  var _htmlAudioElement: js.Any = js.native
  var _inputAudioNode: js.Any = js.native
  var _isDirectional: js.Any = js.native
  var _isOutputConnected: js.Any = js.native
  var _isReadyToPlay: js.Any = js.native
  var _localDirection: js.Any = js.native
  var _onRegisterAfterWorldMatrixUpdate: js.Any = js.native
  var _onended: js.Any = js.native
  var _outputAudioNode: js.Any = js.native
  var _panningModel: js.Any = js.native
  var _playbackRate: js.Any = js.native
  var _position: js.Any = js.native
  /** @hidden */
  var _positionInEmitterSpace: scala.Boolean = js.native
  var _readyToPlayCallback: js.Any = js.native
  var _registerFunc: js.Any = js.native
  var _scene: js.Any = js.native
  var _soundGain: js.Any = js.native
  var _soundLoaded: js.Any = js.native
  var _soundPanner: js.Any = js.native
  var _soundSource: js.Any = js.native
  var _startOffset: js.Any = js.native
  var _startTime: js.Any = js.native
  var _streaming: js.Any = js.native
  var _streamingSource: js.Any = js.native
  var _switchPanningModel: js.Any = js.native
  var _updateDirection: js.Any = js.native
  var _updateSpatialParameters: js.Any = js.native
  var _urlType: js.Any = js.native
  var _volume: js.Any = js.native
  /**
           * Does the sound autoplay once loaded.
           */
  var autoplay: scala.Boolean = js.native
  /**
           * Gets or sets the inner angle for the directional cone.
           */
  /**
          * Gets or sets the inner angle for the directional cone.
          */
  var directionalConeInnerAngle: scala.Double = js.native
  /**
           * Gets or sets the outer angle for the directional cone.
           */
  /**
          * Gets or sets the outer angle for the directional cone.
          */
  var directionalConeOuterAngle: scala.Double = js.native
  /**
           * Define the distance attenuation model the sound will follow.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  var distanceModel: java.lang.String = js.native
  /**
           * Is this sound currently paused.
           */
  var isPaused: scala.Boolean = js.native
  /**
           * Is this sound currently played.
           */
  var isPlaying: scala.Boolean = js.native
  /**
           * Does the sound loop after it finishes playing once.
           */
  var loop: scala.Boolean = js.native
  /**
           * Define the max distance the sound should be heard (intensity just became 0 at this point).
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  var maxDistance: scala.Double = js.native
  /**
           * The name of the sound in the scene.
           */
  var name: java.lang.String = js.native
  /**
           * Observable event when the current playing sound finishes.
           */
  var onEndedObservable: Observable[Sound] = js.native
  /**
           * Define the reference distance the sound should be heard perfectly.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  var refDistance: scala.Double = js.native
  /**
           * Define the roll off factor of spatial sounds.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  var rolloffFactor: scala.Double = js.native
  /**
           * The sound track id this sound belongs to.
           */
  var soundTrackId: scala.Double = js.native
  /**
           * Does this sound enables spatial sound.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  var spatialSound: scala.Boolean = js.native
  /**
           * Does the sound use a custom attenuation curve to simulate the falloff
           * happening when the source gets further away from the camera.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-your-own-custom-attenuation-function
           */
  var useCustomAttenuation: scala.Boolean = js.native
  /**
           * Attach the sound to a dedicated mesh
           * @param meshToConnectTo The mesh to connect the sound with
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#attaching-a-sound-to-a-mesh
           */
  def attachToMesh(meshToConnectTo: AbstractMesh): scala.Unit = js.native
  /**
           * Connect this sound to a sound track audio node like gain...
           * @param soundTrackAudioNode the sound track audio node to connect to
           */
  def connectToSoundTrackAudioNode(soundTrackAudioNode: stdLib.AudioNode): scala.Unit = js.native
  /**
           * Detach the sound from the previously attached mesh
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#attaching-a-sound-to-a-mesh
           */
  def detachFromMesh(): scala.Unit = js.native
  /**
           * Release the sound and its associated resources
           */
  def dispose(): scala.Unit = js.native
  /**
           * Gets the current underlying audio buffer containing the data
           * @returns the audio buffer
           */
  def getAudioBuffer(): Nullable[stdLib.AudioBuffer] = js.native
  /**
           * Gets the volume of the sound.
           * @returns the volume of the sound
           */
  def getVolume(): scala.Double = js.native
  /**
           * Gets if the sounds is ready to be played or not.
           * @returns true if ready, otherwise false
           */
  def isReady(): scala.Boolean = js.native
  /**
           * @hidden
           * Back Compat
           **/
  def onended(): js.Any = js.native
  /**
           * Put the sound in pause
           */
  def pause(): scala.Unit = js.native
  /**
          * Play the sound
          * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
          * @param offset (optional) Start the sound setting it at a specific time
          */
  def play(): scala.Unit = js.native
  /**
          * Play the sound
          * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
          * @param offset (optional) Start the sound setting it at a specific time
          */
  def play(time: scala.Double): scala.Unit = js.native
  /**
          * Play the sound
          * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
          * @param offset (optional) Start the sound setting it at a specific time
          */
  def play(time: scala.Double, offset: scala.Double): scala.Unit = js.native
  /**
           * Serializes the Sound in a JSON representation
           * @returns the JSON representation of the sound
           */
  def serialize(): js.Any = js.native
  /**
           * Sets a new custom attenuation function for the sound.
           * @param callback Defines the function used for the attenuation
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-your-own-custom-attenuation-function
           */
  def setAttenuationFunction(
    callback: js.Function5[
      /* currentVolume */ scala.Double, 
      /* currentDistance */ scala.Double, 
      /* maxDistance */ scala.Double, 
      /* refDistance */ scala.Double, 
      /* rolloffFactor */ scala.Double, 
      scala.Double
    ]
  ): scala.Unit = js.native
  /**
           * Sets the data of the sound from an audiobuffer
           * @param audioBuffer The audioBuffer containing the data
           */
  def setAudioBuffer(audioBuffer: stdLib.AudioBuffer): scala.Unit = js.native
  /**
          * Transform this sound into a directional source
          * @param coneInnerAngle Size of the inner cone in degree
          * @param coneOuterAngle Size of the outer cone in degree
          * @param coneOuterGain Volume of the sound outside the outer cone (between 0.0 and 1.0)
          */
  def setDirectionalCone(coneInnerAngle: scala.Double, coneOuterAngle: scala.Double, coneOuterGain: scala.Double): scala.Unit = js.native
  /**
           * Sets the local direction of the emitter if spatial sound is enabled
           * @param newLocalDirection Defines the new local direction
           */
  def setLocalDirectionToMesh(newLocalDirection: Vector3): scala.Unit = js.native
  /**
           * Set the sound play back rate
           * @param newPlaybackRate Define the playback rate the sound should be played at
           */
  def setPlaybackRate(newPlaybackRate: scala.Double): scala.Unit = js.native
  /**
           * Sets the position of the emitter if spatial sound is enabled
           * @param newPosition Defines the new posisiton
           */
  def setPosition(newPosition: Vector3): scala.Unit = js.native
  /**
           * Sets a dedicated volume for this sounds
           * @param newVolume Define the new volume of the sound
           * @param time Define in how long the sound should be at this value
           */
  def setVolume(newVolume: scala.Double): scala.Unit = js.native
  /**
           * Sets a dedicated volume for this sounds
           * @param newVolume Define the new volume of the sound
           * @param time Define in how long the sound should be at this value
           */
  def setVolume(newVolume: scala.Double, time: scala.Double): scala.Unit = js.native
  /**
          * Stop the sound
          * @param time (optional) Stop the sound after X seconds. Stop immediately (0) by default.
          */
  def stop(): scala.Unit = js.native
  /**
          * Stop the sound
          * @param time (optional) Stop the sound after X seconds. Stop immediately (0) by default.
          */
  def stop(time: scala.Double): scala.Unit = js.native
  /**
           * Switch the panning model to Equal Power:
           * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  def switchPanningModelToEqualPower(): scala.Unit = js.native
  /**
           * Switch the panning model to HRTF:
           * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
           * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
           */
  def switchPanningModelToHRTF(): scala.Unit = js.native
  /** @hidden */
  def updateDistanceFromListener(): scala.Unit = js.native
  /**
           * Updates the current sounds options such as maxdistance, loop...
           * @param options A JSON object containing values named as the object properties
           */
  def updateOptions(options: js.Any): scala.Unit = js.native
}

/**
     * Defines a sound that can be played in the application.
     * The sound can either be an ambient track or a simple sound played in reaction to a user action.
     * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
     */
@JSGlobal("BABYLON.Sound")
@js.native
object Sound extends js.Object {
  /**
           * Parse a JSON representation of a sound to innstantiate in a given scene
           * @param parsedSound Define the JSON representation of the sound (usually coming from the serialize method)
           * @param scene Define the scene the new parsed sound should be created in
           * @param rootUrl Define the rooturl of the load in case we need to fetch relative dependencies
           * @param sourceSound Define a cound place holder if do not need to instantiate a new one
           * @returns the newly parsed sound
           */
  def Parse(parsedSound: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Sound = js.native
  /**
           * Parse a JSON representation of a sound to innstantiate in a given scene
           * @param parsedSound Define the JSON representation of the sound (usually coming from the serialize method)
           * @param scene Define the scene the new parsed sound should be created in
           * @param rootUrl Define the rooturl of the load in case we need to fetch relative dependencies
           * @param sourceSound Define a cound place holder if do not need to instantiate a new one
           * @returns the newly parsed sound
           */
  def Parse(
    parsedSound: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String,
    sourceSound: babylonjsLib.BABYLONNs.Sound
  ): babylonjsLib.BABYLONNs.Sound = js.native
}

