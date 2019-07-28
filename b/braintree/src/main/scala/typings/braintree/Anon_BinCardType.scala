package typings.braintree

import typings.braintree.braintreeMod.Commercial
import typings.braintree.braintreeMod.Debit
import typings.braintree.braintreeMod.DurbinRegulated
import typings.braintree.braintreeMod.HealthCare
import typings.braintree.braintreeMod.Payroll
import typings.braintree.braintreeMod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinCardType extends js.Object {
  var bin: String
  var cardType: String
  var cardholderName: String
  var commercial: Commercial
  var countryOfIssuance: String
  var debit: Debit
  var durbinRegulated: DurbinRegulated
  var expirationMonth: String
  var expirationYear: String
  var healthcare: HealthCare
  var imageUrl: String
  var issuingBank: String
  var last4: String
  var paymentInsuranceName: String
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var sourceDescription: String
  var token: String
}

object Anon_BinCardType {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: Commercial,
    countryOfIssuance: String,
    debit: Debit,
    durbinRegulated: DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    paymentInsuranceName: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceDescription: String,
    token: String
  ): Anon_BinCardType = {
    val __obj = js.Dynamic.literal(bin = bin, cardType = cardType, cardholderName = cardholderName, commercial = commercial, countryOfIssuance = countryOfIssuance, debit = debit, durbinRegulated = durbinRegulated, expirationMonth = expirationMonth, expirationYear = expirationYear, healthcare = healthcare, imageUrl = imageUrl, issuingBank = issuingBank, last4 = last4, paymentInsuranceName = paymentInsuranceName, payroll = payroll, prepaid = prepaid, productId = productId, sourceDescription = sourceDescription, token = token)
  
    __obj.asInstanceOf[Anon_BinCardType]
  }
}

