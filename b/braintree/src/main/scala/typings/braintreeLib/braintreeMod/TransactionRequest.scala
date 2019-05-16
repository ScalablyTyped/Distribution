package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRequest extends js.Object {
  var amount: java.lang.String
  var billing: js.UndefOr[braintreeLib.Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric] = js.undefined
  var billingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var creditCard: js.UndefOr[braintreeLib.Anon_CardholderName] = js.undefined
  var customFields: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var customer: js.UndefOr[braintreeLib.Anon_CompanyCustomFields] = js.undefined
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  var deviceData: js.UndefOr[java.lang.String] = js.undefined
  var deviceSessionId: js.UndefOr[java.lang.String] = js.undefined
  var discountAmount: js.UndefOr[java.lang.String] = js.undefined
  var externalVault: js.UndefOr[braintreeLib.Anon_PreviousNetworkTransactionId] = js.undefined
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.undefined
  var merchantAccountId: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[braintreeLib.Anon_AddBillingAddressToPaymentMethod] = js.undefined
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  var paymentMethodNonce: js.UndefOr[java.lang.String] = js.undefined
  var paymentMethodToken: js.UndefOr[java.lang.String] = js.undefined
  var purchaseOrderNumber: js.UndefOr[java.lang.String] = js.undefined
  var recurring: js.UndefOr[scala.Boolean] = js.undefined
   // Deprecated
  var riskData: js.UndefOr[CustomerRiskData] = js.undefined
  var serviceFeeAmount: js.UndefOr[java.lang.String] = js.undefined
  var sharedBillingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var sharedCustomerId: js.UndefOr[java.lang.String] = js.undefined
  var sharedPaymentMethodNonce: js.UndefOr[java.lang.String] = js.undefined
  var sharedPaymentMethodToken: js.UndefOr[java.lang.String] = js.undefined
  var sharedShippingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var shipping: js.UndefOr[braintreeLib.Anon_Company] = js.undefined
  var shippingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var shippingAmount: js.UndefOr[java.lang.String] = js.undefined
  var shipsFromPostalCode: js.UndefOr[java.lang.String] = js.undefined
  var taxAmount: js.UndefOr[java.lang.String] = js.undefined
  var taxExempt: js.UndefOr[scala.Boolean] = js.undefined
  var threeDSecurePassThru: js.UndefOr[braintreeLib.Anon_Cavv] = js.undefined
  var transactionSource: js.UndefOr[java.lang.String] = js.undefined
}

object TransactionRequest {
  @scala.inline
  def apply(
    amount: java.lang.String,
    billing: braintreeLib.Anon_CompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric = null,
    billingAddressId: java.lang.String = null,
    channel: java.lang.String = null,
    creditCard: braintreeLib.Anon_CardholderName = null,
    customFields: stdLib.Record[java.lang.String, _] = null,
    customer: braintreeLib.Anon_CompanyCustomFields = null,
    customerId: java.lang.String = null,
    descriptor: Descriptor = null,
    deviceData: java.lang.String = null,
    deviceSessionId: java.lang.String = null,
    discountAmount: java.lang.String = null,
    externalVault: braintreeLib.Anon_PreviousNetworkTransactionId = null,
    lineItems: js.Array[TransactionLineItem] = null,
    merchantAccountId: java.lang.String = null,
    options: braintreeLib.Anon_AddBillingAddressToPaymentMethod = null,
    orderId: java.lang.String = null,
    paymentMethodNonce: java.lang.String = null,
    paymentMethodToken: java.lang.String = null,
    purchaseOrderNumber: java.lang.String = null,
    recurring: js.UndefOr[scala.Boolean] = js.undefined,
    riskData: CustomerRiskData = null,
    serviceFeeAmount: java.lang.String = null,
    sharedBillingAddressId: java.lang.String = null,
    sharedCustomerId: java.lang.String = null,
    sharedPaymentMethodNonce: java.lang.String = null,
    sharedPaymentMethodToken: java.lang.String = null,
    sharedShippingAddressId: java.lang.String = null,
    shipping: braintreeLib.Anon_Company = null,
    shippingAddressId: java.lang.String = null,
    shippingAmount: java.lang.String = null,
    shipsFromPostalCode: java.lang.String = null,
    taxAmount: java.lang.String = null,
    taxExempt: js.UndefOr[scala.Boolean] = js.undefined,
    threeDSecurePassThru: braintreeLib.Anon_Cavv = null,
    transactionSource: java.lang.String = null
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

