package typings.cometd.cometdMod

import typings.cometd.Anon_Hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMessage extends Message {
  var advice: js.UndefOr[Anon_Hosts] = js.undefined
  var channel: String
  var clientId: js.UndefOr[String] = js.undefined
  var connectionType: js.UndefOr[ConnectionType] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var minimumVersion: js.UndefOr[String] = js.undefined
  var successful: Boolean
  var timestamp: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object BaseMessage {
  @scala.inline
  def apply(
    channel: String,
    successful: Boolean,
    advice: Anon_Hosts = null,
    clientId: String = null,
    connectionType: ConnectionType = null,
    data: js.Any = null,
    error: String = null,
    ext: js.Any = null,
    id: String = null,
    minimumVersion: String = null,
    timestamp: String = null,
    version: String = null
  ): BaseMessage = {
    val __obj = js.Dynamic.literal(channel = channel, successful = successful)
    if (advice != null) __obj.updateDynamic("advice")(advice)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (id != null) __obj.updateDynamic("id")(id)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BaseMessage]
  }
}

