package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
  
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
  implicit class PurchaseReservedElasticsearchInstanceOfferingResponseOps[Self <: PurchaseReservedElasticsearchInstanceOfferingResponse] (val x: Self) extends AnyVal {
    
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
    def deleteReservationName: Self = this.set("ReservationName", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceId(value: GUID): Self = this.set("ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedElasticsearchInstanceId: Self = this.set("ReservedElasticsearchInstanceId", js.undefined)
  }
}
