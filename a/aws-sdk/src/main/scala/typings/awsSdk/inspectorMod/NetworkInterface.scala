package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterface extends StObject {
  
  /**
    * The IP addresses associated with the network interface.
    */
  var ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[Text] = js.undefined
  
  /**
    * The name of a private DNS associated with the network interface.
    */
  var privateDnsName: js.UndefOr[Text] = js.undefined
  
  /**
    * The private IP address associated with the network interface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.undefined
  
  /**
    * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and privateIpAddress.
    */
  var privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined
  
  /**
    * The name of a public DNS associated with the network interface.
    */
  var publicDnsName: js.UndefOr[Text] = js.undefined
  
  /**
    * The public IP address from which the network interface is reachable.
    */
  var publicIp: js.UndefOr[Text] = js.undefined
  
  /**
    * A list of the security groups associated with the network interface. Includes the groupId and groupName.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
  
  /**
    * The ID of a subnet associated with the network interface.
    */
  var subnetId: js.UndefOr[Text] = js.undefined
  
  /**
    * The ID of a VPC associated with the network interface.
    */
  var vpcId: js.UndefOr[Text] = js.undefined
}
object NetworkInterface {
  
  inline def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  extension [Self <: NetworkInterface](x: Self) {
    
    inline def setIpv6Addresses(value: Ipv6Addresses): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: Text*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
    
    inline def setNetworkInterfaceId(value: Text): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    inline def setPrivateDnsName(value: Text): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "privateDnsName", js.undefined)
    
    inline def setPrivateIpAddress(value: Text): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    inline def setPrivateIpAddresses(value: PrivateIpAddresses): Self = StObject.set(x, "privateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "privateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: PrivateIp*): Self = StObject.set(x, "privateIpAddresses", js.Array(value :_*))
    
    inline def setPublicDnsName(value: Text): Self = StObject.set(x, "publicDnsName", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsNameUndefined: Self = StObject.set(x, "publicDnsName", js.undefined)
    
    inline def setPublicIp(value: Text): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    inline def setSubnetId(value: Text): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    inline def setVpcId(value: Text): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
