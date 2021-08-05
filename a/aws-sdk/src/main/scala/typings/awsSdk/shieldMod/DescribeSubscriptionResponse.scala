package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscriptionResponse extends StObject {
  
  /**
    * The AWS Shield Advanced subscription details for an account.
    */
  var Subscription: js.UndefOr[typings.awsSdk.shieldMod.Subscription] = js.undefined
}
object DescribeSubscriptionResponse {
  
  inline def apply(): DescribeSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscriptionResponse]
  }
  
  extension [Self <: DescribeSubscriptionResponse](x: Self) {
    
    inline def setSubscription(value: Subscription): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
  }
}
