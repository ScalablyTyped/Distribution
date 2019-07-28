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

trait Anon_BinCallId extends js.Object {
  var bin: String
  var callId: String
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
  var token: String
}

object Anon_BinCallId {
  @scala.inline
  def apply(
    bin: String,
    callId: String,
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
    token: String
  ): Anon_BinCallId = {
    val __obj = js.Dynamic.literal(bin = bin, callId = callId, cardType = cardType, cardholderName = cardholderName, commercial = commercial, countryOfIssuance = countryOfIssuance, customerLocation = customerLocation, debit = debit, durbinRegulated = durbinRegulated, expirationDate = expirationDate, expirationMonth = expirationMonth, expirationYear = expirationYear, healthcare = healthcare, imageUrl = imageUrl, issuingBank = issuingBank, last4 = last4, maskedNumber = maskedNumber, payroll = payroll, prepaid = prepaid, productId = productId, token = token)
  
    __obj.asInstanceOf[Anon_BinCallId]
  }
}

