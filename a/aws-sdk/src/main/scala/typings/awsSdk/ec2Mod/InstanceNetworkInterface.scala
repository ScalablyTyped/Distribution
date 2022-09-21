package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceNetworkInterface extends StObject {
  
  /**
    * The association information for an Elastic IPv4 associated with the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined
  
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment] = js.undefined
  
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * One or more security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  
  /**
    * The type of network interface. Valid values: interface | efa | trunk 
    */
  var InterfaceType: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 delegated prefixes that are assigned to the network interface.
    */
  var Ipv4Prefixes: js.UndefOr[InstanceIpv4PrefixList] = js.undefined
  
  /**
    * One or more IPv6 addresses associated with the network interface.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  
  /**
    * The IPv6 delegated prefixes that are assigned to the network interface.
    */
  var Ipv6Prefixes: js.UndefOr[InstanceIpv6PrefixList] = js.undefined
  
  /**
    * The MAC address.
    */
  var MacAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that created the network interface.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * One or more private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList] = js.undefined
  
  /**
    * Indicates whether source/destination checking is enabled.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of the network interface.
    */
  var Status: js.UndefOr[NetworkInterfaceStatus] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object InstanceNetworkInterface {
  
  inline def apply(): InstanceNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterface]
  }
  
  extension [Self <: InstanceNetworkInterface](x: Self) {
    
    inline def setAssociation(value: InstanceNetworkInterfaceAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
    
    inline def setAttachment(value: InstanceNetworkInterfaceAttachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInterfaceType(value: String): Self = StObject.set(x, "InterfaceType", value.asInstanceOf[js.Any])
    
    inline def setInterfaceTypeUndefined: Self = StObject.set(x, "InterfaceType", js.undefined)
    
    inline def setIpv4Prefixes(value: InstanceIpv4PrefixList): Self = StObject.set(x, "Ipv4Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixesUndefined: Self = StObject.set(x, "Ipv4Prefixes", js.undefined)
    
    inline def setIpv4PrefixesVarargs(value: InstanceIpv4Prefix*): Self = StObject.set(x, "Ipv4Prefixes", js.Array(value*))
    
    inline def setIpv6Addresses(value: InstanceIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value*))
    
    inline def setIpv6Prefixes(value: InstanceIpv6PrefixList): Self = StObject.set(x, "Ipv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixesUndefined: Self = StObject.set(x, "Ipv6Prefixes", js.undefined)
    
    inline def setIpv6PrefixesVarargs(value: InstanceIpv6Prefix*): Self = StObject.set(x, "Ipv6Prefixes", js.Array(value*))
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPrivateIpAddresses(value: InstancePrivateIpAddressList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: InstancePrivateIpAddress*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
    
    inline def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
    
    inline def setStatus(value: NetworkInterfaceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
