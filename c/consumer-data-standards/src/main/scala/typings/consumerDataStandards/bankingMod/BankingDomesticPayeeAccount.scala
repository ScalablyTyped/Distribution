package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingDomesticPayeeAccount
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Name of the account to pay to
    */
  var accountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of the account to pay to
    */
  var accountNumber: String
  
  /**
    * BSB of the account to pay to
    */
  var bsb: String
}
object BankingDomesticPayeeAccount {
  
  inline def apply(accountNumber: String, bsb: String): BankingDomesticPayeeAccount = {
    val __obj = js.Dynamic.literal(accountNumber = accountNumber.asInstanceOf[js.Any], bsb = bsb.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingDomesticPayeeAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingDomesticPayeeAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "accountNumber", value.asInstanceOf[js.Any])
    
    inline def setBsb(value: String): Self = StObject.set(x, "bsb", value.asInstanceOf[js.Any])
  }
}
