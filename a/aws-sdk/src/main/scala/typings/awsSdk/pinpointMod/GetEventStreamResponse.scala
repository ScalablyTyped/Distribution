package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventStreamResponse extends js.Object {
  var EventStream: typings.awsSdk.pinpointMod.EventStream = js.native
}

object GetEventStreamResponse {
  @scala.inline
  def apply(EventStream: EventStream): GetEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventStreamResponse]
  }
  @scala.inline
  implicit class GetEventStreamResponseOps[Self <: GetEventStreamResponse] (val x: Self) extends AnyVal {
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
    def setEventStream(value: EventStream): Self = this.set("EventStream", value.asInstanceOf[js.Any])
  }
  
}

