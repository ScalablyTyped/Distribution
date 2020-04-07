package typings.babylonjs

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gizmos/axisDragGizmo", JSImport.Namespace)
@js.native
object axisDragGizmoMod extends js.Object {
  @js.native
  class AxisDragGizmo protected () extends Gizmo {
    /**
      * Creates an AxisDragGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param dragAxis The axis which the gizmo will be able to drag on
      * @param color The color of the gizmo
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    var _arrow: js.Any = js.native
    var _coloredMaterial: js.Any = js.native
    var _hoverMaterial: js.Any = js.native
    var _isEnabled: js.Any = js.native
    var _parent: js.Any = js.native
    var _pointerObserver: js.Any = js.native
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[AnonSnapDistance] = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
    def isEnabled(): Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled(value: Boolean): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object AxisDragGizmo extends js.Object {
    /** @hidden */
    def _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode = js.native
    /** @hidden */
    def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = js.native
  }
  
}

