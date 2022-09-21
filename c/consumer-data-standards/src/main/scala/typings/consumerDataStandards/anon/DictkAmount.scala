package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkAmount
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The tariff amount
    */
  var amount: String
}
object DictkAmount {
  
  inline def apply(amount: String): DictkAmount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkAmount]
  }
  
  extension [Self <: DictkAmount](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
