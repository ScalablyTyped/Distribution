package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsArray
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of accounts
    */
  var accounts: js.Array[LastUpdated]
}
object AccountsArray {
  
  inline def apply(accounts: js.Array[LastUpdated]): AccountsArray = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountsArray] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[LastUpdated]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: LastUpdated*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
