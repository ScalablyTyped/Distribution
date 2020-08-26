package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    availability-zone - The Availability Zone where the Reserved Instance can be used.    duration - The duration of the Reserved Instance (one year or three years), in seconds (31536000 | 94608000).    end - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).    fixed-price - The purchase price of the Reserved Instance (for example, 9800.0).    instance-type - The instance type that is covered by the reservation.    scope - The scope of the Reserved Instance (Region or Availability Zone).    product-description - The Reserved Instance product platform description. Instances that include (Amazon VPC) in the product platform description will only be displayed to EC2-Classic account holders and are for use with Amazon VPC (Linux/UNIX | Linux/UNIX (Amazon VPC) | SUSE Linux | SUSE Linux (Amazon VPC) | Red Hat Enterprise Linux | Red Hat Enterprise Linux (Amazon VPC) | Windows | Windows (Amazon VPC) | Windows with SQL Server Standard | Windows with SQL Server Standard (Amazon VPC) | Windows with SQL Server Web | Windows with SQL Server Web (Amazon VPC) | Windows with SQL Server Enterprise | Windows with SQL Server Enterprise (Amazon VPC)).    reserved-instances-id - The ID of the Reserved Instance.    start - The time at which the Reserved Instance purchase request was placed (for example, 2014-08-07T11:54:42.000Z).    state - The state of the Reserved Instance (payment-pending | active | payment-failed | retired).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    usage-price - The usage price of the Reserved Instance, per hour (for example, 0.84).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * Describes whether the Reserved Instance is Standard or Convertible.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.native
  /**
    * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only have access to the Medium Utilization Reserved Instance offering type.
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.native
  /**
    * One or more Reserved Instance IDs. Default: Describes all your Reserved Instances, or only those otherwise specified.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList] = js.native
}

object DescribeReservedInstancesRequest {
  @scala.inline
  def apply(): DescribeReservedInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesRequest]
  }
  @scala.inline
  implicit class DescribeReservedInstancesRequestOps[Self <: DescribeReservedInstancesRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setOfferingClass(value: OfferingClassType): Self = this.set("OfferingClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingClass: Self = this.set("OfferingClass", js.undefined)
    @scala.inline
    def setOfferingType(value: OfferingTypeValues): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    @scala.inline
    def setReservedInstancesIdsVarargs(value: ReservationId*): Self = this.set("ReservedInstancesIds", js.Array(value :_*))
    @scala.inline
    def setReservedInstancesIds(value: ReservedInstancesIdStringList): Self = this.set("ReservedInstancesIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedInstancesIds: Self = this.set("ReservedInstancesIds", js.undefined)
  }
  
}

