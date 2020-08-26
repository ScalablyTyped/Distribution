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
  def apply(): FlowExecutionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowExecutionMessage]
  }
  @scala.inline
  implicit class FlowExecutionMessageOps[Self <: FlowExecutionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventType(value: FlowExecutionEventType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    @scala.inline
    def setMessageId(value: FlowExecutionMessageId): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setPayload(value: FlowExecutionMessagePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

