package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDataRequestOrder extends js.Object {
  var column: scala.Double
  var dir: java.lang.String
}

object AjaxDataRequestOrder {
  @scala.inline
  def apply(column: scala.Double, dir: java.lang.String): AjaxDataRequestOrder = {
    val __obj = js.Dynamic.literal(column = column, dir = dir)
  
    __obj.asInstanceOf[AjaxDataRequestOrder]
  }
}

