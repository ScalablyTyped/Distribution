package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscountUpdateRequest extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var existingId: String
  
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
}
object DiscountUpdateRequest {
  
  @scala.inline
  def apply(existingId: String): DiscountUpdateRequest = {
    val __obj = js.Dynamic.literal(existingId = existingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountUpdateRequest]
  }
  
  @scala.inline
  implicit class DiscountUpdateRequestMutableBuilder[Self <: DiscountUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setExistingId(value: String): Self = StObject.set(x, "existingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = StObject.set(x, "neverExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpiresUndefined: Self = StObject.set(x, "neverExpires", js.undefined)
    
    @scala.inline
    def setNumberOfBillingCycles(value: Double): Self = StObject.set(x, "numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBillingCyclesUndefined: Self = StObject.set(x, "numberOfBillingCycles", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
