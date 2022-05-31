package typings.babylonjs

import typings.babylonjs.gizmoManagerMod.GizmoManager
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.planeRotationGizmoMod.PlaneRotationGizmo
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationGizmoMod {
  
  @JSImport("babylonjs/Gizmos/rotationGizmo", "RotationGizmo")
  @js.native
  /**
    * Creates a RotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    * @param thickness display gizmo axis thickness
    */
  class RotationGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: Unit, tessellation: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double) = this()
    def this(gizmoLayer: Unit, tessellation: Double, useEulerRotation: Boolean) = this()
    def this(gizmoLayer: Unit, tessellation: Unit, useEulerRotation: Boolean) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double, useEulerRotation: Boolean) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Unit, useEulerRotation: Boolean) = this()
    def this(gizmoLayer: Unit, tessellation: Double, useEulerRotation: Boolean, thickness: Double) = this()
    def this(gizmoLayer: Unit, tessellation: Double, useEulerRotation: Unit, thickness: Double) = this()
    def this(gizmoLayer: Unit, tessellation: Unit, useEulerRotation: Boolean, thickness: Double) = this()
    def this(gizmoLayer: Unit, tessellation: Unit, useEulerRotation: Unit, thickness: Double) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double
    ) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Double, useEulerRotation: Unit, thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Unit, useEulerRotation: Boolean, thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, tessellation: Unit, useEulerRotation: Unit, thickness: Double) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Double,
      useEulerRotation: Unit,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Double,
      useEulerRotation: Unit,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Unit,
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Unit,
      useEulerRotation: Boolean,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Unit,
      useEulerRotation: Unit,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: Unit,
      tessellation: Unit,
      useEulerRotation: Unit,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Boolean,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Unit,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Double,
      useEulerRotation: Unit,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Unit,
      useEulerRotation: Boolean,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Unit,
      useEulerRotation: Boolean,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Unit,
      useEulerRotation: Unit,
      thickness: Double,
      gizmoManager: GizmoManager
    ) = this()
    def this(
      gizmoLayer: UtilityLayerRenderer,
      tessellation: Unit,
      useEulerRotation: Unit,
      thickness: Unit,
      gizmoManager: GizmoManager
    ) = this()
    
    /* protected */ def _checkBillboardTransform(): Unit = js.native
    
    /** Node Caching for quick lookup */
    /* private */ var _gizmoAxisCache: js.Any = js.native
    
    /* private */ var _meshAttached: js.Any = js.native
    
    /* private */ var _nodeAttached: js.Any = js.native
    
    /* private */ var _observables: js.Any = js.native
    
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
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: PlaneRotationGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: PlaneRotationGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: PlaneRotationGizmo = js.native
  }
}
