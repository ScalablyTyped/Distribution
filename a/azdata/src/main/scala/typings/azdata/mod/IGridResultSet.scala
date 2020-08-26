package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridResultSet extends js.Object {
  var columns: js.Array[IDbColumn] = js.native
  var numberOfRows: Double = js.native
  var rowsUri: String = js.native
}

object IGridResultSet {
  @scala.inline
  def apply(columns: js.Array[IDbColumn], numberOfRows: Double, rowsUri: String): IGridResultSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], rowsUri = rowsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridResultSet]
  }
  @scala.inline
  implicit class IGridResultSetOps[Self <: IGridResultSet] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: IDbColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IDbColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfRows(value: Double): Self = this.set("numberOfRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsUri(value: String): Self = this.set("rowsUri", value.asInstanceOf[js.Any])
  }
  
}

