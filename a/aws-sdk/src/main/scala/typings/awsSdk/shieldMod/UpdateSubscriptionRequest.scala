package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriptionRequest extends StObject {
  
  /**
    * When you initally create a subscription, AutoRenew is set to ENABLED. If ENABLED, the subscription will be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. If the UpdateSubscription request does not included a value for AutoRenew, the existing value for AutoRenew remains unchanged.
    */
  var AutoRenew: js.UndefOr[typings.awsSdk.shieldMod.AutoRenew] = js.undefined
}
object UpdateSubscriptionRequest {
  
  inline def apply(): UpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubscriptionRequest]
  }
  
  extension [Self <: UpdateSubscriptionRequest](x: Self) {
    
    inline def setAutoRenew(value: AutoRenew): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
  }
}
