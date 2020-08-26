package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLogEvent extends js.Object {
  /**
    * The raw event message.
    */
  var message: EventMessage = js.native
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: Timestamp = js.native
}

object InputLogEvent {
  @scala.inline
  def apply(message: EventMessage, timestamp: Timestamp): InputLogEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLogEvent]
  }
  @scala.inline
  implicit class InputLogEventOps[Self <: InputLogEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: EventMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

