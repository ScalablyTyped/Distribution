package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankDetails
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var bankDetails: AccountNumber
  
  var beneficiaryDetails: Country
}
object BankDetails {
  
  inline def apply(bankDetails: AccountNumber, beneficiaryDetails: Country): BankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], beneficiaryDetails = beneficiaryDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankDetails] (val x: Self) extends AnyVal {
    
    inline def setBankDetails(value: AccountNumber): Self = StObject.set(x, "bankDetails", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryDetails(value: Country): Self = StObject.set(x, "beneficiaryDetails", value.asInstanceOf[js.Any])
  }
}
