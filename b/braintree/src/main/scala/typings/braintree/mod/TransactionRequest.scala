package typings.braintree.mod

import typings.braintree.anon.AddBillingAddressToPaymentMethod
import typings.braintree.anon.Cavv
import typings.braintree.anon.Company
import typings.braintree.anon.CountryCodeNumeric
import typings.braintree.anon.Cvv
import typings.braintree.anon.Email
import typings.braintree.anon.PreviousNetworkTransactionId
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionRequest extends js.Object {
  
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
  implicit class TransactionRequestOps[Self <: TransactionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling(value: CountryCodeNumeric): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    
    @scala.inline
    def setBillingAddressId(value: String): Self = this.set("billingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddressId: Self = this.set("billingAddressId", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setCreditCard(value: Cvv): Self = this.set("creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditCard: Self = this.set("creditCard", js.undefined)
    
    @scala.inline
    def setCustomFields(value: Record[String, _]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setCustomer(value: Email): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setDescriptor(value: Descriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptor: Self = this.set("descriptor", js.undefined)
    
    @scala.inline
    def setDeviceData(value: String): Self = this.set("deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceData: Self = this.set("deviceData", js.undefined)
    
    @scala.inline
    def setDeviceSessionId(value: String): Self = this.set("deviceSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSessionId: Self = this.set("deviceSessionId", js.undefined)
    
    @scala.inline
    def setDiscountAmount(value: String): Self = this.set("discountAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscountAmount: Self = this.set("discountAmount", js.undefined)
    
    @scala.inline
    def setExternalVault(value: PreviousNetworkTransactionId): Self = this.set("externalVault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalVault: Self = this.set("externalVault", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: TransactionLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[TransactionLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setMerchantAccountId(value: String): Self = this.set("merchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantAccountId: Self = this.set("merchantAccountId", js.undefined)
    
    @scala.inline
    def setOptions(value: AddBillingAddressToPaymentMethod): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = this.set("paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodNonce: Self = this.set("paymentMethodNonce", js.undefined)
    
    @scala.inline
    def setPaymentMethodToken(value: String): Self = this.set("paymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodToken: Self = this.set("paymentMethodToken", js.undefined)
    
    @scala.inline
    def setPurchaseOrderNumber(value: String): Self = this.set("purchaseOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseOrderNumber: Self = this.set("purchaseOrderNumber", js.undefined)
    
    @scala.inline
    def setRecurring(value: Boolean): Self = this.set("recurring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurring: Self = this.set("recurring", js.undefined)
    
    @scala.inline
    def setRiskData(value: CustomerRiskData): Self = this.set("riskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskData: Self = this.set("riskData", js.undefined)
    
    @scala.inline
    def setServiceFeeAmount(value: String): Self = this.set("serviceFeeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceFeeAmount: Self = this.set("serviceFeeAmount", js.undefined)
    
    @scala.inline
    def setSharedBillingAddressId(value: String): Self = this.set("sharedBillingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedBillingAddressId: Self = this.set("sharedBillingAddressId", js.undefined)
    
    @scala.inline
    def setSharedCustomerId(value: String): Self = this.set("sharedCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedCustomerId: Self = this.set("sharedCustomerId", js.undefined)
    
    @scala.inline
    def setSharedPaymentMethodNonce(value: String): Self = this.set("sharedPaymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedPaymentMethodNonce: Self = this.set("sharedPaymentMethodNonce", js.undefined)
    
    @scala.inline
    def setSharedPaymentMethodToken(value: String): Self = this.set("sharedPaymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedPaymentMethodToken: Self = this.set("sharedPaymentMethodToken", js.undefined)
    
    @scala.inline
    def setSharedShippingAddressId(value: String): Self = this.set("sharedShippingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedShippingAddressId: Self = this.set("sharedShippingAddressId", js.undefined)
    
    @scala.inline
    def setShipping(value: Company): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    
    @scala.inline
    def setShippingAddressId(value: String): Self = this.set("shippingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingAddressId: Self = this.set("shippingAddressId", js.undefined)
    
    @scala.inline
    def setShippingAmount(value: String): Self = this.set("shippingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingAmount: Self = this.set("shippingAmount", js.undefined)
    
    @scala.inline
    def setShipsFromPostalCode(value: String): Self = this.set("shipsFromPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipsFromPostalCode: Self = this.set("shipsFromPostalCode", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: String): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
    
    @scala.inline
    def setTaxExempt(value: Boolean): Self = this.set("taxExempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxExempt: Self = this.set("taxExempt", js.undefined)
    
    @scala.inline
    def setThreeDSecurePassThru(value: Cavv): Self = this.set("threeDSecurePassThru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreeDSecurePassThru: Self = this.set("threeDSecurePassThru", js.undefined)
    
    @scala.inline
    def setTransactionSource(value: TransactionRequestSource): Self = this.set("transactionSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionSource: Self = this.set("transactionSource", js.undefined)
  }
}
