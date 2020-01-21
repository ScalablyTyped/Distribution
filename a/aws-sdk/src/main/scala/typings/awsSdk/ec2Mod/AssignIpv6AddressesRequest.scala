package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignIpv6AddressesRequest extends js.Object {
  /**
    * The number of IPv6 addresses to assign to the network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're specifying a number of IPv6 addresses.
    */
  var Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
}

object AssignIpv6AddressesRequest {
  @scala.inline
  def apply(
    NetworkInterfaceId: NetworkInterfaceId,
    Ipv6AddressCount: Int | scala.Double = null,
    Ipv6Addresses: Ipv6AddressList = null
  ): AssignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    if (Ipv6AddressCount != null) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignIpv6AddressesRequest]
  }
}

