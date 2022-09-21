package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostReservationPurchasePreviewRequest extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts with which the reservation is associated.
    */
  var HostIdSet: RequestHostIdSet
  
  /**
    * The offering ID of the reservation.
    */
  var OfferingId: typings.awsSdk.ec2Mod.OfferingId
}
object GetHostReservationPurchasePreviewRequest {
  
  inline def apply(HostIdSet: RequestHostIdSet, OfferingId: OfferingId): GetHostReservationPurchasePreviewRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostReservationPurchasePreviewRequest]
  }
  
  extension [Self <: GetHostReservationPurchasePreviewRequest](x: Self) {
    
    inline def setHostIdSet(value: RequestHostIdSet): Self = StObject.set(x, "HostIdSet", value.asInstanceOf[js.Any])
    
    inline def setHostIdSetVarargs(value: DedicatedHostId*): Self = StObject.set(x, "HostIdSet", js.Array(value*))
    
    inline def setOfferingId(value: OfferingId): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
  }
}
