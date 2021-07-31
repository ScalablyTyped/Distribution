package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionsByTopicResponse extends StObject {
  
  /**
    * Token to pass along to the next ListSubscriptionsByTopic request. This element is returned if there are more subscriptions to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
}
object ListSubscriptionsByTopicResponse {
  
  @scala.inline
  def apply(): ListSubscriptionsByTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsByTopicResponse]
  }
  
  @scala.inline
  implicit class ListSubscriptionsByTopicResponseMutableBuilder[Self <: ListSubscriptionsByTopicResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsList): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value :_*))
  }
}
