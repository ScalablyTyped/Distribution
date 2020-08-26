package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignIpv6AddressesResult extends js.Object {
  /**
    * The IPv6 addresses assigned to the network interface.
    */
  var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}

object AssignIpv6AddressesResult {
  @scala.inline
  def apply(): AssignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignIpv6AddressesResult]
  }
  @scala.inline
  implicit class AssignIpv6AddressesResultOps[Self <: AssignIpv6AddressesResult] (val x: Self) extends AnyVal {
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
    def setAssignedIpv6AddressesVarargs(value: String*): Self = this.set("AssignedIpv6Addresses", js.Array(value :_*))
    @scala.inline
    def setAssignedIpv6Addresses(value: Ipv6AddressList): Self = this.set("AssignedIpv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedIpv6Addresses: Self = this.set("AssignedIpv6Addresses", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
  }
  
}

