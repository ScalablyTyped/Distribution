package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayMulticastGroup extends StObject {
  
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
  implicit class TransitGatewayMulticastGroupMutableBuilder[Self <: TransitGatewayMulticastGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupIpAddress(value: String): Self = StObject.set(x, "GroupIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIpAddressUndefined: Self = StObject.set(x, "GroupIpAddress", js.undefined)
    
    @scala.inline
    def setGroupMember(value: Boolean): Self = StObject.set(x, "GroupMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMemberUndefined: Self = StObject.set(x, "GroupMember", js.undefined)
    
    @scala.inline
    def setGroupSource(value: Boolean): Self = StObject.set(x, "GroupSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSourceUndefined: Self = StObject.set(x, "GroupSource", js.undefined)
    
    @scala.inline
    def setMemberType(value: MembershipType): Self = StObject.set(x, "MemberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypeUndefined: Self = StObject.set(x, "MemberType", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSourceType(value: MembershipType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
