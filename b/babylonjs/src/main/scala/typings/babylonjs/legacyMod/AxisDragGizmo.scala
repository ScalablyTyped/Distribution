package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typings.babylonjs.indexMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3, color: typings.babylonjs.mathColorMod.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: js.UndefOr[Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]],
    thickness: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "AxisDragGizmo")
@js.native
object AxisDragGizmo extends js.Object {
  
  /** @hidden */
  def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
  def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: js.UndefOr[scala.Nothing],
    isCollider: Boolean
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
  def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Double
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
  def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
  
  /** @hidden */
  def _CreateArrowInstance(scene: typings.babylonjs.sceneMod.Scene, arrow: typings.babylonjs.transformNodeMod.TransformNode): typings.babylonjs.transformNodeMod.TransformNode = js.native
}
