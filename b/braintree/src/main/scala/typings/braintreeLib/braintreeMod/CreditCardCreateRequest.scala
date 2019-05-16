package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardCreateRequest extends js.Object {
  var billingAddress: js.UndefOr[braintreeLib.Anon_Company] = js.undefined
  var billingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var cardholderName: js.UndefOr[java.lang.String] = js.undefined
  var customerId: java.lang.String
  var cvv: js.UndefOr[java.lang.String] = js.undefined
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var expirationMonth: js.UndefOr[java.lang.String] = js.undefined
  var expirationYear: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[braintreeLib.Anon_FailOnDuplicatePaymentMethodMakeDefault] = js.undefined
  var paymentMethodNonce: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object CreditCardCreateRequest {
  @scala.inline
  def apply(
    customerId: java.lang.String,
    billingAddress: braintreeLib.Anon_Company = null,
    billingAddressId: java.lang.String = null,
    cardholderName: java.lang.String = null,
    cvv: java.lang.String = null,
    expirationDate: java.lang.String = null,
    expirationMonth: java.lang.String = null,
    expirationYear: java.lang.String = null,
    number: java.lang.String = null,
    options: braintreeLib.Anon_FailOnDuplicatePaymentMethodMakeDefault = null,
    paymentMethodNonce: java.lang.String = null,
    token: java.lang.String = null
  ): CreditCardCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId)
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress)
    if (billingAddressId != null) __obj.updateDynamic("billingAddressId")(billingAddressId)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (cvv != null) __obj.updateDynamic("cvv")(cvv)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    if (number != null) __obj.updateDynamic("number")(number)
    if (options != null) __obj.updateDynamic("options")(options)
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[CreditCardCreateRequest]
  }
}

