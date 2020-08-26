package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnEndpointStatus extends js.Object {
  /**
    * The state of the Client VPN endpoint. Possible states include:    pending-associate - The Client VPN endpoint has been created but no target networks have been associated. The Client VPN endpoint cannot accept connections.    available - The Client VPN endpoint has been created and a target network has been associated. The Client VPN endpoint can accept connections.    deleting - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept connections.    deleted - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept connections.  
    */
  var Code: js.UndefOr[ClientVpnEndpointStatusCode] = js.native
  /**
    * A message about the status of the Client VPN endpoint.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClientVpnEndpointStatus {
  @scala.inline
  def apply(): ClientVpnEndpointStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpointStatus]
  }
  @scala.inline
  implicit class ClientVpnEndpointStatusOps[Self <: ClientVpnEndpointStatus] (val x: Self) extends AnyVal {
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
    def setCode(value: ClientVpnEndpointStatusCode): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

