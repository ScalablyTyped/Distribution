package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedElasticsearchInstanceOfferingResponse extends StObject {
  
  /**
    * The customer-specified identifier used to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.native
  
  /**
    * Details of the reserved Elasticsearch instance which was purchased.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
}
object PurchaseReservedElasticsearchInstanceOfferingResponse {
  
  @scala.inline
  def apply(): PurchaseReservedElasticsearchInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
  }
  
  @scala.inline
  implicit class PurchaseReservedElasticsearchInstanceOfferingResponseMutableBuilder[Self <: PurchaseReservedElasticsearchInstanceOfferingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationNameUndefined: Self = StObject.set(x, "ReservationName", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstanceIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceId", js.undefined)
  }
}
