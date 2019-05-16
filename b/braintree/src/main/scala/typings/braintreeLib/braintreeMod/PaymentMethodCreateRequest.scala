package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodCreateRequest extends js.Object {
  var billingAddress: js.UndefOr[braintreeLib.Anon_Company] = js.undefined
  var billingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var cardholderName: js.UndefOr[java.lang.String] = js.undefined
  var customerId: java.lang.String
  var cvv: js.UndefOr[java.lang.String] = js.undefined
  var deviceData: js.UndefOr[java.lang.String] = js.undefined
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var expirationMonth: js.UndefOr[java.lang.String] = js.undefined
  var expirationYear: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[braintreeLib.Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount] = js.undefined
  var paymentMethodNonce: java.lang.String
}

object PaymentMethodCreateRequest {
  @scala.inline
  def apply(
    customerId: java.lang.String,
    paymentMethodNonce: java.lang.String,
    billingAddress: braintreeLib.Anon_Company = null,
    billingAddressId: java.lang.String = null,
    cardholderName: java.lang.String = null,
    cvv: java.lang.String = null,
    deviceData: java.lang.String = null,
    expirationDate: java.lang.String = null,
    expirationMonth: java.lang.String = null,
    expirationYear: java.lang.String = null,
    number: java.lang.String = null,
    options: braintreeLib.Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount = null
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

