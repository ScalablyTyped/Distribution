package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstanceReservationValue extends js.Object {
  
  /**
    * The total value of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservationValue: js.UndefOr[typings.awsSdk.ec2Mod.ReservationValue] = js.native
  
  /**
    * The ID of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservedInstanceId: js.UndefOr[String] = js.native
}
object ReservedInstanceReservationValue {
  
  @scala.inline
  def apply(): ReservedInstanceReservationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstanceReservationValue]
  }
  
  @scala.inline
  implicit class ReservedInstanceReservationValueOps[Self <: ReservedInstanceReservationValue] (val x: Self) extends AnyVal {
    
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
    def setReservationValue(value: ReservationValue): Self = this.set("ReservationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationValue: Self = this.set("ReservationValue", js.undefined)
    
    @scala.inline
    def setReservedInstanceId(value: String): Self = this.set("ReservedInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstanceId: Self = this.set("ReservedInstanceId", js.undefined)
  }
}
