package typings.babylonjs.BABYLON

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IGizmo because Already inherited
- typings.babylonjs.BABYLON.IScaleGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, uniformScaleGizmo, onDragStartObservable, onDragEndObservable, snapDistance, sensitivity, addToAxisCache, coloredMaterial, hoverMaterial, disableMaterial */ @js.native
trait ScaleGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ var _coloredMaterial: StandardMaterial = js.native
  
  /** Create Geometry for Gizmo */
  /* protected */ def _createUniformScaleMesh(): AxisScaleGizmo = js.native
  
  /* protected */ var _disableMaterial: StandardMaterial = js.native
  
  /** Node Caching for quick lookup */
  /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
  
  /* protected */ var _hoverMaterial: StandardMaterial = js.native
  
  /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
  
  /* protected */ var _nodeAttached: Nullable[Node] = js.native
  
  /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
  
  /* protected */ var _octahedron: Mesh = js.native
  
  /* protected */ var _sensitivity: Double = js.native
  
  /* protected */ var _snapDistance: Double = js.native
  
  /* protected */ var _uniformScalingMesh: Mesh = js.native
  
  /**
    * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
    * @param mesh Axis gizmo mesh
    * @param cache Gizmo axis definition used for reactive gizmo UI
    */
  def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
  
  @JSName("attachedMesh")
  def attachedMesh_MScaleGizmo: Nullable[AbstractMesh] = js.native
  
  @JSName("attachedNode")
  def attachedNode_MScaleGizmo: Nullable[Node] = js.native
  
  /** Default material used to render when gizmo is not disabled or hovered */
  def coloredMaterial: StandardMaterial = js.native
  /** Default material used to render when gizmo is not disabled or hovered */
  @JSName("coloredMaterial")
  var coloredMaterial_FScaleGizmo: StandardMaterial = js.native
  
  /** Material used to render when gizmo is disabled. typically grey.*/
  def disableMaterial: StandardMaterial = js.native
  /** Material used to render when gizmo is disabled. typically grey.*/
  @JSName("disableMaterial")
  var disableMaterial_FScaleGizmo: StandardMaterial = js.native
  
  /** Material used to render when gizmo is hovered with mouse*/
  def hoverMaterial: StandardMaterial = js.native
  /** Material used to render when gizmo is hovered with mouse*/
  @JSName("hoverMaterial")
  var hoverMaterial_FScaleGizmo: StandardMaterial = js.native
  
  /**
    * True when the mouse pointer is hovering a gizmo mesh
    */
  @JSName("isHovered")
  def isHovered_MScaleGizmo: Boolean = js.native
  
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[Any] = js.native
  
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[Any] = js.native
  
  @JSName("scaleRatio")
  def scaleRatio_MScaleGizmo: Double = js.native
  
  def sensitivity: Double = js.native
  /**
    * Sensitivity factor for dragging (Default: 1)
    */
  def sensitivity_=(value: Double): Unit = js.native
  /** Sensitivity factor for dragging */
  @JSName("sensitivity")
  var sensitivity_FScaleGizmo: Double = js.native
  
  def snapDistance: Double = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  def snapDistance_=(value: Double): Unit = js.native
  /** Drag distance in babylon units that the gizmo will snap to when dragged */
  @JSName("snapDistance")
  var snapDistance_FScaleGizmo: Double = js.native
  
  /**
    * Internal gizmo used to scale all axis equally
    */
  var uniformScaleGizmo: IAxisScaleGizmo = js.native
  
  @JSName("updateGizmoRotationToMatchAttachedMesh")
  def updateGizmoRotationToMatchAttachedMesh_MScaleGizmo: Boolean = js.native
  
  @JSName("updateScale")
  def updateScale_MScaleGizmo: Boolean = js.native
  
  /**
    * Internal gizmo used for interactions on the x axis
    */
  var xGizmo: IAxisScaleGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the y axis
    */
  var yGizmo: IAxisScaleGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the z axis
    */
  var zGizmo: IAxisScaleGizmo = js.native
}
