package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var column: Double
  var row: Double
  var value: js.Any
}

object TableCell {
  @scala.inline
  def apply(column: Double, row: Double, value: js.Any): TableCell = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableCell]
  }
}

