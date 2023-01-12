package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkAccounts
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of accounts
    */
  var accounts: js.Array[DictkAccountId]
}
object DictkAccounts {
  
  inline def apply(accounts: js.Array[DictkAccountId]): DictkAccounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkAccounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkAccounts] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[DictkAccountId]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: DictkAccountId*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
