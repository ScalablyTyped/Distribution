package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetSummary extends js.Object {
  var batchId: Double = js.native
  var columnInfo: js.Array[IDbColumn] = js.native
  var complete: Boolean = js.native
  var id: Double = js.native
  var rowCount: Double = js.native
}

object ResultSetSummary {
  @scala.inline
  def apply(batchId: Double, columnInfo: js.Array[IDbColumn], complete: Boolean, id: Double, rowCount: Double): ResultSetSummary = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], columnInfo = columnInfo.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSummary]
  }
  @scala.inline
  implicit class ResultSetSummaryOps[Self <: ResultSetSummary] (val x: Self) extends AnyVal {
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnInfoVarargs(value: IDbColumn*): Self = this.set("columnInfo", js.Array(value :_*))
    @scala.inline
    def setColumnInfo(value: js.Array[IDbColumn]): Self = this.set("columnInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
  }
  
}

