package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessLogSubscriptionsResponse extends StObject {
  
  /**
    * The access log subscriptions.
    */
  var items: AccessLogSubscriptionList
  
  /**
    * A pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAccessLogSubscriptionsResponse {
  
  inline def apply(items: AccessLogSubscriptionList): ListAccessLogSubscriptionsResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessLogSubscriptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessLogSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AccessLogSubscriptionList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: AccessLogSubscriptionSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
