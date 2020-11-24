package typings.babylonjs.audioSceneComponentMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent")
@js.native
class AudioSceneComponent protected () extends ISceneSerializableComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  
  var _afterRender: js.Any = js.native
  
  var _audioEnabled: js.Any = js.native
  
  var _audioListenerPositionProvider: js.Any = js.native
  
  var _cachedCameraDirection: js.Any = js.native
  
  var _cachedCameraPosition: js.Any = js.native
  
  var _headphone: js.Any = js.native
  
  var _lastCheck: js.Any = js.native
  
  /**
    * Gets whether audio is enabled or not.
    * Please use related enable/disable method to switch state.
    */
  def audioEnabled: Boolean = js.native
  
  /**
    * Gets the current audio listener position provider
    */
  def audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
  /**
    * Sets a custom listener position for all sounds in the scene
    * By default, this is the position of the first active camera
    */
  def audioListenerPositionProvider_=(value: Nullable[js.Function0[Vector3]]): Unit = js.native
  
  /**
    * Gets or sets a refresh rate when using 3D audio positioning
    */
  var audioPositioningRefreshRate: Double = js.native
  
  /**
    * Disables audio in the associated scene.
    */
  def disableAudio(): Unit = js.native
  
  /**
    * Enables audio in the associated scene.
    */
  def enableAudio(): Unit = js.native
  
  /**
    * Gets whether audio is outputing to headphone or not.
    * Please use the according Switch methods to change output.
    */
  def headphone: Boolean = js.native
  
  /**
    * Switch audio to headphone output.
    */
  def switchAudioModeForHeadphones(): Unit = js.native
  
  /**
    * Switch audio to normal speakers.
    */
  def switchAudioModeForNormalSpeakers(): Unit = js.native
}
/* static members */
@JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent")
@js.native
object AudioSceneComponent extends js.Object {
  
  var _CameraDirectionLH: js.Any = js.native
  
  var _CameraDirectionRH: js.Any = js.native
}
