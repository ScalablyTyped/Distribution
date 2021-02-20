package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends StObject {
  
  /**
    * The IP addresses associated with the network interface.
    */
  var ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.native
  
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[Text] = js.native
  
  /**
    * The name of a private DNS associated with the network interface.
    */
  var privateDnsName: js.UndefOr[Text] = js.native
  
  /**
    * The private IP address associated with the network interface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.native
  
  /**
    * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and privateIpAddress.
    */
  var privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.native
  
  /**
    * The name of a public DNS associated with the network interface.
    */
  var publicDnsName: js.UndefOr[Text] = js.native
  
  /**
    * The public IP address from which the network interface is reachable.
    */
  var publicIp: js.UndefOr[Text] = js.native
  
  /**
    * A list of the security groups associated with the network interface. Includes the groupId and groupName.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  
  /**
    * The ID of a subnet associated with the network interface.
    */
  var subnetId: js.UndefOr[Text] = js.native
  
  /**
    * The ID of a VPC associated with the network interface.
    */
  var vpcId: js.UndefOr[Text] = js.native
}
object NetworkInterface {
  
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  @scala.inline
  implicit class NetworkInterfaceMutableBuilder[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv6Addresses(value: Ipv6Addresses): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: Text*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: Text): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: Text): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "privateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: Text): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddresses): Self = StObject.set(x, "privateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressesUndefined: Self = StObject.set(x, "privateIpAddresses", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: PrivateIp*): Self = StObject.set(x, "privateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPublicDnsName(value: Text): Self = StObject.set(x, "publicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDnsNameUndefined: Self = StObject.set(x, "publicDnsName", js.undefined)
    
    @scala.inline
    def setPublicIp(value: Text): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: Text): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    @scala.inline
    def setVpcId(value: Text): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
