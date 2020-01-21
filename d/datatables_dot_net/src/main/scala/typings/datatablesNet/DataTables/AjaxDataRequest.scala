package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "ajax-settings"
trait AjaxDataRequest extends js.Object {
  var columns: js.Array[AjaxDataRequestColumn]
  var data: js.Any
  var draw: Double
  var length: Double
  var order: js.Array[AjaxDataRequestOrder]
  var search: AjaxDataRequestSearch
  var start: Double
}

object AjaxDataRequest {
  @scala.inline
  def apply(
    columns: js.Array[AjaxDataRequestColumn],
    data: js.Any,
    draw: Double,
    length: Double,
    order: js.Array[AjaxDataRequestOrder],
    search: AjaxDataRequestSearch,
    start: Double
  ): AjaxDataRequest = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AjaxDataRequest]
  }
}

