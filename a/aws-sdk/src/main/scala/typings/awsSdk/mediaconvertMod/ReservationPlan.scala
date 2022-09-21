package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPlan extends StObject {
  
  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  var Commitment: js.UndefOr[typings.awsSdk.mediaconvertMod.Commitment] = js.undefined
  
  /**
    * The timestamp in epoch seconds for when the current pricing plan term for this reserved queue expires.
    */
  var ExpiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp in epoch seconds for when you set up the current pricing plan for this reserved queue.
    */
  var PurchasedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  var RenewalType: js.UndefOr[typings.awsSdk.mediaconvertMod.RenewalType] = js.undefined
  
  /**
    * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. When you increase this number, you extend your existing commitment with a new 12-month commitment for a larger number of RTS. The new commitment begins when you purchase the additional capacity. You can't decrease the number of RTS in your reserved queue.
    */
  var ReservedSlots: js.UndefOr[integer] = js.undefined
  
  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  var Status: js.UndefOr[ReservationPlanStatus] = js.undefined
}
object ReservationPlan {
  
  inline def apply(): ReservationPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPlan]
  }
  
  extension [Self <: ReservationPlan](x: Self) {
    
    inline def setCommitment(value: Commitment): Self = StObject.set(x, "Commitment", value.asInstanceOf[js.Any])
    
    inline def setCommitmentUndefined: Self = StObject.set(x, "Commitment", js.undefined)
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "ExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "ExpiresAt", js.undefined)
    
    inline def setPurchasedAt(value: js.Date): Self = StObject.set(x, "PurchasedAt", value.asInstanceOf[js.Any])
    
    inline def setPurchasedAtUndefined: Self = StObject.set(x, "PurchasedAt", js.undefined)
    
    inline def setRenewalType(value: RenewalType): Self = StObject.set(x, "RenewalType", value.asInstanceOf[js.Any])
    
    inline def setRenewalTypeUndefined: Self = StObject.set(x, "RenewalType", js.undefined)
    
    inline def setReservedSlots(value: integer): Self = StObject.set(x, "ReservedSlots", value.asInstanceOf[js.Any])
    
    inline def setReservedSlotsUndefined: Self = StObject.set(x, "ReservedSlots", js.undefined)
    
    inline def setStatus(value: ReservationPlanStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
