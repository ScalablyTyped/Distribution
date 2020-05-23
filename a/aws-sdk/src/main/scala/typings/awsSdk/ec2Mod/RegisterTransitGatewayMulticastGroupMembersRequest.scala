package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayMulticastGroupMembersRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The group members' network interface IDs to register with the transit gateway multicast group.
    */
  var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomainId] = js.native
}

object RegisterTransitGatewayMulticastGroupMembersRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    GroupIpAddress: String = null,
    NetworkInterfaceIds: TransitGatewayNetworkInterfaceIdList = null,
    TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId = null
  ): RegisterTransitGatewayMulticastGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (GroupIpAddress != null) __obj.updateDynamic("GroupIpAddress")(GroupIpAddress.asInstanceOf[js.Any])
    if (NetworkInterfaceIds != null) __obj.updateDynamic("NetworkInterfaceIds")(NetworkInterfaceIds.asInstanceOf[js.Any])
    if (TransitGatewayMulticastDomainId != null) __obj.updateDynamic("TransitGatewayMulticastDomainId")(TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupMembersRequest]
  }
}

