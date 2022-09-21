package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.ICameraGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined onClickedObservable, displayFrustum, camera, material */ @js.native
trait CameraGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ var _camera: Nullable[Camera] = js.native
  
  /* protected */ var _cameraLinesMesh: Mesh = js.native
  
  /* protected */ var _cameraMesh: Mesh = js.native
  
  /* private */ var _invProjection: Any = js.native
  
  /* protected */ var _material: StandardMaterial = js.native
  
  /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
  
  def camera: Nullable[Camera] = js.native
  /**
    * The camera that the gizmo is attached to
    */
  def camera_=(camera: Nullable[Camera]): Unit = js.native
  /** The camera that the gizmo is attached to */
  @JSName("camera")
  var camera_FCameraGizmo: Nullable[Camera] = js.native
  
  /** Gets or sets a boolean indicating if frustum lines must be rendered (true by default)) */
  def displayFrustum: Boolean = js.native
  def displayFrustum_=(value: Boolean): Unit = js.native
  /** A boolean indicating if frustum lines must be rendered */
  @JSName("displayFrustum")
  var displayFrustum_FCameraGizmo: Boolean = js.native
  
  /**
    * Gets the material used to render the camera gizmo
    */
  def material: StandardMaterial = js.native
  /** The material used to render the camera gizmo */
  @JSName("material")
  val material_FCameraGizmo: StandardMaterial = js.native
  
  /**
    * Event that fires each time the gizmo is clicked
    */
  var onClickedObservable: Observable[Camera] = js.native
}
