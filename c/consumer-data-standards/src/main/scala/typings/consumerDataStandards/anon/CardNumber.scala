package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardNumber
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Name of the account to pay to
    */
  var cardNumber: String
}
object CardNumber {
  
  inline def apply(cardNumber: String): CardNumber = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardNumber] (val x: Self) extends AnyVal {
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
  }
}
