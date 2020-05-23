package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AxisScaleGizmo")
@js.native
class AxisScaleGizmo protected ()
  extends typings.babylonjs.BABYLON.AxisScaleGizmo {
  /**
    * Creates an AxisScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to scale on
    * @param color The color of the gizmo
    */
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3) = this()
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3, color: typings.babylonjs.BABYLON.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.ScaleGizmo]
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

