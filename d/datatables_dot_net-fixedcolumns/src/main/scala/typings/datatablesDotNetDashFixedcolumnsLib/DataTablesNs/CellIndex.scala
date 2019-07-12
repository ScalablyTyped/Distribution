package typings
package datatablesDotNetDashFixedcolumnsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  */
trait CellIndex extends js.Object {
  var column: scala.Double
  var columnVisible: scala.Double
  var row: scala.Double
}

object CellIndex {
  @scala.inline
  def apply(column: scala.Double, columnVisible: scala.Double, row: scala.Double): CellIndex = {
    val __obj = js.Dynamic.literal(column = column, columnVisible = columnVisible, row = row)
  
    __obj.asInstanceOf[CellIndex]
  }
}

