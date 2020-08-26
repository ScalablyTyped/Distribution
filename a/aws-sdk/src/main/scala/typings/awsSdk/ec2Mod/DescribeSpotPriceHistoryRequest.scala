package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotPriceHistoryRequest extends js.Object {
  /**
    * Filters the results by the specified Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The date and time, up to the current date, from which to stop retrieving the price history data, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  /**
    * One or more filters.    availability-zone - The Availability Zone for which prices should be returned.    instance-type - The type of instance (for example, m3.medium).    product-description - The product description for the Spot price (Linux/UNIX | SUSE Linux | Windows | Linux/UNIX (Amazon VPC) | SUSE Linux (Amazon VPC) | Windows (Amazon VPC)).    spot-price - The Spot price. The value must match exactly (or use wildcards; greater than or less than comparison is not supported).    timestamp - The time stamp of the Spot price history, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). You can use wildcards (* and ?). Greater than or less than comparison is not supported.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * Filters the results by the specified instance types.
    */
  var InstanceTypes: js.UndefOr[InstanceTypeList] = js.native
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Filters the results by the specified basic product descriptions.
    */
  var ProductDescriptions: js.UndefOr[ProductDescriptionList] = js.native
  /**
    * The date and time, up to the past 90 days, from which to start retrieving the price history data, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.native
}

object DescribeSpotPriceHistoryRequest {
  @scala.inline
  def apply(): DescribeSpotPriceHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotPriceHistoryRequest]
  }
  @scala.inline
  implicit class DescribeSpotPriceHistoryRequestOps[Self <: DescribeSpotPriceHistoryRequest] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEndTime(value: DateTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceType*): Self = this.set("InstanceTypes", js.Array(value :_*))
    @scala.inline
    def setInstanceTypes(value: InstanceTypeList): Self = this.set("InstanceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTypes: Self = this.set("InstanceTypes", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProductDescriptionsVarargs(value: String*): Self = this.set("ProductDescriptions", js.Array(value :_*))
    @scala.inline
    def setProductDescriptions(value: ProductDescriptionList): Self = this.set("ProductDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDescriptions: Self = this.set("ProductDescriptions", js.undefined)
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

