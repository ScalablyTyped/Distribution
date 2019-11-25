package typings.cometd.cometdMod

import typings.cometd.Anon_Hosts
import typings.cometd.cometdNumbers.`false`
import typings.cometd.cometdNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cometd.cometdMod.SuccessfulHandshakeMessage
  - typings.cometd.cometdMod.UnsuccessfulHandshakeMessage
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
  ): HandshakeMessage = {
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
    __obj.asInstanceOf[HandshakeMessage]
  }
  @scala.inline
  def UnsuccessfulHandshakeMessage(
    channel: String,
    error: String,
    successful: `false`,
    advice: Anon_Hosts = null,
    clientId: String = null,
    connectionType: ConnectionType = null,
    data: js.Any = null,
    ext: js.Any = null,
    id: String = null,
    minimumVersion: String = null,
    reestablish: js.UndefOr[scala.Nothing] = js.undefined,
    supportedConnectionTypes: js.Array[ConnectionType] = null,
    timestamp: String = null,
    version: String = null
  ): HandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    if (advice != null) __obj.updateDynamic("advice")(advice.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(reestablish)) __obj.updateDynamic("reestablish")(reestablish.asInstanceOf[js.Any])
    if (supportedConnectionTypes != null) __obj.updateDynamic("supportedConnectionTypes")(supportedConnectionTypes.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeMessage]
  }
}

