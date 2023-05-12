package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AccountIdBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBalanceListResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of account balances
    */
  var balances: js.Array[AccountIdBalance]
}
object TelcoBalanceListResponseData {
  
  inline def apply(balances: js.Array[AccountIdBalance]): TelcoBalanceListResponseData = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBalanceListResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBalanceListResponseData] (val x: Self) extends AnyVal {
    
    inline def setBalances(value: js.Array[AccountIdBalance]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    inline def setBalancesVarargs(value: AccountIdBalance*): Self = StObject.set(x, "balances", js.Array(value*))
  }
}
