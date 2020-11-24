package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisbursementDetails extends js.Object {
  
  var disbursementDate: Date = js.native
  
  var fundsHeld: Boolean = js.native
  
  var settlementAmount: String = js.native
  
  var settlementCurrencyExchangeRate: String = js.native
  
  var settlementCurrencyIsoCode: String = js.native
  
  var success: Boolean = js.native
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
  
  @scala.inline
  implicit class DisbursementDetailsOps[Self <: DisbursementDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisbursementDate(value: Date): Self = this.set("disbursementDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundsHeld(value: Boolean): Self = this.set("fundsHeld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementAmount(value: String): Self = this.set("settlementAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementCurrencyExchangeRate(value: String): Self = this.set("settlementCurrencyExchangeRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementCurrencyIsoCode(value: String): Self = this.set("settlementCurrencyIsoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
