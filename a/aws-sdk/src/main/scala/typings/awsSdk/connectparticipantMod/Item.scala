package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  /**
    * The time when the message or event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.undefined
  
  /**
    * Provides information about the attachments.
    */
  var Attachments: js.UndefOr[typings.awsSdk.connectparticipantMod.Attachments] = js.undefined
  
  /**
    * The content of the message or event.
    */
  var Content: js.UndefOr[ChatContent] = js.undefined
  
  /**
    * The type of content of the item.
    */
  var ContentType: js.UndefOr[ChatContentType] = js.undefined
  
  /**
    * The chat display name of the sender.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.connectparticipantMod.DisplayName] = js.undefined
  
  /**
    * The ID of the item.
    */
  var Id: js.UndefOr[ChatItemId] = js.undefined
  
  /**
    * The ID of the sender in the session.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.connectparticipantMod.ParticipantId] = js.undefined
  
  /**
    * The role of the sender. For example, is it a customer, agent, or system.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.connectparticipantMod.ParticipantRole] = js.undefined
  
  /**
    * Type of the item: message or event. 
    */
  var Type: js.UndefOr[ChatItemType] = js.undefined
}
object Item {
  
  inline def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AttachmentItem*): Self = StObject.set(x, "Attachments", js.Array(value*))
    
    inline def setContent(value: ChatContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: ChatContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
    
    inline def setType(value: ChatItemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
