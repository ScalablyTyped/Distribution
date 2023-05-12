package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AccountIdServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageListResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of usage on accounts
    */
  var accounts: js.Array[AccountIdServices]
}
object TelcoUsageListResponseData {
  
  inline def apply(accounts: js.Array[AccountIdServices]): TelcoUsageListResponseData = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageListResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageListResponseData] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[AccountIdServices]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: AccountIdServices*): Self = StObject.set(x, "accounts", js.Array(value*))
  }
}
