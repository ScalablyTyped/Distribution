package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationSubscriptionResponse extends StObject {
  
  /**
    * The subscription.
    */
  var Subscription: js.UndefOr[typings.awsSdk.workdocsMod.Subscription] = js.native
}
object CreateNotificationSubscriptionResponse {
  
  @scala.inline
  def apply(): CreateNotificationSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationSubscriptionResponse]
  }
  
  @scala.inline
  implicit class CreateNotificationSubscriptionResponseMutableBuilder[Self <: CreateNotificationSubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: Subscription): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
  }
}
