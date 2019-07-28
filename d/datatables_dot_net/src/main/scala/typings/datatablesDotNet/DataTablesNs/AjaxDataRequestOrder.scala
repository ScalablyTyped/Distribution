package typings.datatablesDotNet.DataTablesNs

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
    val __obj = js.Dynamic.literal(column = column, dir = dir)
  
    __obj.asInstanceOf[AjaxDataRequestOrder]
  }
}

