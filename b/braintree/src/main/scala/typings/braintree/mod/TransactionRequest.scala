package typings.braintree.mod

import typings.braintree.anon.AddBillingAddressToPaymentMethod
import typings.braintree.anon.Cavv
import typings.braintree.anon.Company
import typings.braintree.anon.CountryCodeNumeric
import typings.braintree.anon.Cvv
import typings.braintree.anon.Email
import typings.braintree.anon.PreviousNetworkTransactionId
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionRequest extends StObject {
  
  var amount: String = js.native
  
  var billing: js.UndefOr[CountryCodeNumeric] = js.native
  
  var billingAddressId: js.UndefOr[String] = js.native
  
  var channel: js.UndefOr[String] = js.native
  
  var creditCard: js.UndefOr[Cvv] = js.native
  
  var customFields: js.UndefOr[Record[String, _]] = js.native
  
  var customer: js.UndefOr[Email] = js.native
  
  var customerId: js.UndefOr[String] = js.native
  
  var descriptor: js.UndefOr[Descriptor] = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var deviceSessionId: js.UndefOr[String] = js.native
  
  var discountAmount: js.UndefOr[String] = js.native
  
  var externalVault: js.UndefOr[PreviousNetworkTransactionId] = js.native
  
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.native
  
  var merchantAccountId: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[AddBillingAddressToPaymentMethod] = js.native
  
  var orderId: js.UndefOr[String] = js.native
  
  var paymentMethodNonce: js.UndefOr[String] = js.native
  
  var paymentMethodToken: js.UndefOr[String] = js.native
  
  var purchaseOrderNumber: js.UndefOr[String] = js.native
  
  var recurring: js.UndefOr[Boolean] = js.native
  
  // Deprecated
  var riskData: js.UndefOr[CustomerRiskData] = js.native
  
  var serviceFeeAmount: js.UndefOr[String] = js.native
  
  var sharedBillingAddressId: js.UndefOr[String] = js.native
  
  var sharedCustomerId: js.UndefOr[String] = js.native
  
  var sharedPaymentMethodNonce: js.UndefOr[String] = js.native
  
  var sharedPaymentMethodToken: js.UndefOr[String] = js.native
  
  var sharedShippingAddressId: js.UndefOr[String] = js.native
  
  var shipping: js.UndefOr[Company] = js.native
  
  var shippingAddressId: js.UndefOr[String] = js.native
  
  var shippingAmount: js.UndefOr[String] = js.native
  
  var shipsFromPostalCode: js.UndefOr[String] = js.native
  
  var taxAmount: js.UndefOr[String] = js.native
  
  var taxExempt: js.UndefOr[Boolean] = js.native
  
  var threeDSecurePassThru: js.UndefOr[Cavv] = js.native
  
  var transactionSource: js.UndefOr[TransactionRequestSource] = js.native
}
object TransactionRequest {
  
  @scala.inline
  def apply(amount: String): TransactionRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRequest]
  }
  
  @scala.inline
  implicit class TransactionRequestMutableBuilder[Self <: TransactionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling(value: CountryCodeNumeric): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressId(value: String): Self = StObject.set(x, "billingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressIdUndefined: Self = StObject.set(x, "billingAddressId", js.undefined)
    
    @scala.inline
    def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setCreditCard(value: Cvv): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    @scala.inline
    def setCustomFields(value: Record[String, _]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomer(value: Email): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDescriptor(value: Descriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setDeviceSessionId(value: String): Self = StObject.set(x, "deviceSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSessionIdUndefined: Self = StObject.set(x, "deviceSessionId", js.undefined)
    
    @scala.inline
    def setDiscountAmount(value: String): Self = StObject.set(x, "discountAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountAmountUndefined: Self = StObject.set(x, "discountAmount", js.undefined)
    
    @scala.inline
    def setExternalVault(value: PreviousNetworkTransactionId): Self = StObject.set(x, "externalVault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalVaultUndefined: Self = StObject.set(x, "externalVault", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[TransactionLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: TransactionLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    @scala.inline
    def setOptions(value: AddBillingAddressToPaymentMethod): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    @scala.inline
    def setPaymentMethodToken(value: String): Self = StObject.set(x, "paymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodTokenUndefined: Self = StObject.set(x, "paymentMethodToken", js.undefined)
    
    @scala.inline
    def setPurchaseOrderNumber(value: String): Self = StObject.set(x, "purchaseOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseOrderNumberUndefined: Self = StObject.set(x, "purchaseOrderNumber", js.undefined)
    
    @scala.inline
    def setRecurring(value: Boolean): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
    
    @scala.inline
    def setRiskData(value: CustomerRiskData): Self = StObject.set(x, "riskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskDataUndefined: Self = StObject.set(x, "riskData", js.undefined)
    
    @scala.inline
    def setServiceFeeAmount(value: String): Self = StObject.set(x, "serviceFeeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceFeeAmountUndefined: Self = StObject.set(x, "serviceFeeAmount", js.undefined)
    
    @scala.inline
    def setSharedBillingAddressId(value: String): Self = StObject.set(x, "sharedBillingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedBillingAddressIdUndefined: Self = StObject.set(x, "sharedBillingAddressId", js.undefined)
    
    @scala.inline
    def setSharedCustomerId(value: String): Self = StObject.set(x, "sharedCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedCustomerIdUndefined: Self = StObject.set(x, "sharedCustomerId", js.undefined)
    
    @scala.inline
    def setSharedPaymentMethodNonce(value: String): Self = StObject.set(x, "sharedPaymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedPaymentMethodNonceUndefined: Self = StObject.set(x, "sharedPaymentMethodNonce", js.undefined)
    
    @scala.inline
    def setSharedPaymentMethodToken(value: String): Self = StObject.set(x, "sharedPaymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedPaymentMethodTokenUndefined: Self = StObject.set(x, "sharedPaymentMethodToken", js.undefined)
    
    @scala.inline
    def setSharedShippingAddressId(value: String): Self = StObject.set(x, "sharedShippingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedShippingAddressIdUndefined: Self = StObject.set(x, "sharedShippingAddressId", js.undefined)
    
    @scala.inline
    def setShipping(value: Company): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressId(value: String): Self = StObject.set(x, "shippingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressIdUndefined: Self = StObject.set(x, "shippingAddressId", js.undefined)
    
    @scala.inline
    def setShippingAmount(value: String): Self = StObject.set(x, "shippingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAmountUndefined: Self = StObject.set(x, "shippingAmount", js.undefined)
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setShipsFromPostalCode(value: String): Self = StObject.set(x, "shipsFromPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipsFromPostalCodeUndefined: Self = StObject.set(x, "shipsFromPostalCode", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: String): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
    
    @scala.inline
    def setTaxExempt(value: Boolean): Self = StObject.set(x, "taxExempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxExemptUndefined: Self = StObject.set(x, "taxExempt", js.undefined)
    
    @scala.inline
    def setThreeDSecurePassThru(value: Cavv): Self = StObject.set(x, "threeDSecurePassThru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecurePassThruUndefined: Self = StObject.set(x, "threeDSecurePassThru", js.undefined)
    
    @scala.inline
    def setTransactionSource(value: TransactionRequestSource): Self = StObject.set(x, "transactionSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionSourceUndefined: Self = StObject.set(x, "transactionSource", js.undefined)
  }
}
