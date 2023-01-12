package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOnUpdateRequest extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var existingId: String
  
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
}
object AddOnUpdateRequest {
  
  inline def apply(existingId: String): AddOnUpdateRequest = {
    val __obj = js.Dynamic.literal(existingId = existingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOnUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setExistingId(value: String): Self = StObject.set(x, "existingId", value.asInstanceOf[js.Any])
    
    inline def setNeverExpires(value: Boolean): Self = StObject.set(x, "neverExpires", value.asInstanceOf[js.Any])
    
    inline def setNeverExpiresUndefined: Self = StObject.set(x, "neverExpires", js.undefined)
    
    inline def setNumberOfBillingCycles(value: Double): Self = StObject.set(x, "numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBillingCyclesUndefined: Self = StObject.set(x, "numberOfBillingCycles", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
