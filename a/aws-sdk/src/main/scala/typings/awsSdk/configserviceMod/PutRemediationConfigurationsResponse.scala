package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationConfigurationsResponse extends js.Object {
  /**
    * Returns a list of failed remediation batch objects.
    */
  var FailedBatches: js.UndefOr[FailedRemediationBatches] = js.native
}

object PutRemediationConfigurationsResponse {
  @scala.inline
  def apply(): PutRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRemediationConfigurationsResponse]
  }
  @scala.inline
  implicit class PutRemediationConfigurationsResponseOps[Self <: PutRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
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
    def setFailedBatchesVarargs(value: FailedRemediationBatch*): Self = this.set("FailedBatches", js.Array(value :_*))
    @scala.inline
    def setFailedBatches(value: FailedRemediationBatches): Self = this.set("FailedBatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedBatches: Self = this.set("FailedBatches", js.undefined)
  }
  
}

