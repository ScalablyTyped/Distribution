package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedItemDetails extends js.Object {
  /**
    * The status code of a failed item.
    */
  var failureCode: FailedItemErrorCode = js.native
  /**
    * Indicates whether you can immediately retry a request for this item for a specified resource.
    */
  var retryable: Bool = js.native
}

object FailedItemDetails {
  @scala.inline
  def apply(failureCode: FailedItemErrorCode, retryable: Bool): FailedItemDetails = {
    val __obj = js.Dynamic.literal(failureCode = failureCode.asInstanceOf[js.Any], retryable = retryable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedItemDetails]
  }
}

