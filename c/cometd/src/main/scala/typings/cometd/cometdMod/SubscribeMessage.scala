package typings.cometd.cometdMod

import typings.cometd.Anon_Hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cometd.cometdMod.Message because Already inherited */ trait SubscribeMessage extends BaseMessage {
  var subscription: String
}

object SubscribeMessage {
  @scala.inline
  def apply(
    channel: String,
    subscription: String,
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
  ): SubscribeMessage = {
    val __obj = js.Dynamic.literal(channel = channel, subscription = subscription, successful = successful)
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
    __obj.asInstanceOf[SubscribeMessage]
  }
}

