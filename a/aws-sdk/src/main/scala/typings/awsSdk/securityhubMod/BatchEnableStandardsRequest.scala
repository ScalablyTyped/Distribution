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
}

