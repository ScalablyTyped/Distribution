package typings.cometd.mod

import typings.cometd.cometdBooleans.`false`
import typings.cometd.cometdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cometd.mod.SuccessfulHandshakeMessage
  - typings.cometd.mod.UnsuccessfulHandshakeMessage
*/
trait HandshakeMessage extends Message

object HandshakeMessage {
  @scala.inline
  def SuccessfulHandshakeMessage(
    channel: String,
    clientId: String,
    reestablish: Boolean,
    successful: `true`,
    supportedConnectionTypes: js.Array[ConnectionType],
    version: String
  ): HandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeMessage]
  }
  @scala.inline
  def UnsuccessfulHandshakeMessage(channel: String, error: String, successful: `false`): HandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeMessage]
  }
}

