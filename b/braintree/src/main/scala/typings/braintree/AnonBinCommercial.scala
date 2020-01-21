package typings.braintree

import typings.braintree.mod.Commercial
import typings.braintree.mod.Debit
import typings.braintree.mod.DurbinRegulated
import typings.braintree.mod.HealthCare
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBinCommercial extends js.Object {
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

object AnonBinCommercial {
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
  ): AnonBinCommercial = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], googleTransactionId = googleTransactionId.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], sourceCardType = sourceCardType.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], virtualCardLast4 = virtualCardLast4.asInstanceOf[js.Any], virtualCardType = virtualCardType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBinCommercial]
  }
}

