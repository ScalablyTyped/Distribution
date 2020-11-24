package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostReservationPurchasePreviewRequest extends js.Object {
  
  /**
    * The IDs of the Dedicated Hosts with which the reservation is associated.
    */
  var HostIdSet: RequestHostIdSet = js.native
  
  /**
    * The offering ID of the reservation.
    */
  var OfferingId: typings.awsSdk.ec2Mod.OfferingId = js.native
}
object GetHostReservationPurchasePreviewRequest {
  
  @scala.inline
  def apply(HostIdSet: RequestHostIdSet, OfferingId: OfferingId): GetHostReservationPurchasePreviewRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostReservationPurchasePreviewRequest]
  }
  
  @scala.inline
  implicit class GetHostReservationPurchasePreviewRequestOps[Self <: GetHostReservationPurchasePreviewRequest] (val x: Self) extends AnyVal {
    
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
    def setHostIdSetVarargs(value: DedicatedHostId*): Self = this.set("HostIdSet", js.Array(value :_*))
    
    @scala.inline
    def setHostIdSet(value: RequestHostIdSet): Self = this.set("HostIdSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingId(value: OfferingId): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
  }
}
