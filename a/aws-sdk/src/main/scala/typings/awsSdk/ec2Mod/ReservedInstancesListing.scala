package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesListing extends js.Object {
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The time the listing was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.native
  /**
    * The number of instances in this state.
    */
  var InstanceCounts: js.UndefOr[InstanceCountList] = js.native
  /**
    * The price of the Reserved Instance listing.
    */
  var PriceSchedules: js.UndefOr[PriceScheduleList] = js.native
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: js.UndefOr[String] = js.native
  /**
    * The status of the Reserved Instance listing.
    */
  var Status: js.UndefOr[ListingStatus] = js.native
  /**
    * The reason for the current status of the Reserved Instance listing. The response can be blank.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The last modified timestamp of the listing.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.native
}

object ReservedInstancesListing {
  @scala.inline
  def apply(
    ClientToken: String = null,
    CreateDate: DateTime = null,
    InstanceCounts: InstanceCountList = null,
    PriceSchedules: PriceScheduleList = null,
    ReservedInstancesId: String = null,
    ReservedInstancesListingId: String = null,
    Status: ListingStatus = null,
    StatusMessage: String = null,
    Tags: TagList = null,
    UpdateDate: DateTime = null
  ): ReservedInstancesListing = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (InstanceCounts != null) __obj.updateDynamic("InstanceCounts")(InstanceCounts.asInstanceOf[js.Any])
    if (PriceSchedules != null) __obj.updateDynamic("PriceSchedules")(PriceSchedules.asInstanceOf[js.Any])
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId.asInstanceOf[js.Any])
    if (ReservedInstancesListingId != null) __obj.updateDynamic("ReservedInstancesListingId")(ReservedInstancesListingId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstancesListing]
  }
}

