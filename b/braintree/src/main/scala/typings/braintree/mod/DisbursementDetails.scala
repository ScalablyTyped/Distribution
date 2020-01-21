package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisbursementDetails extends js.Object {
  var disbursementDate: Date
  var fundsHeld: Boolean
  var settlementAmount: String
  var settlementCurrencyExchangeRate: String
  var settlementCurrencyIsoCode: String
  var success: Boolean
}

object DisbursementDetails {
  @scala.inline
  def apply(
    disbursementDate: Date,
    fundsHeld: Boolean,
    settlementAmount: String,
    settlementCurrencyExchangeRate: String,
    settlementCurrencyIsoCode: String,
    success: Boolean
  ): DisbursementDetails = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], fundsHeld = fundsHeld.asInstanceOf[js.Any], settlementAmount = settlementAmount.asInstanceOf[js.Any], settlementCurrencyExchangeRate = settlementCurrencyExchangeRate.asInstanceOf[js.Any], settlementCurrencyIsoCode = settlementCurrencyIsoCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisbursementDetails]
  }
}

