package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRaycastVehicleOptions extends js.Object {
  var chassisBody: js.UndefOr[Body] = js.undefined
  var indexLeftAxis: js.UndefOr[Double] = js.undefined
  var indexRightAxis: js.UndefOr[Double] = js.undefined
  var indexUpAxis: js.UndefOr[Double] = js.undefined
}

object IRaycastVehicleOptions {
  @scala.inline
  def apply(
    chassisBody: Body = null,
    indexLeftAxis: Int | Double = null,
    indexRightAxis: Int | Double = null,
    indexUpAxis: Int | Double = null
  ): IRaycastVehicleOptions = {
    val __obj = js.Dynamic.literal()
    if (chassisBody != null) __obj.updateDynamic("chassisBody")(chassisBody)
    if (indexLeftAxis != null) __obj.updateDynamic("indexLeftAxis")(indexLeftAxis.asInstanceOf[js.Any])
    if (indexRightAxis != null) __obj.updateDynamic("indexRightAxis")(indexRightAxis.asInstanceOf[js.Any])
    if (indexUpAxis != null) __obj.updateDynamic("indexUpAxis")(indexUpAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRaycastVehicleOptions]
  }
}

