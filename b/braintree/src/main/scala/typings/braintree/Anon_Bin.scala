package typings.braintree

import typings.braintree.braintreeMod.Commercial
import typings.braintree.braintreeMod.CustomerLocation
import typings.braintree.braintreeMod.DurbinRegulated
import typings.braintree.braintreeMod.HealthCare
import typings.braintree.braintreeMod.Payroll
import typings.braintree.braintreeMod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bin extends js.Object {
  var bin: String
  var cardType: String
  var cardholderName: js.UndefOr[String] = js.undefined
  var commercial: Commercial
  var countryOfIssuance: String
  var customerLocation: CustomerLocation
  var debit: String
  var durbinRegulated: DurbinRegulated
  var expirationDate: js.UndefOr[String] = js.undefined
  var expirationMonth: js.UndefOr[String] = js.undefined
  var expirationYear: js.UndefOr[String] = js.undefined
  var healthcare: HealthCare
  var issuingBank: String
  var last4: String
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var token: String
  var uniqueNumberIdentifier: String
}

object Anon_Bin {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    commercial: Commercial,
    countryOfIssuance: String,
    customerLocation: CustomerLocation,
    debit: String,
    durbinRegulated: DurbinRegulated,
    healthcare: HealthCare,
    issuingBank: String,
    last4: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    token: String,
    uniqueNumberIdentifier: String,
    cardholderName: String = null,
    expirationDate: String = null,
    expirationMonth: String = null,
    expirationYear: String = null
  ): Anon_Bin = {
    val __obj = js.Dynamic.literal(bin = bin, cardType = cardType, commercial = commercial, countryOfIssuance = countryOfIssuance, customerLocation = customerLocation, debit = debit, durbinRegulated = durbinRegulated, healthcare = healthcare, issuingBank = issuingBank, last4 = last4, payroll = payroll, prepaid = prepaid, productId = productId, token = token, uniqueNumberIdentifier = uniqueNumberIdentifier)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    __obj.asInstanceOf[Anon_Bin]
  }
}

