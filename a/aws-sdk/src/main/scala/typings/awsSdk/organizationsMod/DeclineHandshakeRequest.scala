package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineHandshakeRequest extends js.Object {
  /**
    * The unique identifier (ID) of the handshake that you want to decline. You can get the ID from the ListHandshakesForAccount operation. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typings.awsSdk.organizationsMod.HandshakeId = js.native
}

object DeclineHandshakeRequest {
  @scala.inline
  def apply(HandshakeId: HandshakeId): DeclineHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeclineHandshakeRequest]
  }
}

