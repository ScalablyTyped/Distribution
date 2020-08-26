package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionStateResponse extends js.Object {
  /**
    * The status of the subscription.
    */
  var SubscriptionState: typings.awsSdk.shieldMod.SubscriptionState = js.native
}

object GetSubscriptionStateResponse {
  @scala.inline
  def apply(SubscriptionState: SubscriptionState): GetSubscriptionStateResponse = {
    val __obj = js.Dynamic.literal(SubscriptionState = SubscriptionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionStateResponse]
  }
  @scala.inline
  implicit class GetSubscriptionStateResponseOps[Self <: GetSubscriptionStateResponse] (val x: Self) extends AnyVal {
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
    def setSubscriptionState(value: SubscriptionState): Self = this.set("SubscriptionState", value.asInstanceOf[js.Any])
  }
  
}

