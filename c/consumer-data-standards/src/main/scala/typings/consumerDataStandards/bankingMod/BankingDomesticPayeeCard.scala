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
  
  extension [Self <: BankingDomesticPayeeCard](x: Self) {
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
  }
}
