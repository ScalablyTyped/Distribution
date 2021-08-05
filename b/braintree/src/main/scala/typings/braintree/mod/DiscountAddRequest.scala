package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountAddRequest extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var inheritedFromId: String
  
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
}
object DiscountAddRequest {
  
  inline def apply(inheritedFromId: String): DiscountAddRequest = {
    val __obj = js.Dynamic.literal(inheritedFromId = inheritedFromId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountAddRequest]
  }
  
  extension [Self <: DiscountAddRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setInheritedFromId(value: String): Self = StObject.set(x, "inheritedFromId", value.asInstanceOf[js.Any])
    
    inline def setNeverExpires(value: Boolean): Self = StObject.set(x, "neverExpires", value.asInstanceOf[js.Any])
    
    inline def setNeverExpiresUndefined: Self = StObject.set(x, "neverExpires", js.undefined)
    
    inline def setNumberOfBillingCycles(value: Double): Self = StObject.set(x, "numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBillingCyclesUndefined: Self = StObject.set(x, "numberOfBillingCycles", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
