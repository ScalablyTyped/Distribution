package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnConnectionRouteRequest extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer network.
    */
  var DestinationCidrBlock: String = js.native
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: typings.awsSdk.ec2Mod.VpnConnectionId = js.native
}

object CreateVpnConnectionRouteRequest {
  @scala.inline
  def apply(DestinationCidrBlock: String, VpnConnectionId: VpnConnectionId): CreateVpnConnectionRouteRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnConnectionRouteRequest]
  }
  @scala.inline
  implicit class CreateVpnConnectionRouteRequestOps[Self <: CreateVpnConnectionRouteRequest] (val x: Self) extends AnyVal {
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
    def setDestinationCidrBlock(value: String): Self = this.set("DestinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpnConnectionId(value: VpnConnectionId): Self = this.set("VpnConnectionId", value.asInstanceOf[js.Any])
  }
  
}

