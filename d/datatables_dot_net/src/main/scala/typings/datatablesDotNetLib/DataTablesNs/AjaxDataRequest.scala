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
    val __obj = js.Dynamic.literal(columns = columns, data = data, draw = draw, length = length, order = order, search = search, start = start)
  
    __obj.asInstanceOf[AjaxDataRequest]
  }
}

