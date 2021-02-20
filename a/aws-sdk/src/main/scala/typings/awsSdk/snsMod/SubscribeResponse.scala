package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeResponse extends StObject {
  
  /**
    * The ARN of the subscription if it is confirmed, or the string "pending confirmation" if the subscription requires confirmation. However, if the API request parameter ReturnSubscriptionArn is true, then the value is always the subscription ARN, even if the subscription requires confirmation.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.native
}
object SubscribeResponse {
  
  @scala.inline
  def apply(): SubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeResponse]
  }
  
  @scala.inline
  implicit class SubscribeResponseMutableBuilder[Self <: SubscribeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionArn(value: subscriptionARN): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionArnUndefined: Self = StObject.set(x, "SubscriptionArn", js.undefined)
  }
}
