package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSubscriptionResponse extends StObject {
  
  /**
    * The ARN of the created subscription.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
}
object ConfirmSubscriptionResponse {
  
  @scala.inline
  def apply(): ConfirmSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSubscriptionResponse]
  }
  
  @scala.inline
  implicit class ConfirmSubscriptionResponseMutableBuilder[Self <: ConfirmSubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
  }
}
