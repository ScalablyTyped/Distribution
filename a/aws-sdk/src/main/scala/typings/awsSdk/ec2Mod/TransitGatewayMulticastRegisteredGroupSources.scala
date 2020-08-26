package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastRegisteredGroupSources extends js.Object {
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * The IDs of the network interfaces members registered with the transit gateway multicast group.
    */
  var RegisteredNetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastRegisteredGroupSources {
  @scala.inline
  def apply(): TransitGatewayMulticastRegisteredGroupSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastRegisteredGroupSources]
  }
  @scala.inline
  implicit class TransitGatewayMulticastRegisteredGroupSourcesOps[Self <: TransitGatewayMulticastRegisteredGroupSources] (val x: Self) extends AnyVal {
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
    def setGroupIpAddress(value: String): Self = this.set("GroupIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIpAddress: Self = this.set("GroupIpAddress", js.undefined)
    @scala.inline
    def setRegisteredNetworkInterfaceIdsVarargs(value: String*): Self = this.set("RegisteredNetworkInterfaceIds", js.Array(value :_*))
    @scala.inline
    def setRegisteredNetworkInterfaceIds(value: ValueStringList): Self = this.set("RegisteredNetworkInterfaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredNetworkInterfaceIds: Self = this.set("RegisteredNetworkInterfaceIds", js.undefined)
    @scala.inline
    def setTransitGatewayMulticastDomainId(value: String): Self = this.set("TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayMulticastDomainId: Self = this.set("TransitGatewayMulticastDomainId", js.undefined)
  }
  
}

