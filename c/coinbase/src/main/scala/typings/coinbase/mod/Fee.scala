package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fee extends StObject {
  
  /**
    * Amount associated to this fee
    */
  var amount: MoneyHash
  
  /**
    * Fee beneficiary ("bank", "coinbase", ...)
    */
  var `type`: String
}
object Fee {
  
  inline def apply(amount: MoneyHash, `type`: String): Fee = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fee] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: MoneyHash): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
