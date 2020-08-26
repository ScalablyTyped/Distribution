package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteSubsetParams extends js.Object {
  var batchIndex: Double = js.native
  var ownerUri: String = js.native
  var resultSetIndex: Double = js.native
  var rowsCount: Double = js.native
  var rowsStartIndex: Double = js.native
}

object QueryExecuteSubsetParams {
  @scala.inline
  def apply(
    batchIndex: Double,
    ownerUri: String,
    resultSetIndex: Double,
    rowsCount: Double,
    rowsStartIndex: Double
  ): QueryExecuteSubsetParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], rowsStartIndex = rowsStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetParams]
  }
  @scala.inline
  implicit class QueryExecuteSubsetParamsOps[Self <: QueryExecuteSubsetParams] (val x: Self) extends AnyVal {
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
    def setBatchIndex(value: Double): Self = this.set("batchIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultSetIndex(value: Double): Self = this.set("resultSetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsCount(value: Double): Self = this.set("rowsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsStartIndex(value: Double): Self = this.set("rowsStartIndex", value.asInstanceOf[js.Any])
  }
  
}

