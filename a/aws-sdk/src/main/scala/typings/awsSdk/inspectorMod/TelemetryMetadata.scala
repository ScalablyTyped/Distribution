package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryMetadata extends js.Object {
  /**
    * The count of messages that the agent sends to the Amazon Inspector service.
    */
  var count: Long = js.native
  /**
    * The data size of messages that the agent sends to the Amazon Inspector service.
    */
  var dataSize: js.UndefOr[Long] = js.native
  /**
    * A specific type of behavioral data that is collected by the agent.
    */
  var messageType: MessageType = js.native
}

object TelemetryMetadata {
  @scala.inline
  def apply(count: Long, messageType: MessageType, dataSize: Int | Double = null): TelemetryMetadata = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    if (dataSize != null) __obj.updateDynamic("dataSize")(dataSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryMetadata]
  }
}

