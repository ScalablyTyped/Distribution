package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellIndexReturn extends js.Object {
  var column: Double
  var columnVisible: Double
  var row: Double
}

object CellIndexReturn {
  @scala.inline
  def apply(column: Double, columnVisible: Double, row: Double): CellIndexReturn = {
    val __obj = js.Dynamic.literal(column = column, columnVisible = columnVisible, row = row)
  
    __obj.asInstanceOf[CellIndexReturn]
  }
}

