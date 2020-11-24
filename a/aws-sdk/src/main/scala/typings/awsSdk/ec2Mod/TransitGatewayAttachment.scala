package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayAttachment extends js.Object {
  
  /**
    * The association.
    */
  var Association: js.UndefOr[TransitGatewayAttachmentAssociation] = js.native
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The resource type. Note that the tgw-peering resource type has been deprecated.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.native
  
  /**
    * The attachment state. Note that the initiating state has been deprecated.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  
  /**
    * The tags for the attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the transit gateway.
    */
  var TransitGatewayOwnerId: js.UndefOr[String] = js.native
}
object TransitGatewayAttachment {
  
  @scala.inline
  def apply(): TransitGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayAttachment]
  }
  
  @scala.inline
  implicit class TransitGatewayAttachmentOps[Self <: TransitGatewayAttachment] (val x: Self) extends AnyVal {
    
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
    def setAssociation(value: TransitGatewayAttachmentAssociation): Self = this.set("Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("Association", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceOwnerId(value: String): Self = this.set("ResourceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOwnerId: Self = this.set("ResourceOwnerId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TransitGatewayAttachmentResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayAttachmentState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = this.set("TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("TransitGatewayAttachmentId", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
    
    @scala.inline
    def setTransitGatewayOwnerId(value: String): Self = this.set("TransitGatewayOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayOwnerId: Self = this.set("TransitGatewayOwnerId", js.undefined)
  }
}
