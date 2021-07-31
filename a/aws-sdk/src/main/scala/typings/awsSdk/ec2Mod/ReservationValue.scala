package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationValue extends StObject {
  
  /**
    * The hourly rate of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
    */
  var RemainingTotalValue: js.UndefOr[String] = js.undefined
  
  /**
    * The remaining upfront cost of the reservation.
    */
  var RemainingUpfrontValue: js.UndefOr[String] = js.undefined
}
object ReservationValue {
  
  @scala.inline
  def apply(): ReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationValue]
  }
  
  @scala.inline
  implicit class ReservationValueMutableBuilder[Self <: ReservationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    @scala.inline
    def setRemainingTotalValue(value: String): Self = StObject.set(x, "RemainingTotalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingTotalValueUndefined: Self = StObject.set(x, "RemainingTotalValue", js.undefined)
    
    @scala.inline
    def setRemainingUpfrontValue(value: String): Self = StObject.set(x, "RemainingUpfrontValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingUpfrontValueUndefined: Self = StObject.set(x, "RemainingUpfrontValue", js.undefined)
  }
}
