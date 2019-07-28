package typings.braintree.braintreeMod

import typings.braintree.Anon_Company
import typings.braintree.Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodCreateRequest extends js.Object {
  var billingAddress: js.UndefOr[Anon_Company] = js.undefined
  var billingAddressId: js.UndefOr[String] = js.undefined
  var cardholderName: js.UndefOr[String] = js.undefined
  var customerId: String
  var cvv: js.UndefOr[String] = js.undefined
  var deviceData: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount] = js.undefined
  var paymentMethodNonce: String
}

object PaymentMethodCreateRequest {
  @scala.inline
  def apply(
    customerId: String,
    paymentMethodNonce: String,
    billingAddress: Anon_Company = null,
    billingAddressId: String = null,
    cardholderName: String = null,
    cvv: String = null,
    deviceData: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null,
    number: String = null,
    options: Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount = null
  ): PaymentMethodCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId, paymentMethodNonce = paymentMethodNonce)
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress)
    if (billingAddressId != null) __obj.updateDynamic("billingAddressId")(billingAddressId)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (cvv != null) __obj.updateDynamic("cvv")(cvv)
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    if (number != null) __obj.updateDynamic("number")(number)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[PaymentMethodCreateRequest]
  }
}

