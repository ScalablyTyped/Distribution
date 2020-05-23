package typings.cometd.mod

import typings.cometd.anon.Hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMessage extends Message {
  var advice: js.UndefOr[Hosts] = js.undefined
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
    advice: Hosts = null,
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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    if (advice != null) __obj.updateDynamic("advice")(advice.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMessage]
  }
}

