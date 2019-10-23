package typings.braintree.braintreeMod

import typings.braintree.Anon_AddBillingAddressToPaymentMethod
import typings.braintree.Anon_CardholderName
import typings.braintree.Anon_Cavv
import typings.braintree.Anon_Company
import typings.braintree.Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric
import typings.braintree.Anon_CompanyCustomFieldsEmail
import typings.braintree.Anon_PreviousNetworkTransactionId
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRequest extends js.Object {
  var amount: String
  var billing: js.UndefOr[Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric] = js.undefined
  var billingAddressId: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var creditCard: js.UndefOr[Anon_CardholderName] = js.undefined
  var customFields: js.UndefOr[Record[String, _]] = js.undefined
  var customer: js.UndefOr[Anon_CompanyCustomFieldsEmail] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  var deviceData: js.UndefOr[String] = js.undefined
  var deviceSessionId: js.UndefOr[String] = js.undefined
  var discountAmount: js.UndefOr[String] = js.undefined
  var externalVault: js.UndefOr[Anon_PreviousNetworkTransactionId] = js.undefined
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.undefined
  var merchantAccountId: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[Anon_AddBillingAddressToPaymentMethod] = js.undefined
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
  var shipping: js.UndefOr[Anon_Company] = js.undefined
  var shippingAddressId: js.UndefOr[String] = js.undefined
  var shippingAmount: js.UndefOr[String] = js.undefined
  var shipsFromPostalCode: js.UndefOr[String] = js.undefined
  var taxAmount: js.UndefOr[String] = js.undefined
  var taxExempt: js.UndefOr[Boolean] = js.undefined
  var threeDSecurePassThru: js.UndefOr[Anon_Cavv] = js.undefined
  var transactionSource: js.UndefOr[TransactionRequestSource] = js.undefined
}

object TransactionRequest {
  @scala.inline
  def apply(
    amount: String,
    billing: Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric = null,
    billingAddressId: String = null,
    channel: String = null,
    creditCard: Anon_CardholderName = null,
    customFields: Record[String, _] = null,
    customer: Anon_CompanyCustomFieldsEmail = null,
    customerId: String = null,
    descriptor: Descriptor = null,
    deviceData: String = null,
    deviceSessionId: String = null,
    discountAmount: String = null,
    externalVault: Anon_PreviousNetworkTransactionId = null,
    lineItems: js.Array[TransactionLineItem] = null,
    merchantAccountId: String = null,
    options: Anon_AddBillingAddressToPaymentMethod = null,
    orderId: String = null,
    paymentMethodNonce: String = null,
    paymentMethodToken: String = null,
    purchaseOrderNumber: String = null,
    recurring: js.UndefOr[Boolean] = js.undefined,
    riskData: CustomerRiskData = null,
    serviceFeeAmount: String = null,
    sharedBillingAddressId: String = null,
    sharedCustomerId: String = null,
    sharedPaymentMethodNonce: String = null,
    sharedPaymentMethodToken: String = null,
    sharedShippingAddressId: String = null,
    shipping: Anon_Company = null,
    shippingAddressId: String = null,
    shippingAmount: String = null,
    shipsFromPostalCode: String = null,
    taxAmount: String = null,
    taxExempt: js.UndefOr[Boolean] = js.undefined,
    threeDSecurePassThru: Anon_Cavv = null,
    transactionSource: TransactionRequestSource = null
  ): TransactionRequest = {
    val __obj = js.Dynamic.literal(amount = amount)
    if (billing != null) __obj.updateDynamic("billing")(billing)
    if (billingAddressId != null) __obj.updateDynamic("billingAddressId")(billingAddressId)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (creditCard != null) __obj.updateDynamic("creditCard")(creditCard)
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor)
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData)
    if (deviceSessionId != null) __obj.updateDynamic("deviceSessionId")(deviceSessionId)
    if (discountAmount != null) __obj.updateDynamic("discountAmount")(discountAmount)
    if (externalVault != null) __obj.updateDynamic("externalVault")(externalVault)
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems)
    if (merchantAccountId != null) __obj.updateDynamic("merchantAccountId")(merchantAccountId)
    if (options != null) __obj.updateDynamic("options")(options)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce)
    if (paymentMethodToken != null) __obj.updateDynamic("paymentMethodToken")(paymentMethodToken)
    if (purchaseOrderNumber != null) __obj.updateDynamic("purchaseOrderNumber")(purchaseOrderNumber)
    if (!js.isUndefined(recurring)) __obj.updateDynamic("recurring")(recurring)
    if (riskData != null) __obj.updateDynamic("riskData")(riskData)
    if (serviceFeeAmount != null) __obj.updateDynamic("serviceFeeAmount")(serviceFeeAmount)
    if (sharedBillingAddressId != null) __obj.updateDynamic("sharedBillingAddressId")(sharedBillingAddressId)
    if (sharedCustomerId != null) __obj.updateDynamic("sharedCustomerId")(sharedCustomerId)
    if (sharedPaymentMethodNonce != null) __obj.updateDynamic("sharedPaymentMethodNonce")(sharedPaymentMethodNonce)
    if (sharedPaymentMethodToken != null) __obj.updateDynamic("sharedPaymentMethodToken")(sharedPaymentMethodToken)
    if (sharedShippingAddressId != null) __obj.updateDynamic("sharedShippingAddressId")(sharedShippingAddressId)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (shippingAddressId != null) __obj.updateDynamic("shippingAddressId")(shippingAddressId)
    if (shippingAmount != null) __obj.updateDynamic("shippingAmount")(shippingAmount)
    if (shipsFromPostalCode != null) __obj.updateDynamic("shipsFromPostalCode")(shipsFromPostalCode)
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount)
    if (!js.isUndefined(taxExempt)) __obj.updateDynamic("taxExempt")(taxExempt)
    if (threeDSecurePassThru != null) __obj.updateDynamic("threeDSecurePassThru")(threeDSecurePassThru)
    if (transactionSource != null) __obj.updateDynamic("transactionSource")(transactionSource)
    __obj.asInstanceOf[TransactionRequest]
  }
}

