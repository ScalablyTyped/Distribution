package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
  
  /**
    * The number of Elasticsearch instances to reserve.
    */
  var InstanceCount: js.UndefOr[typings.awsSdk.esMod.InstanceCount] = js.native
  
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationName: ReservationToken = js.native
  
  /**
    * The ID of the reserved Elasticsearch instance offering to purchase.
    */
  var ReservedElasticsearchInstanceOfferingId: GUID = js.native
}
object PurchaseReservedElasticsearchInstanceOfferingRequest {
  
  @scala.inline
  def apply(ReservationName: ReservationToken, ReservedElasticsearchInstanceOfferingId: GUID): PurchaseReservedElasticsearchInstanceOfferingRequest = {
    val __obj = js.Dynamic.literal(ReservationName = ReservationName.asInstanceOf[js.Any], ReservedElasticsearchInstanceOfferingId = ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
  }
  
  @scala.inline
  implicit class PurchaseReservedElasticsearchInstanceOfferingRequestOps[Self <: PurchaseReservedElasticsearchInstanceOfferingRequest] (val x: Self) extends AnyVal {
    
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
    def setReservationName(value: ReservationToken): Self = this.set("ReservationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingId(value: GUID): Self = this.set("ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCount(value: InstanceCount): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
  }
}
