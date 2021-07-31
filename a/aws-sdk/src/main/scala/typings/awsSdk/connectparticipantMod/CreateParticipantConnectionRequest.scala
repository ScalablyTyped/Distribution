package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParticipantConnectionRequest extends StObject {
  
  /**
    * Participant Token as obtained from StartChatContact API response.
    */
  var ParticipantToken: typings.awsSdk.connectparticipantMod.ParticipantToken
  
  /**
    * Type of connection information required.
    */
  var Type: ConnectionTypeList
}
object CreateParticipantConnectionRequest {
  
  @scala.inline
  def apply(ParticipantToken: ParticipantToken, Type: ConnectionTypeList): CreateParticipantConnectionRequest = {
    val __obj = js.Dynamic.literal(ParticipantToken = ParticipantToken.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParticipantConnectionRequest]
  }
  
  @scala.inline
  implicit class CreateParticipantConnectionRequestMutableBuilder[Self <: CreateParticipantConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "ParticipantToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConnectionTypeList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: ConnectionType*): Self = StObject.set(x, "Type", js.Array(value :_*))
  }
}
