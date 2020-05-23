package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typings.babylonjs.BABYLON.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: typings.babylonjs.BABYLON.Vector3) = this()
  def this(dragPlaneNormal: typings.babylonjs.BABYLON.Vector3, color: typings.babylonjs.BABYLON.Color3) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
object PlaneDragGizmo extends js.Object {
  /** @hidden */
  def _CreateArrowInstance(scene: typings.babylonjs.BABYLON.Scene, arrow: typings.babylonjs.BABYLON.TransformNode): typings.babylonjs.BABYLON.TransformNode = js.native
  /** @hidden */
  def _CreatePlane(scene: typings.babylonjs.BABYLON.Scene, material: typings.babylonjs.BABYLON.StandardMaterial): typings.babylonjs.BABYLON.TransformNode = js.native
}

