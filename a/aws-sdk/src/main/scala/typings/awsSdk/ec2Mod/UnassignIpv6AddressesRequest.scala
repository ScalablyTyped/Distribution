package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnassignIpv6AddressesRequest extends js.Object {
  
  /**
    * The IPv6 addresses to unassign from the network interface.
    */
  var Ipv6Addresses: Ipv6AddressList = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
}
object UnassignIpv6AddressesRequest {
  
  @scala.inline
  def apply(Ipv6Addresses: Ipv6AddressList, NetworkInterfaceId: NetworkInterfaceId): UnassignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(Ipv6Addresses = Ipv6Addresses.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignIpv6AddressesRequest]
  }
  
  @scala.inline
  implicit class UnassignIpv6AddressesRequestOps[Self <: UnassignIpv6AddressesRequest] (val x: Self) extends AnyVal {
    
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
    def setIpv6AddressesVarargs(value: String*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: Ipv6AddressList): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
  }
}
