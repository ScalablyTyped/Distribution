package typings.cometd.mod

import typings.cometd.AnonHosts
import typings.cometd.cometdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsuccessfulHandshakeMessage
  extends BaseMessage
     with HandshakeMessage {
  @JSName("error")
  var error_UnsuccessfulHandshakeMessage: String
  var reestablish: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("successful")
  var successful_UnsuccessfulHandshakeMessage: `false`
  var supportedConnectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
}

object UnsuccessfulHandshakeMessage {
  @scala.inline
  def apply(
    channel: String,
    error: String,
    successful: `false`,
    advice: AnonHosts = null,
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
  ): UnsuccessfulHandshakeMessage = {
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
    __obj.asInstanceOf[UnsuccessfulHandshakeMessage]
  }
}

