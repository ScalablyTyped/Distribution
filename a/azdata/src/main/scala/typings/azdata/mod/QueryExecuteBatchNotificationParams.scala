package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecuteBatchNotificationParams extends js.Object {
  var batchSummary: BatchSummary
  var ownerUri: String
}

object QueryExecuteBatchNotificationParams {
  @scala.inline
  def apply(batchSummary: BatchSummary, ownerUri: String): QueryExecuteBatchNotificationParams = {
    val __obj = js.Dynamic.literal(batchSummary = batchSummary.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryExecuteBatchNotificationParams]
  }
}

