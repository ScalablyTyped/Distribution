package typings.babylonjs

import typings.babylonjs.axisScaleGizmoMod.AxisScaleGizmo
import typings.babylonjs.gizmoManagerMod.GizmoManager
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/scaleGizmo", JSImport.Namespace)
@js.native
object scaleGizmoMod extends js.Object {
  
  @js.native
  /**
    * Creates a ScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param thickness display gizmo axis thickness
    */
  class ScaleGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(
      gizmoLayer: js.UndefOr[scala.Nothing],
      thickness: js.UndefOr[scala.Nothing],
      gizmoManager: GizmoManager
    ) = this()
    def this(gizmoLayer: js.UndefOr[scala.Nothing], thickness: Double, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: js.UndefOr[scala.Nothing], gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double, gizmoManager: GizmoManager) = this()
    
    var _coloredMaterial: js.Any = js.native
    
    /** Create Geometry for Gizmo */
    var _createUniformScaleMesh: js.Any = js.native
    
    var _disableMaterial: js.Any = js.native
    
    /** Node Caching for quick lookup */
    var _gizmoAxisCache: js.Any = js.native
    
    var _hoverMaterial: js.Any = js.native
    
    var _meshAttached: js.Any = js.native
    
    var _nodeAttached: js.Any = js.native
    
    var _observables: js.Any = js.native
    
    var _octahedron: js.Any = js.native
    
    var _sensitivity: js.Any = js.native
    
    var _snapDistance: js.Any = js.native
    
    var _uniformScalingMesh: js.Any = js.native
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[_] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[_] = js.native
    
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
}
