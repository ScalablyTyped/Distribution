package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterface extends StObject {
  
  /**
    * A list of IPv6 addresses for the EC2 instance.
    */
  var Ipv6Addresses: js.UndefOr[typings.awsSdk.guarddutyMod.Ipv6Addresses] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * The private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  
  /**
    * Other private IP address information of the EC2 instance.
    */
  var PrivateIpAddresses: js.UndefOr[typings.awsSdk.guarddutyMod.PrivateIpAddresses] = js.native
  
  /**
    * The public DNS name of the EC2 instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  
  /**
    * The public IP address of the EC2 instance.
    */
  var PublicIp: js.UndefOr[String] = js.native
  
  /**
    * The security groups associated with the EC2 instance.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.guarddutyMod.SecurityGroups] = js.native
  
  /**
    * The subnet ID of the EC2 instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
  
  /**
    * The VPC ID of the EC2 instance.
    */
  var VpcId: js.UndefOr[String] = js.native
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
    def setIpv6Addresses(value: Ipv6Addresses): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddresses): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: PrivateIpAddressDetails*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPublicDnsName(value: String): Self = StObject.set(x, "PublicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDnsNameUndefined: Self = StObject.set(x, "PublicDnsName", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
