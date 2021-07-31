package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscribeInput extends StObject {
  
  /**
    * The ARN of the subscription to be deleted.
    */
  var SubscriptionArn: subscriptionARN
}
object UnsubscribeInput {
  
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): UnsubscribeInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeInput]
  }
  
  @scala.inline
  implicit class UnsubscribeInputMutableBuilder[Self <: UnsubscribeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
