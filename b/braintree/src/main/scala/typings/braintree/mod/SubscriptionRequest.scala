package typings.braintree.mod

import typings.braintree.anon.Add
import typings.braintree.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionRequest extends StObject {
  
  var addOns: js.UndefOr[Add] = js.undefined
  
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  
  var discounts: js.UndefOr[Remove] = js.undefined
  
  var firstBillingDate: js.UndefOr[js.Date] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var merchantAccountId: js.UndefOr[String] = js.undefined
  
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  
  var paymentMethodToken: js.UndefOr[String] = js.undefined
  
  var planId: String
  
  var price: js.UndefOr[String] = js.undefined
}
object SubscriptionRequest {
  
  inline def apply(planId: String): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setAddOns(value: Add): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setDescriptor(value: Descriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    inline def setDiscounts(value: Remove): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setFirstBillingDate(value: js.Date): Self = StObject.set(x, "firstBillingDate", value.asInstanceOf[js.Any])
    
    inline def setFirstBillingDateUndefined: Self = StObject.set(x, "firstBillingDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    inline def setNeverExpires(value: Boolean): Self = StObject.set(x, "neverExpires", value.asInstanceOf[js.Any])
    
    inline def setNeverExpiresUndefined: Self = StObject.set(x, "neverExpires", js.undefined)
    
    inline def setNumberOfBillingCycles(value: Double): Self = StObject.set(x, "numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBillingCyclesUndefined: Self = StObject.set(x, "numberOfBillingCycles", js.undefined)
    
    inline def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    inline def setPaymentMethodToken(value: String): Self = StObject.set(x, "paymentMethodToken", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodTokenUndefined: Self = StObject.set(x, "paymentMethodToken", js.undefined)
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
