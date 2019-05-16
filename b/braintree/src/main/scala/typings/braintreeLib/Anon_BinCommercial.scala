package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BinCommercial extends js.Object {
  var bin: java.lang.String
  var commercial: braintreeLib.braintreeMod.Commercial
  var countryOfIssuance: java.lang.String
  var debit: braintreeLib.braintreeMod.Debit
  var durbinRegulated: braintreeLib.braintreeMod.DurbinRegulated
  var expirationMonth: java.lang.String
  var expirationYear: java.lang.String
  var googleTransactionId: java.lang.String
  var healthcare: braintreeLib.braintreeMod.HealthCare
  var imageUrl: java.lang.String
  var payroll: braintreeLib.braintreeMod.Payroll
  var prepaid: braintreeLib.braintreeMod.Prepaid
  var productId: java.lang.String
  var sourceCardLast4: java.lang.String
  var sourceCardType: java.lang.String
  var sourceDescription: java.lang.String
  var token: java.lang.String
  var virtualCardLast4: java.lang.String
  var virtualCardType: java.lang.String
}

object Anon_BinCommercial {
  @scala.inline
  def apply(
    bin: java.lang.String,
    commercial: braintreeLib.braintreeMod.Commercial,
    countryOfIssuance: java.lang.String,
    debit: braintreeLib.braintreeMod.Debit,
    durbinRegulated: braintreeLib.braintreeMod.DurbinRegulated,
    expirationMonth: java.lang.String,
    expirationYear: java.lang.String,
    googleTransactionId: java.lang.String,
    healthcare: braintreeLib.braintreeMod.HealthCare,
    imageUrl: java.lang.String,
    payroll: braintreeLib.braintreeMod.Payroll,
    prepaid: braintreeLib.braintreeMod.Prepaid,
    productId: java.lang.String,
    sourceCardLast4: java.lang.String,
    sourceCardType: java.lang.String,
    sourceDescription: java.lang.String,
    token: java.lang.String,
    virtualCardLast4: java.lang.String,
    virtualCardType: java.lang.String
  ): Anon_BinCommercial = {
    val __obj = js.Dynamic.literal(bin = bin, commercial = commercial, countryOfIssuance = countryOfIssuance, debit = debit, durbinRegulated = durbinRegulated, expirationMonth = expirationMonth, expirationYear = expirationYear, googleTransactionId = googleTransactionId, healthcare = healthcare, imageUrl = imageUrl, payroll = payroll, prepaid = prepaid, productId = productId, sourceCardLast4 = sourceCardLast4, sourceCardType = sourceCardType, sourceDescription = sourceDescription, token = token, virtualCardLast4 = virtualCardLast4, virtualCardType = virtualCardType)
  
    __obj.asInstanceOf[Anon_BinCommercial]
  }
}

