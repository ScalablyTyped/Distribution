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
  def apply(HostIdSet: RequestHostIdSet, OfferingId: OfferingId): PurchaseHostReservationRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseHostReservationRequest]
  }
  @scala.inline
  implicit class PurchaseHostReservationRequestOps[Self <: PurchaseHostReservationRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setLimitPrice(value: String): Self = this.set("LimitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitPrice: Self = this.set("LimitPrice", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

