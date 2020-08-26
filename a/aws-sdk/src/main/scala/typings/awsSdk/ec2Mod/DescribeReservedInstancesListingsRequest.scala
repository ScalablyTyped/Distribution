package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesListingsRequest extends js.Object {
  /**
    * One or more filters.    reserved-instances-id - The ID of the Reserved Instances.    reserved-instances-listing-id - The ID of the Reserved Instances listing.    status - The status of the Reserved Instance listing (pending | active | cancelled | closed).    status-message - The reason for the status.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * One or more Reserved Instance IDs.
    */
  var ReservedInstancesId: js.UndefOr[ReservationId] = js.native
  /**
    * One or more Reserved Instance listing IDs.
    */
  var ReservedInstancesListingId: js.UndefOr[typings.awsSdk.ec2Mod.ReservedInstancesListingId] = js.native
}

object DescribeReservedInstancesListingsRequest {
  @scala.inline
  def apply(): DescribeReservedInstancesListingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesListingsRequest]
  }
  @scala.inline
  implicit class DescribeReservedInstancesListingsRequestOps[Self <: DescribeReservedInstancesListingsRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setReservedInstancesId(value: ReservationId): Self = this.set("ReservedInstancesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedInstancesId: Self = this.set("ReservedInstancesId", js.undefined)
    @scala.inline
    def setReservedInstancesListingId(value: ReservedInstancesListingId): Self = this.set("ReservedInstancesListingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedInstancesListingId: Self = this.set("ReservedInstancesListingId", js.undefined)
  }
  
}

