package typings.babylonjs

import typings.babylonjs.anon.SnapDistance
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pointerDragBehaviorMod.PointerDragBehavior
import typings.babylonjs.scaleGizmoMod.ScaleGizmo
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisScaleGizmoMod {
  
  @JSImport("babylonjs/Gizmos/axisScaleGizmo", "AxisScaleGizmo")
  @js.native
  class AxisScaleGizmo protected () extends Gizmo {
    /**
      * Creates an AxisScaleGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to scale on
      * @param color The color of the gizmo
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[ScaleGizmo], thickness: Double) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[ScaleGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[ScaleGizmo],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Unit,
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[ScaleGizmo],
      thickness: Double
    ) = this()
    
    /* private */ var _coloredMaterial: js.Any = js.native
    
    /** Create Geometry for Gizmo */
    /* private */ var _createGizmoMesh: js.Any = js.native
    
    /* private */ var _disableMaterial: js.Any = js.native
    
    /* private */ var _dragging: js.Any = js.native
    
    /* private */ var _gizmoMesh: js.Any = js.native
    
    /* private */ var _hoverMaterial: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /* private */ var _parent: js.Any = js.native
    
    /* private */ var _pointerObserver: js.Any = js.native
    
    /* private */ var _tmpMatrix: js.Any = js.native
    
    /* private */ var _tmpMatrix2: js.Any = js.native
    
    /* private */ var _tmpVector: js.Any = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Custom sensitivity value for the drag strength
      */
    var sensitivity: Double = js.native
    
    def setCustomMesh(mesh: Mesh, useGizmoMaterial: Boolean): Unit = js.native
    
    /**
      * Scale distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
    
    /**
      * If the scaling operation should be done on all axis (default: false)
      */
    var uniformScaling: Boolean = js.native
  }
}
