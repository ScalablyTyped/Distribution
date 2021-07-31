package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionStateResponse extends StObject {
  
  /**
    * The status of the subscription.
    */
  var SubscriptionState: typings.awsSdk.shieldMod.SubscriptionState
}
object GetSubscriptionStateResponse {
  
  @scala.inline
  def apply(SubscriptionState: SubscriptionState): GetSubscriptionStateResponse = {
    val __obj = js.Dynamic.literal(SubscriptionState = SubscriptionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionStateResponse]
  }
  
  @scala.inline
  implicit class GetSubscriptionStateResponseMutableBuilder[Self <: GetSubscriptionStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionState(value: SubscriptionState): Self = StObject.set(x, "SubscriptionState", value.asInstanceOf[js.Any])
  }
}
