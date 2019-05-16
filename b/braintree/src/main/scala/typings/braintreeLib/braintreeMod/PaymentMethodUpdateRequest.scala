package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodUpdateRequest extends js.Object {
  var billingAddress: js.UndefOr[braintreeLib.Anon_CompanyCountryCodeAlpha2] = js.undefined
  var billingAddressId: js.UndefOr[java.lang.String] = js.undefined
  var cardholderName: js.UndefOr[java.lang.String] = js.undefined
  var cvv: js.UndefOr[java.lang.String] = js.undefined
  var deviceData: js.UndefOr[java.lang.String] = js.undefined
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var expirationMonth: js.UndefOr[java.lang.String] = js.undefined
  var expirationYear: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[braintreeLib.Anon_MakeDefault] = js.undefined
  var paymentMethodNonce: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentMethodUpdateRequest {
  @scala.inline
  def apply(
    billingAddress: braintreeLib.Anon_CompanyCountryCodeAlpha2 = null,
    billingAddressId: java.lang.String = null,
    cardholderName: java.lang.String = null,
    cvv: java.lang.String = null,
    deviceData: java.lang.String = null,
    expirationDate: java.lang.String = null,
    expirationMonth: java.lang.String = null,
    expirationYear: java.lang.String = null,
    number: java.lang.String = null,
    options: braintreeLib.Anon_MakeDefault = null,
    paymentMethodNonce: java.lang.String = null
  ): PaymentMethodUpdateRequest = {
    val __obj = js.Dynamic.literal()
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
    if (paymentMethodNonce != null) __obj.updateDynamic("paymentMethodNonce")(paymentMethodNonce)
    __obj.asInstanceOf[PaymentMethodUpdateRequest]
  }
}

