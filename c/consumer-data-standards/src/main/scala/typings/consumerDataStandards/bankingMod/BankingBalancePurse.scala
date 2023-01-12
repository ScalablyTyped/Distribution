package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingBalancePurse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The balance available for this additional currency purse
    */
  var amount: String
  
  /**
    * The currency for the purse
    */
  var currency: js.UndefOr[String | Null] = js.undefined
}
object BankingBalancePurse {
  
  inline def apply(amount: String): BankingBalancePurse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingBalancePurse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingBalancePurse] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
