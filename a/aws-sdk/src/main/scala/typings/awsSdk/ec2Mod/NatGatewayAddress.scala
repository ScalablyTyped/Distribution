package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NatGatewayAddress extends js.Object {
  
  /**
    * The allocation ID of the Elastic IP address that's associated with the NAT gateway.
    */
  var AllocationId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network interface associated with the NAT gateway.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * The private IP address associated with the Elastic IP address.
    */
  var PrivateIp: js.UndefOr[String] = js.native
  
  /**
    * The Elastic IP address associated with the NAT gateway.
    */
  var PublicIp: js.UndefOr[String] = js.native
}
object NatGatewayAddress {
  
  @scala.inline
  def apply(): NatGatewayAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NatGatewayAddress]
  }
  
  @scala.inline
  implicit class NatGatewayAddressOps[Self <: NatGatewayAddress] (val x: Self) extends AnyVal {
    
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
    def setAllocationId(value: String): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("PrivateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIp: Self = this.set("PrivateIp", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
  }
}
