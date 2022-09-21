package typings.babylonjs.BABYLON

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.IRotationGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, onDragStartObservable, onDragEndObservable, snapDistance, addToAxisCache */ @js.native
trait RotationGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ def _checkBillboardTransform(): Unit = js.native
  
  /** Node Caching for quick lookup */
  /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
  
  /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
  
  /* protected */ var _nodeAttached: Nullable[Node] = js.native
  
  /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
  
  /**
    * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
    * @param mesh Axis gizmo mesh
    * @param cache Gizmo axis definition used for reactive gizmo UI
    */
  def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
  
  @JSName("attachedMesh")
  def attachedMesh_MRotationGizmo: Nullable[AbstractMesh] = js.native
  
  @JSName("attachedNode")
  def attachedNode_MRotationGizmo: Nullable[Node] = js.native
  
  /**
    * True when the mouse pointer is hovering a gizmo mesh
    */
  @JSName("isHovered")
  def isHovered_MRotationGizmo: Boolean = js.native
  
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[Any] = js.native
  
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[Any] = js.native
  
  @JSName("scaleRatio")
  def scaleRatio_MRotationGizmo: Double = js.native
  
  /**
    * CustomMeshes are not supported by this gizmo
    */
  def setCustomMesh(): Unit = js.native
  
  def snapDistance: Double = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  def snapDistance_=(value: Double): Unit = js.native
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  @JSName("snapDistance")
  var snapDistance_FRotationGizmo: Double = js.native
  
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MRotationGizmo: Boolean = js.native
  
  /**
    * Internal gizmo used for interactions on the x axis
    */
  var xGizmo: IPlaneRotationGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the y axis
    */
  var yGizmo: IPlaneRotationGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the z axis
    */
  var zGizmo: IPlaneRotationGizmo = js.native
}
