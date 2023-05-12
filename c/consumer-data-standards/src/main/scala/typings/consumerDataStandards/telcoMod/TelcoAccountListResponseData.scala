package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.LastUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccountListResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of accounts
    */
  var accounts: js.Array[LastUpdated]
}
object TelcoAccountListResponseData {
  
  inline def apply(accounts: js.Array[LastUpdated]): TelcoAccountListResponseData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccountListResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccountListResponseData] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[LastUpdated]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: LastUpdated*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
