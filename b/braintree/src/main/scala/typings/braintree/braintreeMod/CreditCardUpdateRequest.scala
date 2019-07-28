package typings.braintree.braintreeMod

import typings.braintree.Anon_CompanyCountryCodeAlpha2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardUpdateRequest extends js.Object {
  var billingAddress: js.UndefOr[Anon_CompanyCountryCodeAlpha2] = js.undefined
  var cardholderName: js.UndefOr[String] = js.undefined
  var cvv: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
}

object CreditCardUpdateRequest {
  @scala.inline
  def apply(
    billingAddress: Anon_CompanyCountryCodeAlpha2 = null,
    cardholderName: String = null,
    cvv: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null,
    number: String = null
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

