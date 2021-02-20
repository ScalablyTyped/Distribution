package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
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
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    @scala.inline
    def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
    
    @scala.inline
    def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
    
    @scala.inline
    def setType(value: ChatItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
