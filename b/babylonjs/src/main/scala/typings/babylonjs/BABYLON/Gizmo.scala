package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gizmo
  extends StObject
     with IGizmo {
  
  /* protected */ var _attachedMesh: Nullable[AbstractMesh] = js.native
  
  /* protected */ var _attachedNode: Nullable[Node] = js.native
  
  /* protected */ def _attachedNodeChanged(value: Nullable[Node]): Unit = js.native
  
  /* protected */ var _beforeRenderObserver: Nullable[Observer[Scene]] = js.native
  
  /**
    * If a custom mesh has been set (Default: false)
    */
  /* protected */ var _customMeshSet: Boolean = js.native
  
  /* protected */ var _customRotationQuaternion: Nullable[Quaternion] = js.native
  
  /**
    * Handle position/translation when using an attached node using pivot
    */
  /* protected */ def _handlePivot(): Unit = js.native
  
  /* protected */ var _interactionsEnabled: Boolean = js.native
  
  /**
    * boolean updated by pointermove when a gizmo mesh is hovered
    */
  /* protected */ var _isHovered: Boolean = js.native
  
  /**
    * computes the rotation/scaling/position of the transform once the Node world matrix has changed.
    */
  /* protected */ def _matrixChanged(): Unit = js.native
  
  /* private */ var _rightHandtoLeftHandMatrix: Any = js.native
  
  /**
    * Ratio for the scale of the gizmo (Default: 1)
    */
  /* protected */ var _scaleRatio: Double = js.native
  
  /**
    * refresh gizmo mesh material
    * @param gizmoMeshes
    * @param material material to apply
    */
  /* protected */ def _setGizmoMeshMaterial(gizmoMeshes: js.Array[Mesh], material: StandardMaterial): Unit = js.native
  
  /**
    * Updates the gizmo to match the attached mesh's position/rotation
    */
  /* protected */ def _update(): Unit = js.native
  
  /* protected */ var _updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
  
  /* protected */ var _updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
  
  /* protected */ var _updateScale: Boolean = js.native
  
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  @JSName("attachedMesh")
  def attachedMesh_MGizmo: Nullable[AbstractMesh] = js.native
  
  /**
    * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
    * * When set, interactions will be enabled
    */
  @JSName("attachedNode")
  def attachedNode_MGizmo: Nullable[Node] = js.native
  
  /**
    * posture that the gizmo will be display
    * When set null, default value will be used (Quaternion(0, 0, 0, 1))
    */
  @JSName("customRotationQuaternion")
  def customRotationQuaternion_MGizmo: Nullable[Quaternion] = js.native
  
  /**
    * True when the mouse pointer is hovered a gizmo mesh
    */
  @JSName("isHovered")
  def isHovered_MGizmo: Boolean = js.native
  
  @JSName("scaleRatio")
  def scaleRatio_MGizmo: Double = js.native
  
  @JSName("updateGizmoPositionToMatchAttachedMesh")
  def updateGizmoPositionToMatchAttachedMesh_MGizmo: Boolean = js.native
  
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MGizmo: Boolean = js.native
  
  @JSName("updateScale")
  def updateScale_MGizmo: Boolean = js.native
}
