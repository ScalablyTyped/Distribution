package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkStringUnknown
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of accounts
    */
  var accounts: js.Array[DictkAccountId]
}
object DictkStringUnknown {
  
  inline def apply(accounts: js.Array[DictkAccountId]): DictkStringUnknown = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkStringUnknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkStringUnknown] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[DictkAccountId]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: DictkAccountId*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
