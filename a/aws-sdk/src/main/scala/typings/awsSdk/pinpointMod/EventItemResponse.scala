package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventItemResponse extends js.Object {
  /**
    * A custom message that's returned in the response as a result of processing the event.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The status code that's returned in the response as a result of processing the event. Possible values are: 202, for events that were accepted; and, 400, for events that weren't valid.
    */
  var StatusCode: js.UndefOr[integer] = js.native
}

object EventItemResponse {
  @scala.inline
  def apply(): EventItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventItemResponse]
  }
  @scala.inline
  implicit class EventItemResponseOps[Self <: EventItemResponse] (val x: Self) extends AnyVal {
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
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setStatusCode(value: integer): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("StatusCode", js.undefined)
  }
  
}

