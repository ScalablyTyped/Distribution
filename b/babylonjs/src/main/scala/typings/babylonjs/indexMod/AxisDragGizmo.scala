package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typings.babylonjs.gizmosIndexMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3, color: typings.babylonjs.mathColorMod.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
}

/* static members */
@JSImport("babylonjs/index", "AxisDragGizmo")
@js.native
object AxisDragGizmo extends js.Object {
  /** @hidden */
  def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
  /** @hidden */
  def _CreateArrowInstance(scene: typings.babylonjs.sceneMod.Scene, arrow: typings.babylonjs.transformNodeMod.TransformNode): typings.babylonjs.transformNodeMod.TransformNode = js.native
}

