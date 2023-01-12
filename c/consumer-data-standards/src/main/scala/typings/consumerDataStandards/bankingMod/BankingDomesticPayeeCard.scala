package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingDomesticPayeeCard
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Name of the account to pay to
    */
  var cardNumber: String
}
object BankingDomesticPayeeCard {
  
  inline def apply(cardNumber: String): BankingDomesticPayeeCard = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingDomesticPayeeCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingDomesticPayeeCard] (val x: Self) extends AnyVal {
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
  }
}
