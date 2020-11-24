package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignPrivateIpAddressesRequest extends js.Object {
  
  /**
    * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be reassigned to the specified network interface.
    */
  var AllowReassignment: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  
  /**
    * One or more IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify this parameter when also specifying a number of secondary IP addresses. If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.native
  
  /**
    * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when also specifying private IP addresses.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
}
object AssignPrivateIpAddressesRequest {
  
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId): AssignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignPrivateIpAddressesRequest]
  }
  
  @scala.inline
  implicit class AssignPrivateIpAddressesRequestOps[Self <: AssignPrivateIpAddressesRequest] (val x: Self) extends AnyVal {
    
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
    def setAllowReassignment(value: Boolean): Self = this.set("AllowReassignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReassignment: Self = this.set("AllowReassignment", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: String*): Self = this.set("PrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = this.set("PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddresses: Self = this.set("PrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setSecondaryPrivateIpAddressCount(value: Integer): Self = this.set("SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryPrivateIpAddressCount: Self = this.set("SecondaryPrivateIpAddressCount", js.undefined)
  }
}
