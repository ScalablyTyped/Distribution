package typings.cometd.mod

import typings.cometd.anon.Hosts
import typings.cometd.cometdBooleans.`true`
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
    advice: Hosts = null,
    authSuccessful: `true` = null,
    connectionType: ConnectionType = null,
    data: js.Any = null,
    error: String = null,
    ext: js.Any = null,
    id: String = null,
    minimumVersion: String = null,
    timestamp: String = null
  ): SuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (advice != null) __obj.updateDynamic("advice")(advice.asInstanceOf[js.Any])
    if (authSuccessful != null) __obj.updateDynamic("authSuccessful")(authSuccessful.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulHandshakeMessage]
  }
}

