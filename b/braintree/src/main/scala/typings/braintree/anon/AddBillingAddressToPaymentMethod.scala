package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBillingAddressToPaymentMethod extends StObject {
  
  var addBillingAddressToPaymentMethod: js.UndefOr[Boolean] = js.undefined
  
  var holdInEscrow: js.UndefOr[Boolean] = js.undefined
  
  var paypal: js.UndefOr[CustomField] = js.undefined
  
  var skipAdvancedFraudChecking: js.UndefOr[Boolean] = js.undefined
  
  var skipAvs: js.UndefOr[Boolean] = js.undefined
  
  var skipCvv: js.UndefOr[Boolean] = js.undefined
  
  var storeInVault: js.UndefOr[Boolean] = js.undefined
  
  var storeInVaultOnSuccess: js.UndefOr[Boolean] = js.undefined
  
  var storeShippingAddressInVault: js.UndefOr[Boolean] = js.undefined
  
  var submitForSettlement: js.UndefOr[Boolean] = js.undefined
  
  var threeDSecure: js.UndefOr[Required] = js.undefined
  
  var venmo: js.UndefOr[ProfileId] = js.undefined
}
object AddBillingAddressToPaymentMethod {
  
  inline def apply(): AddBillingAddressToPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBillingAddressToPaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddBillingAddressToPaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setAddBillingAddressToPaymentMethod(value: Boolean): Self = StObject.set(x, "addBillingAddressToPaymentMethod", value.asInstanceOf[js.Any])
    
    inline def setAddBillingAddressToPaymentMethodUndefined: Self = StObject.set(x, "addBillingAddressToPaymentMethod", js.undefined)
    
    inline def setHoldInEscrow(value: Boolean): Self = StObject.set(x, "holdInEscrow", value.asInstanceOf[js.Any])
    
    inline def setHoldInEscrowUndefined: Self = StObject.set(x, "holdInEscrow", js.undefined)
    
    inline def setPaypal(value: CustomField): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    inline def setSkipAdvancedFraudChecking(value: Boolean): Self = StObject.set(x, "skipAdvancedFraudChecking", value.asInstanceOf[js.Any])
    
    inline def setSkipAdvancedFraudCheckingUndefined: Self = StObject.set(x, "skipAdvancedFraudChecking", js.undefined)
    
    inline def setSkipAvs(value: Boolean): Self = StObject.set(x, "skipAvs", value.asInstanceOf[js.Any])
    
    inline def setSkipAvsUndefined: Self = StObject.set(x, "skipAvs", js.undefined)
    
    inline def setSkipCvv(value: Boolean): Self = StObject.set(x, "skipCvv", value.asInstanceOf[js.Any])
    
    inline def setSkipCvvUndefined: Self = StObject.set(x, "skipCvv", js.undefined)
    
    inline def setStoreInVault(value: Boolean): Self = StObject.set(x, "storeInVault", value.asInstanceOf[js.Any])
    
    inline def setStoreInVaultOnSuccess(value: Boolean): Self = StObject.set(x, "storeInVaultOnSuccess", value.asInstanceOf[js.Any])
    
    inline def setStoreInVaultOnSuccessUndefined: Self = StObject.set(x, "storeInVaultOnSuccess", js.undefined)
    
    inline def setStoreInVaultUndefined: Self = StObject.set(x, "storeInVault", js.undefined)
    
    inline def setStoreShippingAddressInVault(value: Boolean): Self = StObject.set(x, "storeShippingAddressInVault", value.asInstanceOf[js.Any])
    
    inline def setStoreShippingAddressInVaultUndefined: Self = StObject.set(x, "storeShippingAddressInVault", js.undefined)
    
    inline def setSubmitForSettlement(value: Boolean): Self = StObject.set(x, "submitForSettlement", value.asInstanceOf[js.Any])
    
    inline def setSubmitForSettlementUndefined: Self = StObject.set(x, "submitForSettlement", js.undefined)
    
    inline def setThreeDSecure(value: Required): Self = StObject.set(x, "threeDSecure", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecureUndefined: Self = StObject.set(x, "threeDSecure", js.undefined)
    
    inline def setVenmo(value: ProfileId): Self = StObject.set(x, "venmo", value.asInstanceOf[js.Any])
    
    inline def setVenmoUndefined: Self = StObject.set(x, "venmo", js.undefined)
  }
}
