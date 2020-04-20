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
}

