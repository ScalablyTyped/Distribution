package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationPlan extends StObject {
  
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
  implicit class ReservationPlanMutableBuilder[Self <: ReservationPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitment(value: Commitment): Self = StObject.set(x, "Commitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentUndefined: Self = StObject.set(x, "Commitment", js.undefined)
    
    @scala.inline
    def setExpiresAt(value: timestampUnix): Self = StObject.set(x, "ExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAtUndefined: Self = StObject.set(x, "ExpiresAt", js.undefined)
    
    @scala.inline
    def setPurchasedAt(value: timestampUnix): Self = StObject.set(x, "PurchasedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchasedAtUndefined: Self = StObject.set(x, "PurchasedAt", js.undefined)
    
    @scala.inline
    def setRenewalType(value: RenewalType): Self = StObject.set(x, "RenewalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalTypeUndefined: Self = StObject.set(x, "RenewalType", js.undefined)
    
    @scala.inline
    def setReservedSlots(value: integer): Self = StObject.set(x, "ReservedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedSlotsUndefined: Self = StObject.set(x, "ReservedSlots", js.undefined)
    
    @scala.inline
    def setStatus(value: ReservationPlanStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
