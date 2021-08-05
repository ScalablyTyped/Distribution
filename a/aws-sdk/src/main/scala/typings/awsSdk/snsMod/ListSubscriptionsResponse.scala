package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionsResponse extends StObject {
  
  /**
    * Token to pass along to the next ListSubscriptions request. This element is returned if there are more subscriptions to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
}
object ListSubscriptionsResponse {
  
  inline def apply(): ListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsResponse]
  }
  
  extension [Self <: ListSubscriptionsResponse](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubscriptions(value: SubscriptionsList): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value :_*))
  }
}
