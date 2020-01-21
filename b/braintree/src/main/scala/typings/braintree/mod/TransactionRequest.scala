package typings.braintree.mod

import typings.braintree.AnonAddBillingAddressToPaymentMethod
import typings.braintree.AnonCardholderName
import typings.braintree.AnonCavv
import typings.braintree.AnonCompany
import typings.braintree.AnonCompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric
import typings.braintree.AnonCompanyCustomFieldsEmail
import typings.braintree.AnonPreviousNetworkTransactionId
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRequest extends js.Object {
  var amount: String
  var billing: js.UndefOr[AnonCompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric] = js.undefined
  var billingAddressId: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var creditCard: js.UndefOr[AnonCardholderName] = js.undefined
  var customFields: js.UndefOr[Record[String, _]] = js.undefined
  var customer: js.UndefOr[AnonCompanyCustomFieldsEmail] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  var deviceData: js.UndefOr[String] = js.undefined
  var deviceSessionId: js.UndefOr[String] = js.undefined
  var discountAmount: js.UndefOr[String] = js.undefined
  var externalVault: js.UndefOr[AnonPreviousNetworkTransactionId] = js.undefined
  var lineItems: js.UndefOr[js.Array[TransactionLineItem]] = js.undefined
  var merchantAccountId: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[AnonAddBillingAddressToPaymentMethod] = js.undefined
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
  var shipping: js.UndefOr[AnonCompany] = js.undefined
  var shippingAddressId: js.UndefOr[String] = js.undefined
  var shippingAmount: js.UndefOr[String] = js.undefined
  var shipsFromPostalCode: js.UndefOr[String] = js.undefined
  var taxAmount: js.UndefOr[String] = js.undefined
  var taxExempt: js.UndefOr[Boolean] = js.undefined
  var threeDSecurePassThru: js.UndefOr[AnonCavv] = js.undefined
  var transactionSource: js.UndefOr[TransactionRequestSource] = js.undefined
}

object TransactionRequest {
  @scala.inline
  def apply(
    amount: String,
    billing: AnonCompanyCountryCodeAlpha2CountryCodeAlpha3CountryCodeNumeric = null,
    billingAddressId: String = null,
    channel: String = null,
    creditCard: AnonCardholderName = null,
    customFields: Record[String, _] = null,
    customer: AnonCompanyCustomFieldsEmail = null,
    customerId: String = null,
    descriptor: Descriptor = null,
    deviceData: String = null,
    deviceSessionId: String = null,
    discountAmount: String = null,
    externalVault: AnonPreviousNetworkTransactionId = null,
    lineItems: js.Array[TransactionLineItem] = null,
    merchantAccountId: String = null,
    options: AnonAddBillingAddressToPaymentMethod = null,
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
    shipping: AnonCompany = null,
    shippingAddressId: String = null,
    shippingAmount: String = null,
    shipsFromPostalCode: String = null,
    taxAmount: String = null,
    taxExempt: js.UndefOr[Boolean] = js.undefined,
    threeDSecurePassThru: AnonCavv = null,
    transactionSource: TransactionRequestSource = null
  ): TransactionRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (billingAddressId != null) __obj.updateDynamic("billingAddressId")(billingAddressId.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (creditCard != null) __obj.updateDynamic("creditCard")(creditCard.asInstanceOf[js.Any])
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData.asInstanceOf[js.Any])
    if (deviceSessionId != null) __obj.updateDynamic("deviceSessionId")(deviceSessionId.asInstanceOf[js.Any])
    if (discountAmount != null) __obj.updateDynamic("discountAmount")(discountAmount.asInstanceOf[js.Any])
    if (externalVault != null) __obj.updateDynamic("externalVault")(externalVault.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (merchantAccountId != null) __obj.updateDynamic("merchantAccountId")(merchantAccountId.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce.asInstanceOf[js.Any])
    if (paymentMethodToken != null) __obj.updateDynamic("paymentMethodToken")(paymentMethodToken.asInstanceOf[js.Any])
    if (purchaseOrderNumber != null) __obj.updateDynamic("purchaseOrderNumber")(purchaseOrderNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(recurring)) __obj.updateDynamic("recurring")(recurring.asInstanceOf[js.Any])
    if (riskData != null) __obj.updateDynamic("riskData")(riskData.asInstanceOf[js.Any])
    if (serviceFeeAmount != null) __obj.updateDynamic("serviceFeeAmount")(serviceFeeAmount.asInstanceOf[js.Any])
    if (sharedBillingAddressId != null) __obj.updateDynamic("sharedBillingAddressId")(sharedBillingAddressId.asInstanceOf[js.Any])
    if (sharedCustomerId != null) __obj.updateDynamic("sharedCustomerId")(sharedCustomerId.asInstanceOf[js.Any])
    if (sharedPaymentMethodNonce != null) __obj.updateDynamic("sharedPaymentMethodNonce")(sharedPaymentMethodNonce.asInstanceOf[js.Any])
    if (sharedPaymentMethodToken != null) __obj.updateDynamic("sharedPaymentMethodToken")(sharedPaymentMethodToken.asInstanceOf[js.Any])
    if (sharedShippingAddressId != null) __obj.updateDynamic("sharedShippingAddressId")(sharedShippingAddressId.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (shippingAddressId != null) __obj.updateDynamic("shippingAddressId")(shippingAddressId.asInstanceOf[js.Any])
    if (shippingAmount != null) __obj.updateDynamic("shippingAmount")(shippingAmount.asInstanceOf[js.Any])
    if (shipsFromPostalCode != null) __obj.updateDynamic("shipsFromPostalCode")(shipsFromPostalCode.asInstanceOf[js.Any])
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    if (!js.isUndefined(taxExempt)) __obj.updateDynamic("taxExempt")(taxExempt.asInstanceOf[js.Any])
    if (threeDSecurePassThru != null) __obj.updateDynamic("threeDSecurePassThru")(threeDSecurePassThru.asInstanceOf[js.Any])
    if (transactionSource != null) __obj.updateDynamic("transactionSource")(transactionSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRequest]
  }
}

