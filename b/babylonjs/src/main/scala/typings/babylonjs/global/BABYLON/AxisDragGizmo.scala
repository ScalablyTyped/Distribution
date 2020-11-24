package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typings.babylonjs.BABYLON.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3) = this()
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3, color: typings.babylonjs.BABYLON.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.PositionGizmo]],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.PositionGizmo]],
    thickness: Double
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.AxisDragGizmo")
@js.native
object AxisDragGizmo extends js.Object {
  
  /** @hidden */
  def _CreateArrow(scene: typings.babylonjs.BABYLON.Scene, material: typings.babylonjs.BABYLON.StandardMaterial): typings.babylonjs.BABYLON.TransformNode = js.native
  def _CreateArrow(
    scene: typings.babylonjs.BABYLON.Scene,
    material: typings.babylonjs.BABYLON.StandardMaterial,
    thickness: js.UndefOr[scala.Nothing],
    isCollider: Boolean
  ): typings.babylonjs.BABYLON.TransformNode = js.native
  def _CreateArrow(
    scene: typings.babylonjs.BABYLON.Scene,
    material: typings.babylonjs.BABYLON.StandardMaterial,
    thickness: Double
  ): typings.babylonjs.BABYLON.TransformNode = js.native
  def _CreateArrow(
    scene: typings.babylonjs.BABYLON.Scene,
    material: typings.babylonjs.BABYLON.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typings.babylonjs.BABYLON.TransformNode = js.native
  
  /** @hidden */
  def _CreateArrowInstance(scene: typings.babylonjs.BABYLON.Scene, arrow: typings.babylonjs.BABYLON.TransformNode): typings.babylonjs.BABYLON.TransformNode = js.native
}
