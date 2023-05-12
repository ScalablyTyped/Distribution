package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BalancesArray
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of account balances
    */
  var balances: js.Array[AccountIdBalance]
}
object BalancesArray {
  
  inline def apply(balances: js.Array[AccountIdBalance]): BalancesArray = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalancesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BalancesArray] (val x: Self) extends AnyVal {
    
    inline def setBalances(value: js.Array[AccountIdBalance]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    inline def setBalancesVarargs(value: AccountIdBalance*): Self = StObject.set(x, "balances", js.Array(value*))
  }
}
