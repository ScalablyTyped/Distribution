package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayAttachment extends StObject {
  
  /**
    * The association.
    */
  var Association: js.UndefOr[TransitGatewayAttachmentAssociation] = js.undefined
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type. Note that the tgw-peering resource type has been deprecated.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.undefined
  
  /**
    * The attachment state. Note that the initiating state has been deprecated.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.undefined
  
  /**
    * The tags for the attachment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the transit gateway.
    */
  var TransitGatewayOwnerId: js.UndefOr[String] = js.undefined
}
object TransitGatewayAttachment {
  
  @scala.inline
  def apply(): TransitGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachment]
  }
  
  @scala.inline
  implicit class TransitGatewayAttachmentMutableBuilder[Self <: TransitGatewayAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociation(value: TransitGatewayAttachmentAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TransitGatewayAttachmentResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayAttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    @scala.inline
    def setTransitGatewayOwnerId(value: String): Self = StObject.set(x, "TransitGatewayOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayOwnerIdUndefined: Self = StObject.set(x, "TransitGatewayOwnerId", js.undefined)
  }
}
