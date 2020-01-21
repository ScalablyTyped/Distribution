package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptHandshakeResponse extends js.Object {
  /**
    * A structure that contains details about the accepted handshake.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.native
}

object AcceptHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): AcceptHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptHandshakeResponse]
  }
}

