package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRemediationExceptionsResponse extends js.Object {
  /**
    * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches] = js.native
}

object DeleteRemediationExceptionsResponse {
  @scala.inline
  def apply(): DeleteRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRemediationExceptionsResponse]
  }
  @scala.inline
  implicit class DeleteRemediationExceptionsResponseOps[Self <: DeleteRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedBatchesVarargs(value: FailedDeleteRemediationExceptionsBatch*): Self = this.set("FailedBatches", js.Array(value :_*))
    @scala.inline
    def setFailedBatches(value: FailedDeleteRemediationExceptionsBatches): Self = this.set("FailedBatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedBatches: Self = this.set("FailedBatches", js.undefined)
  }
  
}

