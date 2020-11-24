package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayPeeringAttachment extends js.Object {
  
  /**
    * Information about the accepter transit gateway.
    */
  var AccepterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  
  /**
    * The time the transit gateway peering attachment was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Information about the requester transit gateway.
    */
  var RequesterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  
  /**
    * The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  
  /**
    * The status of the transit gateway peering attachment.
    */
  var Status: js.UndefOr[PeeringAttachmentStatus] = js.native
  
  /**
    * The tags for the transit gateway peering attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
}
object TransitGatewayPeeringAttachment {
  
  @scala.inline
  def apply(): TransitGatewayPeeringAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPeeringAttachment]
  }
  
  @scala.inline
  implicit class TransitGatewayPeeringAttachmentOps[Self <: TransitGatewayPeeringAttachment] (val x: Self) extends AnyVal {
    
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
    def setAccepterTgwInfo(value: PeeringTgwInfo): Self = this.set("AccepterTgwInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccepterTgwInfo: Self = this.set("AccepterTgwInfo", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setRequesterTgwInfo(value: PeeringTgwInfo): Self = this.set("RequesterTgwInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterTgwInfo: Self = this.set("RequesterTgwInfo", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayAttachmentState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStatus(value: PeeringAttachmentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
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
  }
}
