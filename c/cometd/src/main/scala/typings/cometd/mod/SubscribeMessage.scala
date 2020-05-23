package typings.cometd.mod

import typings.cometd.anon.Hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cometd.mod.Message because Already inherited */ trait SubscribeMessage extends BaseMessage {
  var subscription: String
}

object SubscribeMessage {
  @scala.inline
  def apply(
    channel: String,
    subscription: String,
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
  ): SubscribeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[SubscribeMessage]
  }
}

