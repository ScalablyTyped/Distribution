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

