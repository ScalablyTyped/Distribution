package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gizmo extends IDisposable {
  
  var _attachedMesh: js.Any = js.native
  
  var _attachedNode: js.Any = js.native
  
  /* protected */ def _attachedNodeChanged(value: Nullable[Node]): Unit = js.native
  
  var _beforeRenderObserver: js.Any = js.native
  
  /**
    * If a custom mesh has been set (Default: false)
    */
  var _customMeshSet: Boolean = js.native
  
  var _interactionsEnabled: Boolean = js.native
  
  /**
    * boolean updated by pointermove when a gizmo mesh is hovered
    */
  var _isHovered: Boolean = js.native
  
  /**
    * computes the rotation/scaling/position of the transform once the Node world matrix has changed.
    * @param value Node, TransformNode or mesh
    */
  /* protected */ def _matrixChanged(): Unit = js.native
  
  var _rightHandtoLeftHandMatrix: js.Any = js.native
  
  /**
    * The root mesh of the gizmo
    */
  var _rootMesh: Mesh = js.native
  
  /**
    * Ratio for the scale of the gizmo (Default: 1)
    */
  var _scaleRatio: Double = js.native
  
  var _tempMatrix1: js.Any = js.native
  
  var _tempMatrix2: js.Any = js.native
  
  var _tempQuaternion: js.Any = js.native
  
  var _tempVector: js.Any = js.native
  
  var _tempVector2: js.Any = js.native
  
  /**
    * Updates the gizmo to match the attached mesh's position/rotation
    */
  /* protected */ def _update(): Unit = js.native
  
  var _updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
  
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  def attachedMesh: Nullable[AbstractMesh] = js.native
  def attachedMesh_=(value: Nullable[AbstractMesh]): Unit = js.native
  
  /**
    * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
    * * When set, interactions will be enabled
    */
  def attachedNode: Nullable[Node] = js.native
  def attachedNode_=(value: Nullable[Node]): Unit = js.native
  
  /** The utility layer the gizmo will be added to */
  var gizmoLayer: UtilityLayerRenderer = js.native
  
  /**
    * True when the mouse pointer is hovered a gizmo mesh
    */
  def isHovered: Boolean = js.native
  
  def scaleRatio: Double = js.native
  /**
    * Ratio for the scale of the gizmo (Default: 1)
    */
  def scaleRatio_=(value: Double): Unit = js.native
  
  /**
    * Disposes and replaces the current meshes in the gizmo with the specified mesh
    * @param mesh The mesh to replace the default mesh of the gizmo
    */
  def setCustomMesh(mesh: Mesh): Unit = js.native
  
  /**
    * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
    */
  var updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
  
  def updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
  /**
    * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
    */
  def updateGizmoRotationToMatchAttachedMesh_=(value: Boolean): Unit = js.native
  
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
    */
  var updateScale: Boolean = js.native
}
