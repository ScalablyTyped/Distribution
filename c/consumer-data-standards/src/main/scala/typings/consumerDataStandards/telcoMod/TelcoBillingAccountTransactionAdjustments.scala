package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBillingAccountTransactionAdjustments
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The amount of the adjustment
    */
  var amount: String
  
  /**
    * A free text description of the adjustment
    */
  var description: String
}
object TelcoBillingAccountTransactionAdjustments {
  
  inline def apply(amount: String, description: String): TelcoBillingAccountTransactionAdjustments = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBillingAccountTransactionAdjustments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBillingAccountTransactionAdjustments] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
