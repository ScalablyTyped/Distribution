package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventSubscriptionsResponse extends StObject {
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Details of the returned event subscriptions.
    */
  var subscriptions: SubscriptionList
}
object ListEventSubscriptionsResponse {
  
  @scala.inline
  def apply(subscriptions: SubscriptionList): ListEventSubscriptionsResponse = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSubscriptionsResponse]
  }
  
  @scala.inline
  implicit class ListEventSubscriptionsResponseMutableBuilder[Self <: ListEventSubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: SubscriptionList): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
