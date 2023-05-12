package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkPaymentSchedules
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array may be empty if no payment schedule exist
    */
  var paymentSchedules: js.Array[CardDebit]
}
object DictkPaymentSchedules {
  
  inline def apply(paymentSchedules: js.Array[CardDebit]): DictkPaymentSchedules = {
    val __obj = js.Dynamic.literal(paymentSchedules = paymentSchedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkPaymentSchedules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkPaymentSchedules] (val x: Self) extends AnyVal {
    
    inline def setPaymentSchedules(value: js.Array[CardDebit]): Self = StObject.set(x, "paymentSchedules", value.asInstanceOf[js.Any])
    
    inline def setPaymentSchedulesVarargs(value: CardDebit*): Self = StObject.set(x, "paymentSchedules", js.Array(value*))
  }
}
