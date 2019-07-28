package typings.braintree.braintreeMod

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
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate, fundsHeld = fundsHeld, settlementAmount = settlementAmount, settlementCurrencyExchangeRate = settlementCurrencyExchangeRate, settlementCurrencyIsoCode = settlementCurrencyIsoCode, success = success)
  
    __obj.asInstanceOf[DisbursementDetails]
  }
}

