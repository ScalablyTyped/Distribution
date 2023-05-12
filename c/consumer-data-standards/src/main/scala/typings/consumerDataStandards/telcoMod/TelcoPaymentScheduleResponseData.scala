package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.CardDebit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoPaymentScheduleResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array may be empty if no payment schedule exist
    */
  var paymentSchedules: js.Array[CardDebit]
}
object TelcoPaymentScheduleResponseData {
  
  inline def apply(paymentSchedules: js.Array[CardDebit]): TelcoPaymentScheduleResponseData = {
    val __obj = js.Dynamic.literal(paymentSchedules = paymentSchedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoPaymentScheduleResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoPaymentScheduleResponseData] (val x: Self) extends AnyVal {
    
    inline def setPaymentSchedules(value: js.Array[CardDebit]): Self = StObject.set(x, "paymentSchedules", value.asInstanceOf[js.Any])
    
    inline def setPaymentSchedulesVarargs(value: CardDebit*): Self = StObject.set(x, "paymentSchedules", js.Array(value*))
  }
}
