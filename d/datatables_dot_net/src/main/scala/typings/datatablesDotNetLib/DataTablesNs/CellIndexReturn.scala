package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellIndexReturn extends js.Object {
  var column: scala.Double
  var columnVisible: scala.Double
  var row: scala.Double
}

object CellIndexReturn {
  @scala.inline
  def apply(column: scala.Double, columnVisible: scala.Double, row: scala.Double): CellIndexReturn = {
    val __obj = js.Dynamic.literal(column = column, columnVisible = columnVisible, row = row)
  
    __obj.asInstanceOf[CellIndexReturn]
  }
}

