package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnassignPrivateIpAddressesRequest extends js.Object {
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  /**
    * The secondary private IP addresses to unassign from the network interface. You can specify this option multiple times to unassign more than one IP address.
    */
  var PrivateIpAddresses: PrivateIpAddressStringList = js.native
}

object UnassignPrivateIpAddressesRequest {
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId, PrivateIpAddresses: PrivateIpAddressStringList): UnassignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], PrivateIpAddresses = PrivateIpAddresses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnassignPrivateIpAddressesRequest]
  }
}

