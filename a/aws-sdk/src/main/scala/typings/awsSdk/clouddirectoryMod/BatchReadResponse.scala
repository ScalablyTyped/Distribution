package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadResponse extends js.Object {
  /**
    * A list of all the responses for each batch read.
    */
  var Responses: js.UndefOr[BatchReadOperationResponseList] = js.native
}

object BatchReadResponse {
  @scala.inline
  def apply(): BatchReadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadResponse]
  }
  @scala.inline
  implicit class BatchReadResponseOps[Self <: BatchReadResponse] (val x: Self) extends AnyVal {
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
    def setResponsesVarargs(value: BatchReadOperationResponse*): Self = this.set("Responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: BatchReadOperationResponseList): Self = this.set("Responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("Responses", js.undefined)
  }
  
}

