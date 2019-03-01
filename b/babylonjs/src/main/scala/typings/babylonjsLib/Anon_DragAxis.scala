package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragAxis extends js.Object {
  var dragAxis: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var dragPlaneNormal: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
}

object Anon_DragAxis {
  @scala.inline
  def apply(
    dragAxis: babylonjsLib.BABYLONNs.Vector3 = null,
    dragPlaneNormal: babylonjsLib.BABYLONNs.Vector3 = null
  ): Anon_DragAxis = {
    val __obj = js.Dynamic.literal()
    if (dragAxis != null) __obj.updateDynamic("dragAxis")(dragAxis)
    if (dragPlaneNormal != null) __obj.updateDynamic("dragPlaneNormal")(dragPlaneNormal)
    __obj.asInstanceOf[Anon_DragAxis]
  }
}

