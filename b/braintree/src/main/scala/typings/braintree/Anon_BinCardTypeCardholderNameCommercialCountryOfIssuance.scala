package typings.braintree

import typings.braintree.braintreeMod.Commercial
import typings.braintree.braintreeMod.CustomerLocation
import typings.braintree.braintreeMod.Debit
import typings.braintree.braintreeMod.DurbinRegulated
import typings.braintree.braintreeMod.HealthCare
import typings.braintree.braintreeMod.Payroll
import typings.braintree.braintreeMod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance extends js.Object {
  var bin: String
  var cardType: String
  var cardholderName: String
  var commercial: Commercial
  var countryOfIssuance: String
  var customerLocation: CustomerLocation
  var debit: Debit
  var durbinRegulated: DurbinRegulated
  var expirationDate: String
  var expirationMonth: String
  var expirationYear: String
  var healthcare: HealthCare
  var imageUrl: String
  var issuingBank: String
  var last4: String
  var maskedNumber: String
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var sourceCardLast4: String
  var token: String
}

object Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: Commercial,
    countryOfIssuance: String,
    customerLocation: CustomerLocation,
    debit: Debit,
    durbinRegulated: DurbinRegulated,
    expirationDate: String,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    maskedNumber: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    token: String
  ): Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance = {
    val __obj = js.Dynamic.literal(bin = bin, cardType = cardType, cardholderName = cardholderName, commercial = commercial, countryOfIssuance = countryOfIssuance, customerLocation = customerLocation, debit = debit, durbinRegulated = durbinRegulated, expirationDate = expirationDate, expirationMonth = expirationMonth, expirationYear = expirationYear, healthcare = healthcare, imageUrl = imageUrl, issuingBank = issuingBank, last4 = last4, maskedNumber = maskedNumber, payroll = payroll, prepaid = prepaid, productId = productId, sourceCardLast4 = sourceCardLast4, token = token)
  
    __obj.asInstanceOf[Anon_BinCardTypeCardholderNameCommercialCountryOfIssuance]
  }
}

