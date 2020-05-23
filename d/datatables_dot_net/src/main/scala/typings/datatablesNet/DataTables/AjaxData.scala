package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxData extends js.Object {
  var data: js.Any
  var draw: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var recordsFiltered: js.UndefOr[Double] = js.undefined
  var recordsTotal: js.UndefOr[Double] = js.undefined
}

object AjaxData {
  @scala.inline
  def apply(
    data: js.Any,
    draw: js.UndefOr[Double] = js.undefined,
    error: String = null,
    recordsFiltered: js.UndefOr[Double] = js.undefined,
    recordsTotal: js.UndefOr[Double] = js.undefined
  ): AjaxData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(draw)) __obj.updateDynamic("draw")(draw.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(recordsFiltered)) __obj.updateDynamic("recordsFiltered")(recordsFiltered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recordsTotal)) __obj.updateDynamic("recordsTotal")(recordsTotal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxData]
  }
}

