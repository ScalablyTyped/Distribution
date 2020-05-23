package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDeviceNetworkSettings extends js.Object {
  /**
    * The DNS addresses of the input device.
    */
  var DnsAddresses: js.UndefOr[listOfString] = js.native
  /**
    * The network gateway IP address.
    */
  var Gateway: js.UndefOr[string] = js.native
  /**
    * The IP address of the input device.
    */
  var IpAddress: js.UndefOr[string] = js.native
  /**
    * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address assignment (DHCP) or a static IP address.
    */
  var IpScheme: js.UndefOr[InputDeviceIpScheme] = js.native
  /**
    * The subnet mask of the input device.
    */
  var SubnetMask: js.UndefOr[string] = js.native
}

object InputDeviceNetworkSettings {
  @scala.inline
  def apply(
    DnsAddresses: listOfString = null,
    Gateway: string = null,
    IpAddress: string = null,
    IpScheme: InputDeviceIpScheme = null,
    SubnetMask: string = null
  ): InputDeviceNetworkSettings = {
    val __obj = js.Dynamic.literal()
    if (DnsAddresses != null) __obj.updateDynamic("DnsAddresses")(DnsAddresses.asInstanceOf[js.Any])
    if (Gateway != null) __obj.updateDynamic("Gateway")(Gateway.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (IpScheme != null) __obj.updateDynamic("IpScheme")(IpScheme.asInstanceOf[js.Any])
    if (SubnetMask != null) __obj.updateDynamic("SubnetMask")(SubnetMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDeviceNetworkSettings]
  }
}

