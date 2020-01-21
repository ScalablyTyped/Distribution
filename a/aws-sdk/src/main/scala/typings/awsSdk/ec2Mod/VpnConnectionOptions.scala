package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionOptions extends js.Object {
  /**
    * Indicates whether acceleration is enabled for the VPN connection.
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the VPN connection uses static routes only. Static routes must be used for devices that don't support BGP.
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the VPN tunnel options.
    */
  var TunnelOptions: js.UndefOr[TunnelOptionsList] = js.native
}

object VpnConnectionOptions {
  @scala.inline
  def apply(
    EnableAcceleration: js.UndefOr[scala.Boolean] = js.undefined,
    StaticRoutesOnly: js.UndefOr[scala.Boolean] = js.undefined,
    TunnelOptions: TunnelOptionsList = null
  ): VpnConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnableAcceleration)) __obj.updateDynamic("EnableAcceleration")(EnableAcceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(StaticRoutesOnly)) __obj.updateDynamic("StaticRoutesOnly")(StaticRoutesOnly.asInstanceOf[js.Any])
    if (TunnelOptions != null) __obj.updateDynamic("TunnelOptions")(TunnelOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionOptions]
  }
}

