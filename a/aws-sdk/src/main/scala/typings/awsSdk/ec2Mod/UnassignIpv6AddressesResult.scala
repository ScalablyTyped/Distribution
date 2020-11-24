package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnassignIpv6AddressesResult extends js.Object {
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 addresses that have been unassigned from the network interface.
    */
  var UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.native
}
object UnassignIpv6AddressesResult {
  
  @scala.inline
  def apply(): UnassignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnassignIpv6AddressesResult]
  }
  
  @scala.inline
  implicit class UnassignIpv6AddressesResultOps[Self <: UnassignIpv6AddressesResult] (val x: Self) extends AnyVal {
    
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
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setUnassignedIpv6AddressesVarargs(value: String*): Self = this.set("UnassignedIpv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setUnassignedIpv6Addresses(value: Ipv6AddressList): Self = this.set("UnassignedIpv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnassignedIpv6Addresses: Self = this.set("UnassignedIpv6Addresses", js.undefined)
  }
}
