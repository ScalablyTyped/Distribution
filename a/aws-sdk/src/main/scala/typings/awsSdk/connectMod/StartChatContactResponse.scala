package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChatContactResponse extends StObject {
  
  /**
    * The identifier of this contact within the Amazon Connect instance. 
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectMod.ContactId] = js.undefined
  
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.connectMod.ParticipantId] = js.undefined
  
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantToken: js.UndefOr[typings.awsSdk.connectMod.ParticipantToken] = js.undefined
}
object StartChatContactResponse {
  
  @scala.inline
  def apply(): StartChatContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChatContactResponse]
  }
  
  @scala.inline
  implicit class StartChatContactResponseMutableBuilder[Self <: StartChatContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    @scala.inline
    def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
    
    @scala.inline
    def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "ParticipantToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantTokenUndefined: Self = StObject.set(x, "ParticipantToken", js.undefined)
  }
}
