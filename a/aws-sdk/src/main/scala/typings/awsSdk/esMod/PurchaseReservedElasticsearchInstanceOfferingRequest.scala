package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedElasticsearchInstanceOfferingRequest extends StObject {
  
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
  implicit class PurchaseReservedElasticsearchInstanceOfferingRequestMutableBuilder[Self <: PurchaseReservedElasticsearchInstanceOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCount(value: InstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
  }
}
