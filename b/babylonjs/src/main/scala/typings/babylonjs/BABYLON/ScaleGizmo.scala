package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleGizmo
  extends StObject
     with Gizmo {
  
  /* private */ var _coloredMaterial: js.Any = js.native
  
  /** Create Geometry for Gizmo */
  /* private */ var _createUniformScaleMesh: js.Any = js.native
  
  /* private */ var _disableMaterial: js.Any = js.native
  
  /** Node Caching for quick lookup */
  /* private */ var _gizmoAxisCache: js.Any = js.native
  
  /* private */ var _hoverMaterial: js.Any = js.native
  
  /* private */ var _meshAttached: js.Any = js.native
  
  /* private */ var _nodeAttached: js.Any = js.native
  
  /* private */ var _observables: js.Any = js.native
  
  /* private */ var _octahedron: js.Any = js.native
  
  /* private */ var _sensitivity: js.Any = js.native
  
  /* private */ var _snapDistance: js.Any = js.native
  
  /* private */ var _uniformScalingMesh: js.Any = js.native
  
  /**
    * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
    * @param mesh Axis gizmo mesh
    * @param cache Gizmo axis definition used for reactive gizmo UI
    */
  def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
  
  /** Fires an event when any of it's sub gizmos are released from dragging */
  var onDragEndObservable: Observable[js.Any] = js.native
  
  /** Fires an event when any of it's sub gizmos are dragged */
  var onDragStartObservable: Observable[js.Any] = js.native
  
  def sensitivity: Double = js.native
  /**
    * Sensitivity factor for dragging (Default: 1)
    */
  def sensitivity_=(value: Double): Unit = js.native
  
  def snapDistance: Double = js.native
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  def snapDistance_=(value: Double): Unit = js.native
  
  /**
    * Internal gizmo used to scale all axis equally
    */
  var uniformScaleGizmo: AxisScaleGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the x axis
    */
  var xGizmo: AxisScaleGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the y axis
    */
  var yGizmo: AxisScaleGizmo = js.native
  
  /**
    * Internal gizmo used for interactions on the z axis
    */
  var zGizmo: AxisScaleGizmo = js.native
}
