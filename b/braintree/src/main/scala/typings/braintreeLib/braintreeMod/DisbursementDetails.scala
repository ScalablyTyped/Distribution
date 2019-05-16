package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisbursementDetails extends js.Object {
  var disbursementDate: stdLib.Date
  var fundsHeld: scala.Boolean
  var settlementAmount: java.lang.String
  var settlementCurrencyExchangeRate: java.lang.String
  var settlementCurrencyIsoCode: java.lang.String
  var success: scala.Boolean
}

object DisbursementDetails {
  @scala.inline
  def apply(
    disbursementDate: stdLib.Date,
    fundsHeld: scala.Boolean,
    settlementAmount: java.lang.String,
    settlementCurrencyExchangeRate: java.lang.String,
    settlementCurrencyIsoCode: java.lang.String,
    success: scala.Boolean
  ): DisbursementDetails = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate, fundsHeld = fundsHeld, settlementAmount = settlementAmount, settlementCurrencyExchangeRate = settlementCurrencyExchangeRate, settlementCurrencyIsoCode = settlementCurrencyIsoCode, success = success)
  
    __obj.asInstanceOf[DisbursementDetails]
  }
}

