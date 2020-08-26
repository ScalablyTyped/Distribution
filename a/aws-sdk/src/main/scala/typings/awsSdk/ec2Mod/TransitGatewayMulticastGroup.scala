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
  def apply(): TransitGatewayMulticastGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayMulticastGroup]
  }
  @scala.inline
  implicit class TransitGatewayMulticastGroupOps[Self <: TransitGatewayMulticastGroup] (val x: Self) extends AnyVal {
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
    def setGroupIpAddress(value: String): Self = this.set("GroupIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIpAddress: Self = this.set("GroupIpAddress", js.undefined)
    @scala.inline
    def setGroupMember(value: Boolean): Self = this.set("GroupMember", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupMember: Self = this.set("GroupMember", js.undefined)
    @scala.inline
    def setGroupSource(value: Boolean): Self = this.set("GroupSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSource: Self = this.set("GroupSource", js.undefined)
    @scala.inline
    def setMemberType(value: MembershipType): Self = this.set("MemberType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberType: Self = this.set("MemberType", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: TransitGatewayAttachmentResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setSourceType(value: MembershipType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = this.set("TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("TransitGatewayAttachmentId", js.undefined)
  }
  
}

