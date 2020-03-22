package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecuteCompleteNotificationResult extends js.Object {
  var batchSummaries: js.Array[BatchSummary]
  var ownerUri: String
}

object QueryExecuteCompleteNotificationResult {
  @scala.inline
  def apply(batchSummaries: js.Array[BatchSummary], ownerUri: String): QueryExecuteCompleteNotificationResult = {
    val __obj = js.Dynamic.literal(batchSummaries = batchSummaries.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryExecuteCompleteNotificationResult]
  }
}

