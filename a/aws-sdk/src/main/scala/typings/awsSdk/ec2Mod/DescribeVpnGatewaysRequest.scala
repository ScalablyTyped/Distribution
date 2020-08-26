package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpnGatewaysRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    amazon-side-asn - The Autonomous System Number (ASN) for the Amazon side of the gateway.    attachment.state - The current state of the attachment between the gateway and the VPC (attaching | attached | detaching | detached).    attachment.vpc-id - The ID of an attached VPC.    availability-zone - The Availability Zone for the virtual private gateway (if applicable).    state - The state of the virtual private gateway (pending | available | deleting | deleted).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    type - The type of virtual private gateway. Currently the only supported type is ipsec.1.    vpn-gateway-id - The ID of the virtual private gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * One or more virtual private gateway IDs. Default: Describes all your virtual private gateways.
    */
  var VpnGatewayIds: js.UndefOr[VpnGatewayIdStringList] = js.native
}

object DescribeVpnGatewaysRequest {
  @scala.inline
  def apply(): DescribeVpnGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnGatewaysRequest]
  }
  @scala.inline
  implicit class DescribeVpnGatewaysRequestOps[Self <: DescribeVpnGatewaysRequest] (val x: Self) extends AnyVal {
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
    def setVpnGatewayIdsVarargs(value: VpnGatewayId*): Self = this.set("VpnGatewayIds", js.Array(value :_*))
    @scala.inline
    def setVpnGatewayIds(value: VpnGatewayIdStringList): Self = this.set("VpnGatewayIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayIds: Self = this.set("VpnGatewayIds", js.undefined)
  }
  
}

