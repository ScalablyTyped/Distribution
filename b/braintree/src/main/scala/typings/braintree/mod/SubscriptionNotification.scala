package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionNotification
  extends StObject
     with BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_SubscriptionNotification: SubscriptionNotificationKind
  
  var subscription: Subscription
}
object SubscriptionNotification {
  
  inline def apply(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: js.Date): SubscriptionNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionNotification]
  }
  
  extension [Self <: SubscriptionNotification](x: Self) {
    
    inline def setKind(value: SubscriptionNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
  }
}
