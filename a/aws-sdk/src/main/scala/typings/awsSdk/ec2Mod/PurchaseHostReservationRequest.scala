package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseHostReservationRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The currency in which the totalUpfrontPrice, LimitPrice, and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The IDs of the Dedicated Hosts with which the reservation will be associated.
    */
  var HostIdSet: RequestHostIdSet = js.native
  /**
    * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit, the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the purchase. At this time, the only supported currency is USD. For example, to indicate a limit price of USD 100, specify 100.00.
    */
  var LimitPrice: js.UndefOr[String] = js.native
  /**
    * The ID of the offering.
    */
  var OfferingId: typings.awsSdk.ec2Mod.OfferingId = js.native
  /**
    * The tags to apply to the Dedicated Host Reservation during purchase.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object PurchaseHostReservationRequest {
  @scala.inline
  def apply(
    HostIdSet: RequestHostIdSet,
    OfferingId: OfferingId,
    ClientToken: String = null,
    CurrencyCode: CurrencyCodeValues = null,
    LimitPrice: String = null,
    TagSpecifications: TagSpecificationList = null
  ): PurchaseHostReservationRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (LimitPrice != null) __obj.updateDynamic("LimitPrice")(LimitPrice.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseHostReservationRequest]
  }
}

