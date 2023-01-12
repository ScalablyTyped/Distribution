package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingScheduledPaymentRecurrenceOnceOff
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The scheduled date for the once off payment
    */
  var paymentDate: String
}
object BankingScheduledPaymentRecurrenceOnceOff {
  
  inline def apply(paymentDate: String): BankingScheduledPaymentRecurrenceOnceOff = {
    val __obj = js.Dynamic.literal(paymentDate = paymentDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingScheduledPaymentRecurrenceOnceOff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingScheduledPaymentRecurrenceOnceOff] (val x: Self) extends AnyVal {
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
  }
}
