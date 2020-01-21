package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(ReservationName: ReservationToken = null, ReservedElasticsearchInstanceId: GUID = null): PurchaseReservedElasticsearchInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    if (ReservationName != null) __obj.updateDynamic("ReservationName")(ReservationName.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstanceId != null) __obj.updateDynamic("ReservedElasticsearchInstanceId")(ReservedElasticsearchInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
  }
}

