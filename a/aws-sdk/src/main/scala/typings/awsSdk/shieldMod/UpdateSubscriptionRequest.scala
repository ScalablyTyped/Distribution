package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubscriptionRequest extends js.Object {
  /**
    * When you initally create a subscription, AutoRenew is set to ENABLED. If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
    */
  var AutoRenew: js.UndefOr[typings.awsSdk.shieldMod.AutoRenew] = js.native
}

object UpdateSubscriptionRequest {
  @scala.inline
  def apply(AutoRenew: AutoRenew = null): UpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (AutoRenew != null) __obj.updateDynamic("AutoRenew")(AutoRenew.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriptionRequest]
  }
}

