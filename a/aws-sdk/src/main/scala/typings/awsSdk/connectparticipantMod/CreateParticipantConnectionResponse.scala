package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParticipantConnectionResponse extends js.Object {
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
  implicit class CreateParticipantConnectionResponseOps[Self <: CreateParticipantConnectionResponse] (val x: Self) extends AnyVal {
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
    def setConnectionCredentials(value: ConnectionCredentials): Self = this.set("ConnectionCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionCredentials: Self = this.set("ConnectionCredentials", js.undefined)
    @scala.inline
    def setWebsocket(value: Websocket): Self = this.set("Websocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsocket: Self = this.set("Websocket", js.undefined)
  }
  
}

