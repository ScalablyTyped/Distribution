package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceNetworkInterface extends StObject {
  
  /**
    * The association information for an Elastic IPv4 associated with the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.native
  
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment] = js.native
  
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * One or more security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  
  /**
    * Describes the type of network interface. Valid values: interface | efa 
    */
  var InterfaceType: js.UndefOr[String] = js.native
  
  /**
    * One or more IPv6 addresses associated with the network interface.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  
  /**
    * The MAC address.
    */
  var MacAddress: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that created the network interface.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  
  /**
    * One or more private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList] = js.native
  
  /**
    * Indicates whether to validate network traffic to or from this network interface.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * The status of the network interface.
    */
  var Status: js.UndefOr[NetworkInterfaceStatus] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object InstanceNetworkInterface {
  
  @scala.inline
  def apply(): InstanceNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterface]
  }
  
  @scala.inline
  implicit class InstanceNetworkInterfaceMutableBuilder[Self <: InstanceNetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: InstanceNetworkInterfaceAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
    
    @scala.inline
    def setAttachment(value: InstanceNetworkInterfaceAttachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setInterfaceType(value: String): Self = StObject.set(x, "InterfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceTypeUndefined: Self = StObject.set(x, "InterfaceType", js.undefined)
    
    @scala.inline
    def setIpv6Addresses(value: InstanceIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIpAddresses(value: InstancePrivateIpAddressList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: InstancePrivateIpAddress*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
    
    @scala.inline
    def setStatus(value: NetworkInterfaceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
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
