package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDataRequestOrder extends js.Object {
  var column: Double
  var dir: String
}

object AjaxDataRequestOrder {
  @scala.inline
  def apply(column: Double, dir: String): AjaxDataRequestOrder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AjaxDataRequestOrder]
  }
}

