package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParticipantConnectionRequest extends js.Object {
  
  /**
    * Participant Token as obtained from StartChatContact API response.
    */
  var ParticipantToken: typings.awsSdk.connectparticipantMod.ParticipantToken = js.native
  
  /**
    * Type of connection information required.
    */
  var Type: ConnectionTypeList = js.native
}
object CreateParticipantConnectionRequest {
  
  @scala.inline
  def apply(ParticipantToken: ParticipantToken, Type: ConnectionTypeList): CreateParticipantConnectionRequest = {
    val __obj = js.Dynamic.literal(ParticipantToken = ParticipantToken.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParticipantConnectionRequest]
  }
  
  @scala.inline
  implicit class CreateParticipantConnectionRequestOps[Self <: CreateParticipantConnectionRequest] (val x: Self) extends AnyVal {
    
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
    def setParticipantToken(value: ParticipantToken): Self = this.set("ParticipantToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: ConnectionType*): Self = this.set("Type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ConnectionTypeList): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
