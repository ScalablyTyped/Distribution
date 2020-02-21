package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_SubscriptionNotification: SubscriptionNotificationKind
  var subscription: Subscription
}

object SubscriptionNotification {
  @scala.inline
  def apply(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: Date): SubscriptionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionNotification]
  }
}

