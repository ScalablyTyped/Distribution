package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedElasticsearchInstanceOfferingRequest extends StObject {
  
  /**
    * The number of Elasticsearch instances to reserve.
    */
  var InstanceCount: js.UndefOr[typings.awsSdk.esMod.InstanceCount] = js.undefined
  
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationName: ReservationToken
  
  /**
    * The ID of the reserved Elasticsearch instance offering to purchase.
    */
  var ReservedElasticsearchInstanceOfferingId: GUID
}
object PurchaseReservedElasticsearchInstanceOfferingRequest {
  
  inline def apply(ReservationName: ReservationToken, ReservedElasticsearchInstanceOfferingId: GUID): PurchaseReservedElasticsearchInstanceOfferingRequest = {
    val __obj = js.Dynamic.literal(ReservationName = ReservationName.asInstanceOf[js.Any], ReservedElasticsearchInstanceOfferingId = ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
  }
  
  extension [Self <: PurchaseReservedElasticsearchInstanceOfferingRequest](x: Self) {
    
    inline def setInstanceCount(value: InstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
  }
}
