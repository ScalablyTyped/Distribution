package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkBalances
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of account balances
    */
  var balances: js.Array[Balance]
}
object DictkBalances {
  
  inline def apply(balances: js.Array[Balance]): DictkBalances = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkBalances]
  }
  
  extension [Self <: DictkBalances](x: Self) {
    
    inline def setBalances(value: js.Array[Balance]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    inline def setBalancesVarargs(value: Balance*): Self = StObject.set(x, "balances", js.Array(value*))
  }
}
