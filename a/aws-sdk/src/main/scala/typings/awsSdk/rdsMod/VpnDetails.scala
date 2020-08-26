package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnDetails extends js.Object {
  /**
    * The IP address of network traffic from AWS to your on-premises data center.
    */
  var VpnGatewayIp: js.UndefOr[String] = js.native
  /**
    * The ID of the VPN.
    */
  var VpnId: js.UndefOr[String] = js.native
  /**
    * The name of the VPN.
    */
  var VpnName: js.UndefOr[String] = js.native
  /**
    * The preshared key (PSK) for the VPN.
    */
  var VpnPSK: js.UndefOr[StringSensitive] = js.native
  /**
    * The state of the VPN.
    */
  var VpnState: js.UndefOr[String] = js.native
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.native
}

object VpnDetails {
  @scala.inline
  def apply(): VpnDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnDetails]
  }
  @scala.inline
  implicit class VpnDetailsOps[Self <: VpnDetails] (val x: Self) extends AnyVal {
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
    def setVpnGatewayIp(value: String): Self = this.set("VpnGatewayIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGatewayIp: Self = this.set("VpnGatewayIp", js.undefined)
    @scala.inline
    def setVpnId(value: String): Self = this.set("VpnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnId: Self = this.set("VpnId", js.undefined)
    @scala.inline
    def setVpnName(value: String): Self = this.set("VpnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnName: Self = this.set("VpnName", js.undefined)
    @scala.inline
    def setVpnPSK(value: StringSensitive): Self = this.set("VpnPSK", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnPSK: Self = this.set("VpnPSK", js.undefined)
    @scala.inline
    def setVpnState(value: String): Self = this.set("VpnState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnState: Self = this.set("VpnState", js.undefined)
    @scala.inline
    def setVpnTunnelOriginatorIP(value: String): Self = this.set("VpnTunnelOriginatorIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnTunnelOriginatorIP: Self = this.set("VpnTunnelOriginatorIP", js.undefined)
  }
  
}

