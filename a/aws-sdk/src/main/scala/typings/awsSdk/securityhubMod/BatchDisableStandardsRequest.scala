package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisableStandardsRequest extends js.Object {
  /**
    * The ARNs of the standards subscriptions to disable.
    */
  var StandardsSubscriptionArns: typings.awsSdk.securityhubMod.StandardsSubscriptionArns = js.native
}

object BatchDisableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
}

