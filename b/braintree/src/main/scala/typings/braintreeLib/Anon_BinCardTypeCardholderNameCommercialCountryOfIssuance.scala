package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance extends js.Object {
  var bin: java.lang.String
  var cardType: java.lang.String
  var cardholderName: java.lang.String
  var commercial: braintreeLib.braintreeMod.Commercial
  var countryOfIssuance: java.lang.String
  var customerLocation: braintreeLib.braintreeMod.CustomerLocation
  var debit: braintreeLib.braintreeMod.Debit
  var durbinRegulated: braintreeLib.braintreeMod.DurbinRegulated
  var expirationDate: java.lang.String
  var expirationMonth: java.lang.String
  var expirationYear: java.lang.String
  var healthcare: braintreeLib.braintreeMod.HealthCare
  var imageUrl: java.lang.String
  var issuingBank: java.lang.String
  var last4: java.lang.String
  var maskedNumber: java.lang.String
  var payroll: braintreeLib.braintreeMod.Payroll
  var prepaid: braintreeLib.braintreeMod.Prepaid
  var productId: java.lang.String
  var sourceCardLast4: java.lang.String
  var token: java.lang.String
}

object Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance {
  @scala.inline
  def apply(
    bin: java.lang.String,
    cardType: java.lang.String,
    cardholderName: java.lang.String,
    commercial: braintreeLib.braintreeMod.Commercial,
    countryOfIssuance: java.lang.String,
    customerLocation: braintreeLib.braintreeMod.CustomerLocation,
    debit: braintreeLib.braintreeMod.Debit,
    durbinRegulated: braintreeLib.braintreeMod.DurbinRegulated,
    expirationDate: java.lang.String,
    expirationMonth: java.lang.String,
    expirationYear: java.lang.String,
    healthcare: braintreeLib.braintreeMod.HealthCare,
    imageUrl: java.lang.String,
    issuingBank: java.lang.String,
    last4: java.lang.String,
    maskedNumber: java.lang.String,
    payroll: braintreeLib.braintreeMod.Payroll,
    prepaid: braintreeLib.braintreeMod.Prepaid,
    productId: java.lang.String,
    sourceCardLast4: java.lang.String,
    token: java.lang.String
  ): Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance = {
    val __obj = js.Dynamic.literal(bin = bin, cardType = cardType, cardholderName = cardholderName, commercial = commercial, countryOfIssuance = countryOfIssuance, customerLocation = customerLocation, debit = debit, durbinRegulated = durbinRegulated, expirationDate = expirationDate, expirationMonth = expirationMonth, expirationYear = expirationYear, healthcare = healthcare, imageUrl = imageUrl, issuingBank = issuingBank, last4 = last4, maskedNumber = maskedNumber, payroll = payroll, prepaid = prepaid, productId = productId, sourceCardLast4 = sourceCardLast4, token = token)
  
    __obj.asInstanceOf[Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance]
  }
}

