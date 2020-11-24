package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseOfferingResponse extends js.Object {
  
  var Reservation: js.UndefOr[typings.awsSdk.mediaconnectMod.Reservation] = js.native
}
object PurchaseOfferingResponse {
  
  @scala.inline
  def apply(): PurchaseOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingResponse]
  }
  
  @scala.inline
  implicit class PurchaseOfferingResponseOps[Self <: PurchaseOfferingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReservation(value: Reservation): Self = this.set("Reservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservation: Self = this.set("Reservation", js.undefined)
  }
}
