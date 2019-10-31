package typings.cometd.cometdMod

import typings.cometd.Anon_Hosts
import typings.cometd.cometdNumbers.`false`
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
  ): UnsuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel, error = error, successful = successful)
    if (advice != null) __obj.updateDynamic("advice")(advice)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (id != null) __obj.updateDynamic("id")(id)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    if (!js.isUndefined(reestablish)) __obj.updateDynamic("reestablish")(reestablish)
    if (supportedConnectionTypes != null) __obj.updateDynamic("supportedConnectionTypes")(supportedConnectionTypes)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UnsuccessfulHandshakeMessage]
  }
}

