package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionAttributesInput extends StObject {
  
  /**
    * The ARN of the subscription whose properties you want to get.
    */
  var SubscriptionArn: subscriptionARN
}
object GetSubscriptionAttributesInput {
  
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): GetSubscriptionAttributesInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionAttributesInput]
  }
  
  @scala.inline
  implicit class GetSubscriptionAttributesInputMutableBuilder[Self <: GetSubscriptionAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
