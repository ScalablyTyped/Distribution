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
  def apply(
    VpnGatewayIp: String = null,
    VpnId: String = null,
    VpnName: String = null,
    VpnPSK: StringSensitive = null,
    VpnState: String = null,
    VpnTunnelOriginatorIP: String = null
  ): VpnDetails = {
    val __obj = js.Dynamic.literal()
    if (VpnGatewayIp != null) __obj.updateDynamic("VpnGatewayIp")(VpnGatewayIp.asInstanceOf[js.Any])
    if (VpnId != null) __obj.updateDynamic("VpnId")(VpnId.asInstanceOf[js.Any])
    if (VpnName != null) __obj.updateDynamic("VpnName")(VpnName.asInstanceOf[js.Any])
    if (VpnPSK != null) __obj.updateDynamic("VpnPSK")(VpnPSK.asInstanceOf[js.Any])
    if (VpnState != null) __obj.updateDynamic("VpnState")(VpnState.asInstanceOf[js.Any])
    if (VpnTunnelOriginatorIP != null) __obj.updateDynamic("VpnTunnelOriginatorIP")(VpnTunnelOriginatorIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnDetails]
  }
}

