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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionRequest extends StObject {
  
  var amount: String
  
  var billing: js.UndefOr[CountryCodeNumeric] = js.undefined
  
  var billingAddressId: js.UndefOr[String] = js.undefined
  
  var channel: js.UndefOr[String] = js.undefined
  
  var creditCard: js.UndefOr[Cvv] = js.undefined
  
  var customFields: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var customer: js.UndefOr[Email] = js.undefined
  
  var customerId: js.UndefOr[String] = js.undefined
  
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  
  var deviceData: js.UndefOr[String] = js.undefined
  
  var deviceSessionId: js.UndefOr[String] = js.undefined
  
  var discountAmount: js.UndefOr[String] = js.undefined
  
  var externalVault: js.UndefOr[PreviousNetworkTransactionId] = js.undefined
  
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.undefined
  
  var merchantAccountId: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[AddBillingAddressToPaymentMethod] = js.undefined
  
  var orderId: js.UndefOr[String] = js.undefined
  
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  
  var paymentMethodToken: js.UndefOr[String] = js.undefined
  
  var purchaseOrderNumber: js.UndefOr[String] = js.undefined
  
  var recurring: js.UndefOr[Boolean] = js.undefined
  
  // Deprecated
  var riskData: js.UndefOr[CustomerRiskData] = js.undefined
  
  var serviceFeeAmount: js.UndefOr[String] = js.undefined
  
  var sharedBillingAddressId: js.UndefOr[String] = js.undefined
  
  var sharedCustomerId: js.UndefOr[String] = js.undefined
  
  var sharedPaymentMethodNonce: js.UndefOr[String] = js.undefined
  
  var sharedPaymentMethodToken: js.UndefOr[String] = js.undefined
  
  var sharedShippingAddressId: js.UndefOr[String] = js.undefined
  
  var shipping: js.UndefOr[Company] = js.undefined
  
  var shippingAddressId: js.UndefOr[String] = js.undefined
  
  var shippingAmount: js.UndefOr[String] = js.undefined
  
  var shipsFromPostalCode: js.UndefOr[String] = js.undefined
  
  var taxAmount: js.UndefOr[String] = js.undefined
  
  var taxExempt: js.UndefOr[Boolean] = js.undefined
  
  var threeDSecurePassThru: js.UndefOr[Cavv] = js.undefined
  
  var transactionSource: js.UndefOr[TransactionRequestSource] = js.undefined
}
object TransactionRequest {
  
