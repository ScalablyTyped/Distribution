package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AccountNumber
import typings.consumerDataStandards.anon.Country
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingInternationalPayee
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var bankDetails: AccountNumber
  
  var beneficiaryDetails: Country
}
object BankingInternationalPayee {
  
  inline def apply(bankDetails: AccountNumber, beneficiaryDetails: Country): BankingInternationalPayee = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], beneficiaryDetails = beneficiaryDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingInternationalPayee]
  }
  
  extension [Self <: BankingInternationalPayee](x: Self) {
    
    inline def setBankDetails(value: AccountNumber): Self = StObject.set(x, "bankDetails", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryDetails(value: Country): Self = StObject.set(x, "beneficiaryDetails", value.asInstanceOf[js.Any])
  }
}
