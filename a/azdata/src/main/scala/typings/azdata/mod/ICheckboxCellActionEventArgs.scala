package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxCellActionEventArgs extends ICellActionEventArgs {
  var checked: Boolean
}

object ICheckboxCellActionEventArgs {
  @scala.inline
  def apply(checked: Boolean, column: Double, columnName: Double, row: Double): ICheckboxCellActionEventArgs = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxCellActionEventArgs]
  }
}

