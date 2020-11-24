package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationPlan extends js.Object {
  
  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  var Commitment: js.UndefOr[typings.awsSdk.mediaconvertMod.Commitment] = js.native
  
  /**
    * The timestamp in epoch seconds for when the current pricing plan term for this reserved queue expires.
    */
  var ExpiresAt: js.UndefOr[timestampUnix] = js.native
  
  /**
    * The timestamp in epoch seconds for when you set up the current pricing plan for this reserved queue.
    */
  var PurchasedAt: js.UndefOr[timestampUnix] = js.native
  
  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  var RenewalType: js.UndefOr[typings.awsSdk.mediaconvertMod.RenewalType] = js.native
  
  /**
    * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. When you increase this number, you extend your existing commitment with a new 12-month commitment for a larger number of RTS. The new commitment begins when you purchase the additional capacity. You can't decrease the number of RTS in your reserved queue.
    */
  var ReservedSlots: js.UndefOr[integer] = js.native
  
  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  var Status: js.UndefOr[ReservationPlanStatus] = js.native
}
object ReservationPlan {
  
  @scala.inline
  def apply(): ReservationPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPlan]
  }
  
  @scala.inline
  implicit class ReservationPlanOps[Self <: ReservationPlan] (val x: Self) extends AnyVal {
    
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
    def setCommitment(value: Commitment): Self = this.set("Commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitment: Self = this.set("Commitment", js.undefined)
    
    @scala.inline
    def setExpiresAt(value: timestampUnix): Self = this.set("ExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresAt: Self = this.set("ExpiresAt", js.undefined)
    
    @scala.inline
    def setPurchasedAt(value: timestampUnix): Self = this.set("PurchasedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchasedAt: Self = this.set("PurchasedAt", js.undefined)
    
    @scala.inline
    def setRenewalType(value: RenewalType): Self = this.set("RenewalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalType: Self = this.set("RenewalType", js.undefined)
    
    @scala.inline
    def setReservedSlots(value: integer): Self = this.set("ReservedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedSlots: Self = this.set("ReservedSlots", js.undefined)
    
    @scala.inline
    def setStatus(value: ReservationPlanStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
