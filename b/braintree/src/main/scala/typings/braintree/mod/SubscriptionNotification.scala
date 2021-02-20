package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SubscriptionNotificationMutableBuilder[Self <: SubscriptionNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: SubscriptionNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
  }
}
