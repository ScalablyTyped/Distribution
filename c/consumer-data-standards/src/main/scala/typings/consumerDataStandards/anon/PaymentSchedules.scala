package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.energyMod.EnergyPaymentSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentSchedules
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array may be empty if no payment schedule exist
    */
  var paymentSchedules: js.Array[EnergyPaymentSchedule]
}
object PaymentSchedules {
  
  inline def apply(paymentSchedules: js.Array[EnergyPaymentSchedule]): PaymentSchedules = {
    val __obj = js.Dynamic.literal(paymentSchedules = paymentSchedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentSchedules]
  }
  
  extension [Self <: PaymentSchedules](x: Self) {
    
    inline def setPaymentSchedules(value: js.Array[EnergyPaymentSchedule]): Self = StObject.set(x, "paymentSchedules", value.asInstanceOf[js.Any])
    
    inline def setPaymentSchedulesVarargs(value: EnergyPaymentSchedule*): Self = StObject.set(x, "paymentSchedules", js.Array(value*))
  }
}
