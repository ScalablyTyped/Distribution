package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAxis extends js.Object {
  var dragAxis: js.UndefOr[Vector3] = js.undefined
  var dragPlaneNormal: js.UndefOr[Vector3] = js.undefined
}

object DragAxis {
  @scala.inline
  def apply(dragAxis: Vector3 = null, dragPlaneNormal: Vector3 = null): DragAxis = {
    val __obj = js.Dynamic.literal()
    if (dragAxis != null) __obj.updateDynamic("dragAxis")(dragAxis.asInstanceOf[js.Any])
    if (dragPlaneNormal != null) __obj.updateDynamic("dragPlaneNormal")(dragPlaneNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAxis]
  }
}

