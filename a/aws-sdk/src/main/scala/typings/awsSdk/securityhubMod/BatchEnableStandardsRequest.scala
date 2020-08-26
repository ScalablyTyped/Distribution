package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEnableStandardsRequest extends js.Object {
  /**
    * The list of standards checks to enable.
    */
  var StandardsSubscriptionRequests: typings.awsSdk.securityhubMod.StandardsSubscriptionRequests = js.native
}

object BatchEnableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionRequests: StandardsSubscriptionRequests): BatchEnableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionRequests = StandardsSubscriptionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEnableStandardsRequest]
  }
  @scala.inline
  implicit class BatchEnableStandardsRequestOps[Self <: BatchEnableStandardsRequest] (val x: Self) extends AnyVal {
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
    def setStandardsSubscriptionRequestsVarargs(value: StandardsSubscriptionRequest*): Self = this.set("StandardsSubscriptionRequests", js.Array(value :_*))
    @scala.inline
    def setStandardsSubscriptionRequests(value: StandardsSubscriptionRequests): Self = this.set("StandardsSubscriptionRequests", value.asInstanceOf[js.Any])
  }
  
}

