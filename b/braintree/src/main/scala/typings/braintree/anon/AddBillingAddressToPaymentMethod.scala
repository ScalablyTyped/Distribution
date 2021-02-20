package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddBillingAddressToPaymentMethod extends StObject {
  
  var addBillingAddressToPaymentMethod: js.UndefOr[Boolean] = js.native
  
  var holdInEscrow: js.UndefOr[Boolean] = js.native
  
  var paypal: js.UndefOr[CustomField] = js.native
  
  var skipAdvancedFraudChecking: js.UndefOr[Boolean] = js.native
  
  var skipAvs: js.UndefOr[Boolean] = js.native
  
  var skipCvv: js.UndefOr[Boolean] = js.native
  
  var storeInVault: js.UndefOr[Boolean] = js.native
  
  var storeInVaultOnSuccess: js.UndefOr[Boolean] = js.native
  
  var storeShippingAddressInVault: js.UndefOr[Boolean] = js.native
  
  var submitForSettlement: js.UndefOr[Boolean] = js.native
  
  var threeDSecure: js.UndefOr[Required] = js.native
  
  var venmo: js.UndefOr[ProfileId] = js.native
}
object AddBillingAddressToPaymentMethod {
  
  @scala.inline
  def apply(): AddBillingAddressToPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBillingAddressToPaymentMethod]
  }
  
  @scala.inline
  implicit class AddBillingAddressToPaymentMethodMutableBuilder[Self <: AddBillingAddressToPaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBillingAddressToPaymentMethod(value: Boolean): Self = StObject.set(x, "addBillingAddressToPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddBillingAddressToPaymentMethodUndefined: Self = StObject.set(x, "addBillingAddressToPaymentMethod", js.undefined)
    
    @scala.inline
    def setHoldInEscrow(value: Boolean): Self = StObject.set(x, "holdInEscrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldInEscrowUndefined: Self = StObject.set(x, "holdInEscrow", js.undefined)
    
    @scala.inline
    def setPaypal(value: CustomField): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    @scala.inline
    def setSkipAdvancedFraudChecking(value: Boolean): Self = StObject.set(x, "skipAdvancedFraudChecking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAdvancedFraudCheckingUndefined: Self = StObject.set(x, "skipAdvancedFraudChecking", js.undefined)
    
    @scala.inline
    def setSkipAvs(value: Boolean): Self = StObject.set(x, "skipAvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAvsUndefined: Self = StObject.set(x, "skipAvs", js.undefined)
    
    @scala.inline
    def setSkipCvv(value: Boolean): Self = StObject.set(x, "skipCvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCvvUndefined: Self = StObject.set(x, "skipCvv", js.undefined)
    
    @scala.inline
    def setStoreInVault(value: Boolean): Self = StObject.set(x, "storeInVault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreInVaultOnSuccess(value: Boolean): Self = StObject.set(x, "storeInVaultOnSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreInVaultOnSuccessUndefined: Self = StObject.set(x, "storeInVaultOnSuccess", js.undefined)
    
    @scala.inline
    def setStoreInVaultUndefined: Self = StObject.set(x, "storeInVault", js.undefined)
    
    @scala.inline
    def setStoreShippingAddressInVault(value: Boolean): Self = StObject.set(x, "storeShippingAddressInVault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreShippingAddressInVaultUndefined: Self = StObject.set(x, "storeShippingAddressInVault", js.undefined)
    
    @scala.inline
    def setSubmitForSettlement(value: Boolean): Self = StObject.set(x, "submitForSettlement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitForSettlementUndefined: Self = StObject.set(x, "submitForSettlement", js.undefined)
    
    @scala.inline
    def setThreeDSecure(value: Required): Self = StObject.set(x, "threeDSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureUndefined: Self = StObject.set(x, "threeDSecure", js.undefined)
    
    @scala.inline
    def setVenmo(value: ProfileId): Self = StObject.set(x, "venmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVenmoUndefined: Self = StObject.set(x, "venmo", js.undefined)
  }
}
