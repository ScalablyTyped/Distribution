package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellActionEventArgs extends js.Object {
  var column: Double = js.native
  var columnName: Double = js.native
  var row: Double = js.native
}

object ICellActionEventArgs {
  @scala.inline
  def apply(column: Double, columnName: Double, row: Double): ICellActionEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellActionEventArgs]
  }
  @scala.inline
  implicit class ICellActionEventArgsOps[Self <: ICellActionEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnName(value: Double): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

