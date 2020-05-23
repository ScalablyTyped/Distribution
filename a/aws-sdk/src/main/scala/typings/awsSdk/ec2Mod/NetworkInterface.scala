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
  def apply(
    Association: NetworkInterfaceAssociation = null,
    Attachment: NetworkInterfaceAttachment = null,
    AvailabilityZone: String = null,
    Description: String = null,
    Groups: GroupIdentifierList = null,
    InterfaceType: NetworkInterfaceType = null,
    Ipv6Addresses: NetworkInterfaceIpv6AddressesList = null,
    MacAddress: String = null,
    NetworkInterfaceId: String = null,
    OutpostArn: String = null,
    OwnerId: String = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: NetworkInterfacePrivateIpAddressList = null,
    RequesterId: String = null,
    RequesterManaged: js.UndefOr[Boolean] = js.undefined,
    SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
    Status: NetworkInterfaceStatus = null,
    SubnetId: String = null,
    TagSet: TagList = null,
    VpcId: String = null
  ): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association.asInstanceOf[js.Any])
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses.asInstanceOf[js.Any])
    if (RequesterId != null) __obj.updateDynamic("RequesterId")(RequesterId.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterManaged)) __obj.updateDynamic("RequesterManaged")(RequesterManaged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SourceDestCheck)) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (TagSet != null) __obj.updateDynamic("TagSet")(TagSet.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterface]
  }
}

