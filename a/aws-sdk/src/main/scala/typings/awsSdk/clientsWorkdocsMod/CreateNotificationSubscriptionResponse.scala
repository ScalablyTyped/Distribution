package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationSubscriptionResponse extends StObject {
  
  /**
    * The subscription.
    */
  var Subscription: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.Subscription] = js.undefined
}
object CreateNotificationSubscriptionResponse {
  
  inline def apply(): CreateNotificationSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNotificationSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
  }
}
