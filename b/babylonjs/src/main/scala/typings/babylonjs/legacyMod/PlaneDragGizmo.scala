package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typings.babylonjs.indexMod.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "PlaneDragGizmo")
@js.native
object PlaneDragGizmo extends js.Object {
  /** @hidden */
  def _CreateArrowInstance(scene: typings.babylonjs.sceneMod.Scene, arrow: typings.babylonjs.transformNodeMod.TransformNode): typings.babylonjs.transformNodeMod.TransformNode = js.native
  /** @hidden */
  def _CreatePlane(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
}

