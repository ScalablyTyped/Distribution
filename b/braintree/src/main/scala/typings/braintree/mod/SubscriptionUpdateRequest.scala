package typings.braintree.mod

import typings.braintree.anon.Paypal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionUpdateRequest
  extends StObject
     with SubscriptionRequest {
  
  var options: js.UndefOr[Paypal] = js.undefined
}
object SubscriptionUpdateRequest {
  
  inline def apply(planId: String): SubscriptionUpdateRequest = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Paypal): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
