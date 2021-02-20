package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParticipantConnectionResponse extends StObject {
  
  /**
    * Creates the participant's connection credentials. The authentication token associated with the participant's connection.
    */
  var ConnectionCredentials: js.UndefOr[typings.awsSdk.connectparticipantMod.ConnectionCredentials] = js.native
  
  /**
    * Creates the participant's websocket connection.
    */
  var Websocket: js.UndefOr[typings.awsSdk.connectparticipantMod.Websocket] = js.native
}
object CreateParticipantConnectionResponse {
  
  @scala.inline
  def apply(): CreateParticipantConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParticipantConnectionResponse]
  }
  
  @scala.inline
  implicit class CreateParticipantConnectionResponseMutableBuilder[Self <: CreateParticipantConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionCredentials(value: ConnectionCredentials): Self = StObject.set(x, "ConnectionCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionCredentialsUndefined: Self = StObject.set(x, "ConnectionCredentials", js.undefined)
    
    @scala.inline
    def setWebsocket(value: Websocket): Self = StObject.set(x, "Websocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocketUndefined: Self = StObject.set(x, "Websocket", js.undefined)
  }
}
