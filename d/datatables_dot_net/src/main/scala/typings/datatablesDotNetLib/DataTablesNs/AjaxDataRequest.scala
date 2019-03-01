package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "ajax-settings"
trait AjaxDataRequest extends js.Object {
  var columns: js.Array[AjaxDataRequestColumn]
  var data: js.Any
  var draw: scala.Double
  var length: scala.Double
  var order: js.Array[AjaxDataRequestOrder]
  var search: AjaxDataRequestSearch
  var start: scala.Double
}

object AjaxDataRequest {
  @scala.inline
  def apply(
    columns: js.Array[AjaxDataRequestColumn],
    data: js.Any,
    draw: scala.Double,
    length: scala.Double,
    order: js.Array[AjaxDataRequestOrder],
    search: AjaxDataRequestSearch,
    start: scala.Double
  ): AjaxDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[AjaxDataRequest]
  }
}

