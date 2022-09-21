package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Balances
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The list of balances returned
    */
  var balances: js.Array[AmortisedLimit]
}
object Balances {
  
  inline def apply(balances: js.Array[AmortisedLimit]): Balances = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balances]
  }
  
  extension [Self <: Balances](x: Self) {
    
    inline def setBalances(value: js.Array[AmortisedLimit]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    inline def setBalancesVarargs(value: AmortisedLimit*): Self = StObject.set(x, "balances", js.Array(value*))
  }
}
