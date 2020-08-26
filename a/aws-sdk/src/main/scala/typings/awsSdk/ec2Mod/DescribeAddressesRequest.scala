package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAddressesRequest extends js.Object {
  /**
    * [EC2-VPC] Information about the allocation IDs.
    */
  var AllocationIds: js.UndefOr[AllocationIdList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. Filter names and values are case-sensitive.    allocation-id - [EC2-VPC] The allocation ID for the address.    association-id - [EC2-VPC] The association ID for the address.    domain - Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).    instance-id - The ID of the instance the address is associated with, if any.    network-border-group - The location from where the IP address is advertised.    network-interface-id - [EC2-VPC] The ID of the network interface that the address is associated with, if any.    network-interface-owner-id - The AWS account ID of the owner.    private-ip-address - [EC2-VPC] The private IP address associated with the Elastic IP address.    public-ip - The Elastic IP address.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * One or more Elastic IP addresses. Default: Describes all your Elastic IP addresses.
    */
  var PublicIps: js.UndefOr[PublicIpStringList] = js.native
}

object DescribeAddressesRequest {
  @scala.inline
  def apply(): DescribeAddressesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesRequest]
  }
  @scala.inline
  implicit class DescribeAddressesRequestOps[Self <: DescribeAddressesRequest] (val x: Self) extends AnyVal {
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
    def setAllocationIdsVarargs(value: AllocationId*): Self = this.set("AllocationIds", js.Array(value :_*))
    @scala.inline
    def setAllocationIds(value: AllocationIdList): Self = this.set("AllocationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationIds: Self = this.set("AllocationIds", js.undefined)
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
    def setPublicIpsVarargs(value: String*): Self = this.set("PublicIps", js.Array(value :_*))
    @scala.inline
    def setPublicIps(value: PublicIpStringList): Self = this.set("PublicIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIps: Self = this.set("PublicIps", js.undefined)
  }
  
}

