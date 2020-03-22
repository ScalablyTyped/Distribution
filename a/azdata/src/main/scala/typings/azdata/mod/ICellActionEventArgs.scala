package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellActionEventArgs extends js.Object {
  var column: Double
  var columnName: Double
  var row: Double
}

object ICellActionEventArgs {
  @scala.inline
  def apply(column: Double, columnName: Double, row: Double): ICellActionEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICellActionEventArgs]
  }
}

