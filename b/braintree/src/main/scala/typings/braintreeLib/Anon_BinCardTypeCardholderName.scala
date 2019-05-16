package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinCardTypeCardholderName extends js.Object {
  var bin: java.lang.String
  var cardType: java.lang.String
  var cardholderName: js.UndefOr[java.lang.String] = js.undefined
  var commercial: braintreeLib.braintreeMod.Commercial
  var countryOfIssuance: java.lang.String
  var customerLocation: braintreeLib.braintreeMod.CustomerLocation
  var debit: java.lang.String
  var durbinRegulated: braintreeLib.braintreeMod.DurbinRegulated
  var expirationDate: js.UndefOr[java.lang.String] = js.undefined
  var expirationMonth: js.UndefOr[java.lang.String] = js.undefined
  var expirationYear: js.UndefOr[java.lang.String] = js.undefined
  var healthcare: braintreeLib.braintreeMod.HealthCare
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var issuingBank: java.lang.String
  var last4: java.lang.String
  var maskedNumber: js.UndefOr[java.lang.String] = js.undefined
  var payroll: braintreeLib.braintreeMod.Payroll
  var prepaid: braintreeLib.braintreeMod.Prepaid
  var productId: java.lang.String
  var token: java.lang.String
  var uniqueNumberIdentifier: java.lang.String
}

object Anon_BinCardTypeCardholderName {
  @scala.inline
  def apply(
    bin: java.lang.String,
    cardType: java.lang.String,
    commercial: braintreeLib.braintreeMod.Commercial,
    countryOfIssuance: java.lang.String,
    customerLocation: braintreeLib.braintreeMod.CustomerLocation,
    debit: java.lang.String,
    durbinRegulated: braintreeLib.braintreeMod.DurbinRegulated,
    healthcare: braintreeLib.braintreeMod.HealthCare,
    issuingBank: java.lang.String,
    last4: java.lang.String,
    payroll: braintreeLib.braintreeMod.Payroll,
    prepaid: braintreeLib.braintreeMod.Prepaid,
    productId: java.lang.String,
    token: java.lang.String,
    uniqueNumberIdentifier: java.lang.String,
    cardholderName: java.lang.String = null,
    expirationDate: java.lang.String = null,
    expirationMonth: java.lang.String = null,
    expirationYear: java.lang.String = null,
    imageUrl: java.lang.String = null,
    maskedNumber: java.lang.String = null
  ): Anon_BinCardTypeCardholderName = {
    val __obj = js.Dynamic.literal(bin = bin, cardType = cardType, commercial = commercial, countryOfIssuance = countryOfIssuance, customerLocation = customerLocation, debit = debit, durbinRegulated = durbinRegulated, healthcare = healthcare, issuingBank = issuingBank, last4 = last4, payroll = payroll, prepaid = prepaid, productId = productId, token = token, uniqueNumberIdentifier = uniqueNumberIdentifier)
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate)
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth)
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (maskedNumber != null) __obj.updateDynamic("maskedNumber")(maskedNumber)
    __obj.asInstanceOf[Anon_BinCardTypeCardholderName]
  }
}

