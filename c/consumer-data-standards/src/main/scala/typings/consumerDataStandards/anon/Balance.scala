package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Balance
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The ID of the account
    */
  var accountId: String
  
  /**
    * The current balance of the account.  A positive value indicates that amount is owing to be paid.  A negative value indicates that the account is in credit
    */
  var balance: String
}
object Balance {
  
  inline def apply(accountId: String, balance: String): Balance = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
  
  extension [Self <: Balance](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
  }
}
