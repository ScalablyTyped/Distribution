package typings.datatablesNet.DataTables

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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnVisible = columnVisible.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellIndexReturn]
  }
}

