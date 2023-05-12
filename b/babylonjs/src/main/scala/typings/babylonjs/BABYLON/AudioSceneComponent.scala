package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSceneComponent
  extends StObject
     with ISceneSerializableComponent {
  
  /* private */ var _afterRender: Any = js.native
  
  /* private */ var _audioEnabled: Any = js.native
  
  /* private */ var _cachedCameraDirection: Any = js.native
  
  /* private */ var _cachedCameraPosition: Any = js.native
  
  /* private */ var _cameraDirectionTemp: Any = js.native
  
  /* private */ var _headphone: Any = js.native
  
  /* private */ var _invertMatrixTemp: Any = js.native
  
  /* private */ var _lastCheck: Any = js.native
  
  /**
    * Gets whether audio is enabled or not.
    * Please use related enable/disable method to switch state.
    */
  def audioEnabled: Boolean = js.native
  
  /**
    * Gets or Sets a custom listener position for all sounds in the scene
    * By default, this is the position of the first active camera
    */
  var audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
  
  /**
    * Gets or Sets a custom listener rotation for all sounds in the scene
    * By default, this is the rotation of the first active camera
    */
  var audioListenerRotationProvider: Nullable[js.Function0[Vector3]] = js.native
  
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
    * Gets whether audio is outputting to headphone or not.
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
