package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.HOLD_ON_MATURITY
import typings.consumerDataStandards.consumerDataStandardsStrings.PAID_OUT_AT_MATURITY
import typings.consumerDataStandards.consumerDataStandardsStrings.ROLLED_OVER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingTermDepositAccount
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The lodgement date of the original deposit
    */
  var lodgementDate: String
  
  /**
    * Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
    */
  var maturityAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If absent assumes AUD
    */
  var maturityCurrency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maturity date for the term deposit
    */
  var maturityDate: String
  
  /**
    * Current instructions on action to be taken at maturity. This includes default actions that may be specified in the terms and conditions for the product e.g. roll-over to the same term and frequency of interest payments
    */
  var maturityInstructions: HOLD_ON_MATURITY | PAID_OUT_AT_MATURITY | ROLLED_OVER
}
object BankingTermDepositAccount {
  
  inline def apply(
    lodgementDate: String,
    maturityDate: String,
    maturityInstructions: HOLD_ON_MATURITY | PAID_OUT_AT_MATURITY | ROLLED_OVER
  ): BankingTermDepositAccount = {
    val __obj = js.Dynamic.literal(lodgementDate = lodgementDate.asInstanceOf[js.Any], maturityDate = maturityDate.asInstanceOf[js.Any], maturityInstructions = maturityInstructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingTermDepositAccount]
  }
  
  extension [Self <: BankingTermDepositAccount](x: Self) {
    
    inline def setLodgementDate(value: String): Self = StObject.set(x, "lodgementDate", value.asInstanceOf[js.Any])
    
    inline def setMaturityAmount(value: String): Self = StObject.set(x, "maturityAmount", value.asInstanceOf[js.Any])
    
    inline def setMaturityAmountNull: Self = StObject.set(x, "maturityAmount", null)
    
    inline def setMaturityAmountUndefined: Self = StObject.set(x, "maturityAmount", js.undefined)
    
    inline def setMaturityCurrency(value: String): Self = StObject.set(x, "maturityCurrency", value.asInstanceOf[js.Any])
    
    inline def setMaturityCurrencyNull: Self = StObject.set(x, "maturityCurrency", null)
    
    inline def setMaturityCurrencyUndefined: Self = StObject.set(x, "maturityCurrency", js.undefined)
    
    inline def setMaturityDate(value: String): Self = StObject.set(x, "maturityDate", value.asInstanceOf[js.Any])
    
    inline def setMaturityInstructions(value: HOLD_ON_MATURITY | PAID_OUT_AT_MATURITY | ROLLED_OVER): Self = StObject.set(x, "maturityInstructions", value.asInstanceOf[js.Any])
  }
}
