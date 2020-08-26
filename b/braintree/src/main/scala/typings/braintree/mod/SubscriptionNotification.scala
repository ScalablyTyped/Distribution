package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_SubscriptionNotification: SubscriptionNotificationKind = js.native
  var subscription: Subscription = js.native
}

object SubscriptionNotification {
  @scala.inline
  def apply(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: Date): SubscriptionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionNotification]
  }
  @scala.inline
  implicit class SubscriptionNotificationOps[Self <: SubscriptionNotification] (val x: Self) extends AnyVal {
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
    def setKind(value: SubscriptionNotificationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
  
}