  inline def apply(amount: String): TransactionRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRequest]
  }
  
  extension [Self <: TransactionRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: CountryCodeNumeric): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressId(value: String): Self = StObject.set(x, "billingAddressId", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressIdUndefined: Self = StObject.set(x, "billingAddressId", js.undefined)
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCreditCard(value: Cvv): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    inline def setCustomFields(value: Record[String, js.Any]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomer(value: Email): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setDescriptor(value: Descriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    inline def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    inline def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    inline def setDeviceSessionId(value: String): Self = StObject.set(x, "deviceSessionId", value.asInstanceOf[js.Any])
    
    inline def setDeviceSessionIdUndefined: Self = StObject.set(x, "deviceSessionId", js.undefined)
    
    inline def setDiscountAmount(value: String): Self = StObject.set(x, "discountAmount", value.asInstanceOf[js.Any])
    
    inline def setDiscountAmountUndefined: Self = StObject.set(x, "discountAmount", js.undefined)
    
    inline def setExternalVault(value: PreviousNetworkTransactionId): Self = StObject.set(x, "externalVault", value.asInstanceOf[js.Any])
    
    inline def setExternalVaultUndefined: Self = StObject.set(x, "externalVault", js.undefined)
    
    inline def setLineItems(value: js.Array[TransactionLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: TransactionLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    inline def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    inline def setOptions(value: AddBillingAddressToPaymentMethod): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    inline def setPaymentMethodToken(value: String): Self = StObject.set(x, "paymentMethodToken", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodTokenUndefined: Self = StObject.set(x, "paymentMethodToken", js.undefined)
    
    inline def setPurchaseOrderNumber(value: String): Self = StObject.set(x, "purchaseOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderNumberUndefined: Self = StObject.set(x, "purchaseOrderNumber", js.undefined)
    
    inline def setRecurring(value: Boolean): Self = StObject.set(x, "recurring", value.asInstanceOf[js.Any])
    
    inline def setRecurringUndefined: Self = StObject.set(x, "recurring", js.undefined)
    
    inline def setRiskData(value: CustomerRiskData): Self = StObject.set(x, "riskData", value.asInstanceOf[js.Any])
    
    inline def setRiskDataUndefined: Self = StObject.set(x, "riskData", js.undefined)
    
    inline def setServiceFeeAmount(value: String): Self = StObject.set(x, "serviceFeeAmount", value.asInstanceOf[js.Any])
    
    inline def setServiceFeeAmountUndefined: Self = StObject.set(x, "serviceFeeAmount", js.undefined)
    
    inline def setSharedBillingAddressId(value: String): Self = StObject.set(x, "sharedBillingAddressId", value.asInstanceOf[js.Any])
    
    inline def setSharedBillingAddressIdUndefined: Self = StObject.set(x, "sharedBillingAddressId", js.undefined)
    
    inline def setSharedCustomerId(value: String): Self = StObject.set(x, "sharedCustomerId", value.asInstanceOf[js.Any])
    
    inline def setSharedCustomerIdUndefined: Self = StObject.set(x, "sharedCustomerId", js.undefined)
    
    inline def setSharedPaymentMethodNonce(value: String): Self = StObject.set(x, "sharedPaymentMethodNonce", value.asInstanceOf[js.Any])
    
    inline def setSharedPaymentMethodNonceUndefined: Self = StObject.set(x, "sharedPaymentMethodNonce", js.undefined)
    
    inline def setSharedPaymentMethodToken(value: String): Self = StObject.set(x, "sharedPaymentMethodToken", value.asInstanceOf[js.Any])
    
    inline def setSharedPaymentMethodTokenUndefined: Self = StObject.set(x, "sharedPaymentMethodToken", js.undefined)
    
    inline def setSharedShippingAddressId(value: String): Self = StObject.set(x, "sharedShippingAddressId", value.asInstanceOf[js.Any])
    
    inline def setSharedShippingAddressIdUndefined: Self = StObject.set(x, "sharedShippingAddressId", js.undefined)
    
    inline def setShipping(value: Company): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressId(value: String): Self = StObject.set(x, "shippingAddressId", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressIdUndefined: Self = StObject.set(x, "shippingAddressId", js.undefined)
    
    inline def setShippingAmount(value: String): Self = StObject.set(x, "shippingAmount", value.asInstanceOf[js.Any])
    
    inline def setShippingAmountUndefined: Self = StObject.set(x, "shippingAmount", js.undefined)
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setShipsFromPostalCode(value: String): Self = StObject.set(x, "shipsFromPostalCode", value.asInstanceOf[js.Any])
    
    inline def setShipsFromPostalCodeUndefined: Self = StObject.set(x, "shipsFromPostalCode", js.undefined)
    
    inline def setTaxAmount(value: String): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
    
    inline def setTaxExempt(value: Boolean): Self = StObject.set(x, "taxExempt", value.asInstanceOf[js.Any])
    
    inline def setTaxExemptUndefined: Self = StObject.set(x, "taxExempt", js.undefined)
    
    inline def setThreeDSecurePassThru(value: Cavv): Self = StObject.set(x, "threeDSecurePassThru", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecurePassThruUndefined: Self = StObject.set(x, "threeDSecurePassThru", js.undefined)
    
    inline def setTransactionSource(value: TransactionRequestSource): Self = StObject.set(x, "transactionSource", value.asInstanceOf[js.Any])
    
    inline def setTransactionSourceUndefined: Self = StObject.set(x, "transactionSource", js.undefined)
  }
}
