package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubscriptionDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: string
  
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[listOfSubscription] = js.undefined
}
object CreateSubscriptionDefinitionVersionRequest {
  
  @scala.inline
  def apply(SubscriptionDefinitionId: string): CreateSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class CreateSubscriptionDefinitionVersionRequestMutableBuilder[Self <: CreateSubscriptionDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setSubscriptionDefinitionId(value: string): Self = StObject.set(x, "SubscriptionDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: listOfSubscription): Self = StObject.set(x, "Subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsUndefined: Self = StObject.set(x, "Subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "Subscriptions", js.Array(value :_*))
  }
}
