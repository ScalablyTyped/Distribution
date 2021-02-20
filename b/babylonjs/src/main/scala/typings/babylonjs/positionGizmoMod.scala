package typings.babylonjs

import typings.babylonjs.axisDragGizmoMod.AxisDragGizmo
import typings.babylonjs.gizmoManagerMod.GizmoManager
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.planeDragGizmoMod.PlaneDragGizmo
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionGizmoMod {
  
  @JSImport("babylonjs/Gizmos/positionGizmo", "PositionGizmo")
  @js.native
  /**
    * Creates a PositionGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    @param thickness display gizmo axis thickness
    */
  class PositionGizmo () extends Gizmo {
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
    
    /** Node Caching for quick lookup */
    var _gizmoAxisCache: js.Any = js.native
    
    /**
      * private variables
      */
    var _meshAttached: js.Any = js.native
    
    var _nodeAttached: js.Any = js.native
    
    var _observables: js.Any = js.native
    
    /**
      * If set to true, planar drag is enabled
      */
    var _planarGizmoEnabled: js.Any = js.native
    
    var _snapDistance: js.Any = js.native
    
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
    
    def planarGizmoEnabled: Boolean = js.native
    /**
      * If the planar drag gizmo is enabled
      * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
      */
    def planarGizmoEnabled_=(value: Boolean): Unit = js.native
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: AxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the yz plane
      */
    var xPlaneGizmo: PlaneDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: AxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the xz plane
      */
    var yPlaneGizmo: PlaneDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: AxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the xy plane
      */
    var zPlaneGizmo: PlaneDragGizmo = js.native
  }
}
