package typings.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  */
trait CellIndex extends js.Object {
  var column: Double
  var columnVisible: Double
  var row: Double
}

object CellIndex {
  @scala.inline
  def apply(column: Double, columnVisible: Double, row: Double): CellIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnVisible = columnVisible.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellIndex]
  }
}

