package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteResponse extends js.Object {
  /**
    * A list of all the responses for each batch write.
    */
  var Responses: js.UndefOr[BatchWriteOperationResponseList] = js.native
}

object BatchWriteResponse {
  @scala.inline
  def apply(Responses: BatchWriteOperationResponseList = null): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    if (Responses != null) __obj.updateDynamic("Responses")(Responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteResponse]
  }
}

