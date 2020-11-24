package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceNetworkInterface extends js.Object {
  
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
  implicit class InstanceNetworkInterfaceOps[Self <: InstanceNetworkInterface] (val x: Self) extends AnyVal {
    
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
    def setAssociation(value: InstanceNetworkInterfaceAssociation): Self = this.set("Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("Association", js.undefined)
    
    @scala.inline
    def setAttachment(value: InstanceNetworkInterfaceAttachment): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("Attachment", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupIdentifier*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setInterfaceType(value: String): Self = this.set("InterfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceType: Self = this.set("InterfaceType", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: InstanceIpv6AddressList): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("Ipv6Addresses", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: InstancePrivateIpAddress*): Self = this.set("PrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPrivateIpAddresses(value: InstancePrivateIpAddressList): Self = this.set("PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddresses: Self = this.set("PrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: Boolean): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
    
    @scala.inline
    def setStatus(value: NetworkInterfaceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
