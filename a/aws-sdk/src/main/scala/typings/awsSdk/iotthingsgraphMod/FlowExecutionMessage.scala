package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowExecutionMessage extends js.Object {
  /**
    * The type of flow event .
    */
  var eventType: js.UndefOr[FlowExecutionEventType] = js.native
  /**
    * The unique identifier of the message.
    */
  var messageId: js.UndefOr[FlowExecutionMessageId] = js.native
  /**
    * A string containing information about the flow event.
    */
  var payload: js.UndefOr[FlowExecutionMessagePayload] = js.native
  /**
    * The date and time when the message was last updated.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}

object FlowExecutionMessage {
  @scala.inline
  def apply(
    eventType: FlowExecutionEventType = null,
    messageId: FlowExecutionMessageId = null,
    payload: FlowExecutionMessagePayload = null,
    timestamp: Timestamp = null
  ): FlowExecutionMessage = {
    val __obj = js.Dynamic.literal()
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowExecutionMessage]
  }
}

