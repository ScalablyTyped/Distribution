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
  @scala.inline
  implicit class UnassignPrivateIpAddressesRequestOps[Self <: UnassignPrivateIpAddressesRequest] (val x: Self) extends AnyVal {
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
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIpAddressesVarargs(value: String*): Self = this.set("PrivateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = this.set("PrivateIpAddresses", value.asInstanceOf[js.Any])
  }
  
}

