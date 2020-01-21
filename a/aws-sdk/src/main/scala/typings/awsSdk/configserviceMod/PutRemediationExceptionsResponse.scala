package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationExceptionsResponse extends js.Object {
  /**
    * Returns a list of failed remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedRemediationExceptionBatches] = js.native
}

object PutRemediationExceptionsResponse {
  @scala.inline
  def apply(FailedBatches: FailedRemediationExceptionBatches = null): PutRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedBatches != null) __obj.updateDynamic("FailedBatches")(FailedBatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationExceptionsResponse]
  }
}

