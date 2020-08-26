package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleExecuteResult extends js.Object {
  var columnInfo: js.Array[IDbColumn] = js.native
  var rowCount: Double = js.native
  var rows: js.Array[js.Array[DbCellValue]] = js.native
}

object SimpleExecuteResult {
  @scala.inline
  def apply(columnInfo: js.Array[IDbColumn], rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): SimpleExecuteResult = {
    val __obj = js.Dynamic.literal(columnInfo = columnInfo.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExecuteResult]
  }
  @scala.inline
  implicit class SimpleExecuteResultOps[Self <: SimpleExecuteResult] (val x: Self) extends AnyVal {
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
    def setColumnInfoVarargs(value: IDbColumn*): Self = this.set("columnInfo", js.Array(value :_*))
    @scala.inline
    def setColumnInfo(value: js.Array[IDbColumn]): Self = this.set("columnInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: js.Array[DbCellValue]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[DbCellValue]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

