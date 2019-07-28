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

trait Anon_BinCommercial extends js.Object {
  var bin: String
  var commercial: Commercial
  var countryOfIssuance: String
  var debit: Debit
  var durbinRegulated: DurbinRegulated
  var expirationMonth: String
  var expirationYear: String
  var googleTransactionId: String
  var healthcare: HealthCare
  var imageUrl: String
  var payroll: Payroll
  var prepaid: Prepaid
  var productId: String
  var sourceCardLast4: String
  var sourceCardType: String
  var sourceDescription: String
  var token: String
  var virtualCardLast4: String
  var virtualCardType: String
}

object Anon_BinCommercial {
  @scala.inline
  def apply(
    bin: String,
    commercial: Commercial,
    countryOfIssuance: String,
    debit: Debit,
    durbinRegulated: DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    googleTransactionId: String,
    healthcare: HealthCare,
    imageUrl: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    sourceCardType: String,
    sourceDescription: String,
    token: String,
    virtualCardLast4: String,
    virtualCardType: String
  ): Anon_BinCommercial = {
    val __obj = js.Dynamic.literal(bin = bin, commercial = commercial, countryOfIssuance = countryOfIssuance, debit = debit, durbinRegulated = durbinRegulated, expirationMonth = expirationMonth, expirationYear = expirationYear, googleTransactionId = googleTransactionId, healthcare = healthcare, imageUrl = imageUrl, payroll = payroll, prepaid = prepaid, productId = productId, sourceCardLast4 = sourceCardLast4, sourceCardType = sourceCardType, sourceDescription = sourceDescription, token = token, virtualCardLast4 = virtualCardLast4, virtualCardType = virtualCardType)
  
    __obj.asInstanceOf[Anon_BinCommercial]
  }
}

