package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkStringUnknownAccountsArray
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of usage on accounts
    */
  var accounts: js.Array[AccountIdServices]
}
object DictkStringUnknownAccountsArray {
  
  inline def apply(accounts: js.Array[AccountIdServices]): DictkStringUnknownAccountsArray = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkStringUnknownAccountsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkStringUnknownAccountsArray] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[AccountIdServices]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: AccountIdServices*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
