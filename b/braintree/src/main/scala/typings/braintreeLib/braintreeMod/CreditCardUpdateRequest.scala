package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardUpdateRequest extends js.Object {
  var billingAddress: js.UndefOr[braintreeLib.Anon_CompanyCountryCodeAlpha2] = js.undefined
  var cardholderName: js.UndefOr[java.lang.String] = js.undefined
  var cvv: js.UndefOr[java.lang.String] = js.undefined
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var expirationMonth: js.UndefOr[java.lang.String] = js.undefined
  var expirationYear: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[java.lang.String] = js.undefined
}

object CreditCardUpdateRequest {
  @scala.inline
  def apply(
    billingAddress: braintreeLib.Anon_CompanyCountryCodeAlpha2 = null,
    cardholderName: java.lang.String = null,
    cvv: java.lang.String = null,
    expirationDate: java.lang.String = null,
    expirationMonth: java.lang.String = null,
    expirationYear: java.lang.String = null,
    number: java.lang.String = null
  ): CreditCardUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (cvv != null) __obj.updateDynamic("cvv")(cvv)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    if (number != null) __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[CreditCardUpdateRequest]
  }
}

