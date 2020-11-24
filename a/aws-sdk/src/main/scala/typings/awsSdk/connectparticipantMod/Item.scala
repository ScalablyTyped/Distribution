package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  /**
    * The time when the message or event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  
  /**
    * The content of the message or event.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  
  /**
    * The type of content of the item.
    */
  var ContentType: js.UndefOr[ChatContentType] = js.native
  
  /**
    * The chat display name of the sender.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.connectparticipantMod.DisplayName] = js.native
  
  /**
    * The ID of the item.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
  
  /**
    * The ID of the sender in the session.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.connectparticipantMod.ParticipantId] = js.native
  
  /**
    * The role of the sender. For example, is it a customer, agent, or system.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.connectparticipantMod.ParticipantRole] = js.native
  
  /**
    * Type of the item: message or event. 
    */
  var Type: js.UndefOr[ChatItemType] = js.native
}
object Item {
  
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbsoluteTime(value: Instant): Self = this.set("AbsoluteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsoluteTime: Self = this.set("AbsoluteTime", js.undefined)
    
    @scala.inline
    def setContent(value: ChatContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setContentType(value: ChatContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setId(value: ChatItemId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setParticipantId(value: ParticipantId): Self = this.set("ParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantId: Self = this.set("ParticipantId", js.undefined)
    
    @scala.inline
    def setParticipantRole(value: ParticipantRole): Self = this.set("ParticipantRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantRole: Self = this.set("ParticipantRole", js.undefined)
    
    @scala.inline
    def setType(value: ChatItemType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
