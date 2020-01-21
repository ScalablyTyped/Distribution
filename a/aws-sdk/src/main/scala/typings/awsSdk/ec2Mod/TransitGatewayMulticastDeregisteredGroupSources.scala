package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastDeregisteredGroupSources extends js.Object {
  /**
    * The network interface IDs of the non-registered members.
    */
  var DeregisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastDeregisteredGroupSources {
  @scala.inline
  def apply(
    DeregisteredNetworkInterfaceIds: ValueStringList = null,
    GroupIpAddress: String = null,
    TransitGatewayMulticastDomainId: String = null
  ): TransitGatewayMulticastDeregisteredGroupSources = {
    val __obj = js.Dynamic.literal()
    if (DeregisteredNetworkInterfaceIds != null) __obj.updateDynamic("DeregisteredNetworkInterfaceIds")(DeregisteredNetworkInterfaceIds.asInstanceOf[js.Any])
    if (GroupIpAddress != null) __obj.updateDynamic("GroupIpAddress")(GroupIpAddress.asInstanceOf[js.Any])
    if (TransitGatewayMulticastDomainId != null) __obj.updateDynamic("TransitGatewayMulticastDomainId")(TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayMulticastDeregisteredGroupSources]
  }
}

