package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteCompleteNotificationResult extends js.Object {
  var batchSummaries: js.Array[BatchSummary] = js.native
  var ownerUri: String = js.native
}

object QueryExecuteCompleteNotificationResult {
  @scala.inline
  def apply(batchSummaries: js.Array[BatchSummary], ownerUri: String): QueryExecuteCompleteNotificationResult = {
    val __obj = js.Dynamic.literal(batchSummaries = batchSummaries.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteCompleteNotificationResult]
  }
  @scala.inline
  implicit class QueryExecuteCompleteNotificationResultOps[Self <: QueryExecuteCompleteNotificationResult] (val x: Self) extends AnyVal {
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
    def setBatchSummariesVarargs(value: BatchSummary*): Self = this.set("batchSummaries", js.Array(value :_*))
    @scala.inline
    def setBatchSummaries(value: js.Array[BatchSummary]): Self = this.set("batchSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
  }
  
}

