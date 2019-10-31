package typings.cometd.cometdMod

import typings.cometd.Anon_Hosts
import typings.cometd.cometdNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessfulHandshakeMessage
  extends BaseMessage
     with HandshakeMessage {
  var authSuccessful: js.UndefOr[`true`] = js.undefined
  @JSName("clientId")
  var clientId_SuccessfulHandshakeMessage: String
  var reestablish: Boolean
  @JSName("successful")
  var successful_SuccessfulHandshakeMessage: `true`
  var supportedConnectionTypes: js.Array[ConnectionType]
  @JSName("version")
  var version_SuccessfulHandshakeMessage: String
}

object SuccessfulHandshakeMessage {
  @scala.inline
  def apply(
    channel: String,
    clientId: String,
    reestablish: Boolean,
    successful: `true`,
    supportedConnectionTypes: js.Array[ConnectionType],
    version: String,
    advice: Anon_Hosts = null,
    authSuccessful: `true` = null,
    connectionType: ConnectionType = null,
    data: js.Any = null,
    error: String = null,
    ext: js.Any = null,
    id: String = null,
    minimumVersion: String = null,
    timestamp: String = null
  ): SuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel, clientId = clientId, reestablish = reestablish, successful = successful, supportedConnectionTypes = supportedConnectionTypes, version = version)
    if (advice != null) __obj.updateDynamic("advice")(advice)
    if (authSuccessful != null) __obj.updateDynamic("authSuccessful")(authSuccessful)
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (id != null) __obj.updateDynamic("id")(id)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[SuccessfulHandshakeMessage]
  }
}

