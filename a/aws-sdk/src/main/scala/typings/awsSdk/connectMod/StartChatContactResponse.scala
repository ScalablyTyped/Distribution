package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChatContactResponse extends js.Object {
  
  /**
    * The identifier of this contact within the Amazon Connect instance. 
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectMod.ContactId] = js.native
  
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.connectMod.ParticipantId] = js.native
  
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantToken: js.UndefOr[typings.awsSdk.connectMod.ParticipantToken] = js.native
}
object StartChatContactResponse {
  
  @scala.inline
  def apply(): StartChatContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChatContactResponse]
  }
  
  @scala.inline
  implicit class StartChatContactResponseOps[Self <: StartChatContactResponse] (val x: Self) extends AnyVal {
    
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
    def setContactId(value: ContactId): Self = this.set("ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactId: Self = this.set("ContactId", js.undefined)
    
    @scala.inline
    def setParticipantId(value: ParticipantId): Self = this.set("ParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantId: Self = this.set("ParticipantId", js.undefined)
    
    @scala.inline
    def setParticipantToken(value: ParticipantToken): Self = this.set("ParticipantToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipantToken: Self = this.set("ParticipantToken", js.undefined)
  }
}
