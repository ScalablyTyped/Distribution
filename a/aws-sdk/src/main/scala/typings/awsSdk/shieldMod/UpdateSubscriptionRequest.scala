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
  def apply(): UpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriptionRequest]
  }
  @scala.inline
  implicit class UpdateSubscriptionRequestOps[Self <: UpdateSubscriptionRequest] (val x: Self) extends AnyVal {
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
    def setAutoRenew(value: AutoRenew): Self = this.set("AutoRenew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRenew: Self = this.set("AutoRenew", js.undefined)
  }
  
}

