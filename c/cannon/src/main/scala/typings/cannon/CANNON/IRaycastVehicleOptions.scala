package typings.cannon.CANNON

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
    indexLeftAxis: js.UndefOr[Double] = js.undefined,
    indexRightAxis: js.UndefOr[Double] = js.undefined,
    indexUpAxis: js.UndefOr[Double] = js.undefined
  ): IRaycastVehicleOptions = {
    val __obj = js.Dynamic.literal()
    if (chassisBody != null) __obj.updateDynamic("chassisBody")(chassisBody.asInstanceOf[js.Any])
    if (!js.isUndefined(indexLeftAxis)) __obj.updateDynamic("indexLeftAxis")(indexLeftAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexRightAxis)) __obj.updateDynamic("indexRightAxis")(indexRightAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexUpAxis)) __obj.updateDynamic("indexUpAxis")(indexUpAxis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRaycastVehicleOptions]
  }
}

