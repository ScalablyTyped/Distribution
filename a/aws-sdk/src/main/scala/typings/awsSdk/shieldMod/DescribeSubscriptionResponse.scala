package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSubscriptionResponse extends StObject {
  
  /**
    * The AWS Shield Advanced subscription details for an account.
    */
  var Subscription: js.UndefOr[typings.awsSdk.shieldMod.Subscription] = js.native
}
object DescribeSubscriptionResponse {
  
  @scala.inline
  def apply(): DescribeSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscriptionResponse]
  }
  
  @scala.inline
  implicit class DescribeSubscriptionResponseMutableBuilder[Self <: DescribeSubscriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscription(value: Subscription): Self = StObject.set(x, "Subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "Subscription", js.undefined)
  }
}
