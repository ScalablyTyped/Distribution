package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface.
    */
  var Association: js.UndefOr[NetworkInterfaceAssociation] = js.native
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.native
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * A description.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Any security groups for the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The type of network interface.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceType] = js.native
  /**
    * The IPv6 addresses associated with the network interface.
    */
  var Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList] = js.native
  /**
    * The MAC address.
    */
  var MacAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the network interface.
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
    * The private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList] = js.native
  /**
    * The ID of the entity that launched the instance on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the network interface is being managed by AWS.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether traffic to or from the instance is validated.
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
    * Any tags assigned to the network interface.
    */
  var TagSet: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
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
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
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
    def setAssociation(value: NetworkInterfaceAssociation): Self = this.set("Association", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociation: Self = this.set("Association", js.undefined)
    @scala.inline
    def setAttachment(value: NetworkInterfaceAttachment): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("Attachment", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
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
    def setInterfaceType(value: NetworkInterfaceType): Self = this.set("InterfaceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceType: Self = this.set("InterfaceType", js.undefined)
    @scala.inline
    def setIpv6AddressesVarargs(value: NetworkInterfaceIpv6Address*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: NetworkInterfaceIpv6AddressesList): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
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
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
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
    def setPrivateIpAddressesVarargs(value: NetworkInterfacePrivateIpAddress*): Self = this.set("PrivateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setPrivateIpAddresses(value: NetworkInterfacePrivateIpAddressList): Self = this.set("PrivateIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddresses: Self = this.set("PrivateIpAddresses", js.undefined)
    @scala.inline
    def setRequesterId(value: String): Self = this.set("RequesterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterId: Self = this.set("RequesterId", js.undefined)
    @scala.inline
    def setRequesterManaged(value: Boolean): Self = this.set("RequesterManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterManaged: Self = this.set("RequesterManaged", js.undefined)
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
    def setTagSetVarargs(value: Tag*): Self = this.set("TagSet", js.Array(value :_*))
    @scala.inline
    def setTagSet(value: TagList): Self = this.set("TagSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSet: Self = this.set("TagSet", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

