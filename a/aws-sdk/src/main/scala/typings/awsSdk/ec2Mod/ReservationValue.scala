package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationValue extends js.Object {
  
  /**
    * The hourly rate of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  
  /**
    * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
    */
  var RemainingTotalValue: js.UndefOr[String] = js.native
  
  /**
    * The remaining upfront cost of the reservation.
    */
  var RemainingUpfrontValue: js.UndefOr[String] = js.native
}
object ReservationValue {
  
  @scala.inline
  def apply(): ReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationValue]
  }
  
  @scala.inline
  implicit class ReservationValueOps[Self <: ReservationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHourlyPrice(value: String): Self = this.set("HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlyPrice: Self = this.set("HourlyPrice", js.undefined)
    
    @scala.inline
    def setRemainingTotalValue(value: String): Self = this.set("RemainingTotalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingTotalValue: Self = this.set("RemainingTotalValue", js.undefined)
    
    @scala.inline
    def setRemainingUpfrontValue(value: String): Self = this.set("RemainingUpfrontValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingUpfrontValue: Self = this.set("RemainingUpfrontValue", js.undefined)
  }
}
