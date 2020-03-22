package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxCell extends TableCell {
  var checked: Boolean
  var columnName: String
}

object CheckBoxCell {
  @scala.inline
  def apply(checked: Boolean, column: Double, columnName: String, row: Double, value: js.Any): CheckBoxCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckBoxCell]
  }
}

