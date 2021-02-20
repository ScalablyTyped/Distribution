package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisbursementDetails extends StObject {
  
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
  implicit class DisbursementDetailsMutableBuilder[Self <: DisbursementDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisbursementDate(value: Date): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundsHeld(value: Boolean): Self = StObject.set(x, "fundsHeld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementAmount(value: String): Self = StObject.set(x, "settlementAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementCurrencyExchangeRate(value: String): Self = StObject.set(x, "settlementCurrencyExchangeRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementCurrencyIsoCode(value: String): Self = StObject.set(x, "settlementCurrencyIsoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
