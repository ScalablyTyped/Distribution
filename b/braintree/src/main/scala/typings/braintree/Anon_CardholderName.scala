package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardholderName extends js.Object {
  var cardholderName: js.UndefOr[String] = js.undefined
  var cvv: js.UndefOr[String] = js.undefined
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object Anon_CardholderName {
  @scala.inline
  def apply(
    cardholderName: String = null,
    cvv: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null,
    number: String = null,
    token: String = null
  ): Anon_CardholderName = {
    val __obj = js.Dynamic.literal()
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (cvv != null) __obj.updateDynamic("cvv")(cvv)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    if (number != null) __obj.updateDynamic("number")(number)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_CardholderName]
  }
}

