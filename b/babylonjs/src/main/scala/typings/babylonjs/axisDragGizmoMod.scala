package typings.babylonjs

import typings.babylonjs.anon.SnapDistance
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pointerDragBehaviorMod.PointerDragBehavior
import typings.babylonjs.positionGizmoMod.PositionGizmo
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.standardMaterialMod.StandardMaterial
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisDragGizmoMod {
  
  @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo")
  @js.native
  class AxisDragGizmo protected () extends Gizmo {
    /**
      * Creates an AxisDragGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[PositionGizmo]) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Nullable[PositionGizmo]) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Nullable[PositionGizmo]) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[PositionGizmo],
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
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    
    /* private */ var _coloredMaterial: js.Any = js.native
    
    /* private */ var _disableMaterial: js.Any = js.native
    
    /* private */ var _dragging: js.Any = js.native
    
    /* private */ var _gizmoMesh: js.Any = js.native
    
    /* private */ var _hoverMaterial: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /* private */ var _parent: js.Any = js.native
    
    /* private */ var _pointerObserver: js.Any = js.native
    
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
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
  }
  /* static members */
  object AxisDragGizmo {
    
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /** @hidden */
    inline def _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double, isCollider: Boolean): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Unit, isCollider: Boolean): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    
    /** @hidden */
    inline def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
  }
}
