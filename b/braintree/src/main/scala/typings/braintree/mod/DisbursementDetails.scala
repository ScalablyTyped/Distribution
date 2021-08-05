package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisbursementDetails extends StObject {
  
  var disbursementDate: Date
  
  var fundsHeld: Boolean
  
  var settlementAmount: String
  
  var settlementCurrencyExchangeRate: String
  
  var settlementCurrencyIsoCode: String
  
  var success: Boolean
}
object DisbursementDetails {
  
  inline def apply(
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
  
  extension [Self <: DisbursementDetails](x: Self) {
    
    inline def setDisbursementDate(value: Date): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    inline def setFundsHeld(value: Boolean): Self = StObject.set(x, "fundsHeld", value.asInstanceOf[js.Any])
    
    inline def setSettlementAmount(value: String): Self = StObject.set(x, "settlementAmount", value.asInstanceOf[js.Any])
    
    inline def setSettlementCurrencyExchangeRate(value: String): Self = StObject.set(x, "settlementCurrencyExchangeRate", value.asInstanceOf[js.Any])
    
    inline def setSettlementCurrencyIsoCode(value: String): Self = StObject.set(x, "settlementCurrencyIsoCode", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
