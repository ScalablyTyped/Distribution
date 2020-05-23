package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastGroup extends js.Object {
  /**
    * The IP address assigned to the transit gateway multicast group.
    */
  var GroupIpAddress: js.UndefOr[String] = js.native
  /**
    * Indicates that the resource is a transit gateway multicast group member.
    */
  var GroupMember: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the resource is a transit gateway multicast group member.
    */
  var GroupSource: js.UndefOr[Boolean] = js.native
  /**
    * The member type (for example, static).
    */
  var MemberType: js.UndefOr[MembershipType] = js.native
  /**
    * The ID of the transit gateway attachment.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The type of resource, for example a VPC attachment.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.native
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[MembershipType] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastGroup {
  @scala.inline
  def apply(
    GroupIpAddress: String = null,
    GroupMember: js.UndefOr[Boolean] = js.undefined,
    GroupSource: js.UndefOr[Boolean] = js.undefined,
    MemberType: MembershipType = null,
    NetworkInterfaceId: String = null,
    ResourceId: String = null,
    ResourceType: TransitGatewayAttachmentResourceType = null,
    SourceType: MembershipType = null,
    SubnetId: String = null,
    TransitGatewayAttachmentId: String = null
  ): TransitGatewayMulticastGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupIpAddress != null) __obj.updateDynamic("GroupIpAddress")(GroupIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(GroupMember)) __obj.updateDynamic("GroupMember")(GroupMember.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GroupSource)) __obj.updateDynamic("GroupSource")(GroupSource.get.asInstanceOf[js.Any])
    if (MemberType != null) __obj.updateDynamic("MemberType")(MemberType.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayMulticastGroup]
  }
}

