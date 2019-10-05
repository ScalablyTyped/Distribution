package typings.datatablesDotNet.DataTables

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
    draw: Int | Double = null,
    error: String = null,
    recordsFiltered: Int | Double = null,
    recordsTotal: Int | Double = null
  ): AjaxData = {
    val __obj = js.Dynamic.literal(data = data)
    if (draw != null) __obj.updateDynamic("draw")(draw.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (recordsFiltered != null) __obj.updateDynamic("recordsFiltered")(recordsFiltered.asInstanceOf[js.Any])
    if (recordsTotal != null) __obj.updateDynamic("recordsTotal")(recordsTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxData]
  }
}

