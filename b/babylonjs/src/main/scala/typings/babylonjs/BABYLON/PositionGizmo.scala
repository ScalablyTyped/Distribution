package typings.babylonjs.BABYLON

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.IPositionGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, xPlaneGizmo, yPlaneGizmo, zPlaneGizmo, onDragStartObservable, onDragEndObservable, planarGizmoEnabled, snapDistance, addToAxisCache */ @js.native
trait PositionGizmo
  extends StObject
     with Gizmo {
  
  /** Node Caching for quick lookup */
  /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
  
  /**
    * protected variables
    */
  /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
  
  /* protected */ var _nodeAttached: Nullable[Node] = js.native
  
  /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
  
  /**
    * If set to true, planar drag is enabled
    */
  /* protected */ var _planarGizmoEnabled: Boolean = js.native
  
  /* protected */ var _snapDistance: Double = js.native
  
  /**
    * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
    * @param mesh Axis gizmo mesh
    * @param cache Gizmo axis definition used for reactive gizmo UI
    */
  def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
  
  @JSName("attachedMesh")
  def attachedMesh_MPositionGizmo: Nullable[AbstractMesh] = js.native
  
  @JSName("attachedNode")
  def attachedNode_MPositionGizmo: Nullable[Node] = js.native
  
  /**
    * True when the mouse pointer is hovering a gizmo mesh
    */
  @JSName("isHovered")
  def isHovered_MPositionGizmo: Boolean = js.native
  
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[Any] = js.native
  
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[Any] = js.native
  
  def planarGizmoEnabled: Boolean = js.native
  /**
    * If the planar drag gizmo is enabled
    * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
    */
  def planarGizmoEnabled_=(value: Boolean): Unit = js.native
  /**
    * If the planar drag gizmo is enabled
    * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
    */
  @JSName("planarGizmoEnabled")
  var planarGizmoEnabled_FPositionGizmo: Boolean = js.native
  
  @JSName("scaleRatio")
  def scaleRatio_MPositionGizmo: Double = js.native
  
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
  var snapDistance_FPositionGizmo: Double = js.native
  
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MPositionGizmo: Boolean = js.native
  
  /**
    * Internal gizmo used for interactions on the x axis
    */
  var xGizmo: IAxisDragGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the yz plane
    */
  var xPlaneGizmo: IPlaneDragGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the y axis
    */
  var yGizmo: IAxisDragGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the xz plane
    */
  var yPlaneGizmo: IPlaneDragGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the z axis
    */
  var zGizmo: IAxisDragGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the xy plane
    */
  var zPlaneGizmo: IPlaneDragGizmo = js.native
}
