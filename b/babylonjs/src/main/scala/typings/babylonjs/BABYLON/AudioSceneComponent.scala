package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSceneComponent extends ISceneSerializableComponent {
  
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
