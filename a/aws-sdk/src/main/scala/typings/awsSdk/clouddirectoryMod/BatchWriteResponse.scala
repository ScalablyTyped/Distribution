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
  def apply(): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteResponse]
  }
  @scala.inline
  implicit class BatchWriteResponseOps[Self <: BatchWriteResponse] (val x: Self) extends AnyVal {
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
    def setResponsesVarargs(value: BatchWriteOperationResponse*): Self = this.set("Responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: BatchWriteOperationResponseList): Self = this.set("Responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("Responses", js.undefined)
  }
  
}

