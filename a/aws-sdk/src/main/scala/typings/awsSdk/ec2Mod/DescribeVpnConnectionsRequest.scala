package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpnConnectionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    customer-gateway-configuration - The configuration information for the customer gateway.    customer-gateway-id - The ID of a customer gateway associated with the VPN connection.    state - The state of the VPN connection (pending | available | deleting | deleted).    option.static-routes-only - Indicates whether the connection has static routes only. Used for devices that do not support Border Gateway Protocol (BGP).    route.destination-cidr-block - The destination CIDR block. This corresponds to the subnet used in a customer data center.    bgp-asn - The BGP Autonomous System Number (ASN) associated with a BGP device.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    type - The type of VPN connection. Currently the only supported type is ipsec.1.    vpn-connection-id - The ID of the VPN connection.    vpn-gateway-id - The ID of a virtual private gateway associated with the VPN connection.    transit-gateway-id - The ID of a transit gateway associated with the VPN connection.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * One or more VPN connection IDs. Default: Describes your VPN connections.
    */
  var VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList] = js.native
}

object DescribeVpnConnectionsRequest {
  @scala.inline
  def apply(): DescribeVpnConnectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnConnectionsRequest]
  }
  @scala.inline
  implicit class DescribeVpnConnectionsRequestOps[Self <: DescribeVpnConnectionsRequest] (val x: Self) extends AnyVal {
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
    def setVpnConnectionIdsVarargs(value: VpnConnectionId*): Self = this.set("VpnConnectionIds", js.Array(value :_*))
    @scala.inline
    def setVpnConnectionIds(value: VpnConnectionIdStringList): Self = this.set("VpnConnectionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnConnectionIds: Self = this.set("VpnConnectionIds", js.undefined)
  }
  
}

