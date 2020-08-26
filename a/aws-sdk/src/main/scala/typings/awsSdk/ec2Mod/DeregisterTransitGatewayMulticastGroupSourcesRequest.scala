package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayMulticastGroupSourcesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The IDs of the group sources' network interfaces.
    */
  var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId] = js.native
}

object DeregisterTransitGatewayMulticastGroupSourcesRequest {
  @scala.inline
  def apply(): DeregisterTransitGatewayMulticastGroupSourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupSourcesRequest]
  }
  @scala.inline
  implicit class DeregisterTransitGatewayMulticastGroupSourcesRequestOps[Self <: DeregisterTransitGatewayMulticastGroupSourcesRequest] (val x: Self) extends AnyVal {
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
    def setGroupIpAddress(value: String): Self = this.set("GroupIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIpAddress: Self = this.set("GroupIpAddress", js.undefined)
    @scala.inline
    def setNetworkInterfaceIdsVarargs(value: NetworkInterfaceId*): Self = this.set("NetworkInterfaceIds", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaceIds(value: TransitGatewayNetworkInterfaceIdList): Self = this.set("NetworkInterfaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceIds: Self = this.set("NetworkInterfaceIds", js.undefined)
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = this.set("TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayMulticastDomainId: Self = this.set("TransitGatewayMulticastDomainId", js.undefined)
  }
  
}

