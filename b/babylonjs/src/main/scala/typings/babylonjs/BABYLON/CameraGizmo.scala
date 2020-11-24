package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraGizmo extends Gizmo {
  
  var _camera: js.Any = js.native
  
  var _cameraLinesMesh: js.Any = js.native
  
  var _cameraMesh: js.Any = js.native
  
  var _invProjection: js.Any = js.native
  
  var _material: js.Any = js.native
  
  var _pointerObserver: js.Any = js.native
  
  def camera: Nullable[Camera] = js.native
  /**
    * The camera that the gizmo is attached to
    */
  def camera_=(camera: Nullable[Camera]): Unit = js.native
  
  /** Gets or sets a boolean indicating if frustum lines must be rendered (true by default)) */
  def displayFrustum: Boolean = js.native
  def displayFrustum_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the material used to render the camera gizmo
    */
  def material: StandardMaterial = js.native
  
  /**
    * Event that fires each time the gizmo is clicked
    */
  var onClickedObservable: Observable[Camera] = js.native
}
