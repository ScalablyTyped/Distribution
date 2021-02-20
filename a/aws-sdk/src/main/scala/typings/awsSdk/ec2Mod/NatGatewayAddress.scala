package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NatGatewayAddress extends StObject {
  
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
  implicit class NatGatewayAddressMutableBuilder[Self <: NatGatewayAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = StObject.set(x, "PrivateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpUndefined: Self = StObject.set(x, "PrivateIp", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
