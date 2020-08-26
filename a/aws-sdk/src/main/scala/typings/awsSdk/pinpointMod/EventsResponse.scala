package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResponse extends js.Object {
  /**
    * A map that contains a multipart response for each endpoint. For each item in this object, the endpoint ID is the key and the item response is the value. If no item response exists, the value can also be one of the following: 202, the request was processed successfully; or 400, the payload wasn't valid or required fields were missing.
    */
  var Results: js.UndefOr[MapOfItemResponse] = js.native
}

object EventsResponse {
  @scala.inline
  def apply(): EventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsResponse]
  }
  @scala.inline
  implicit class EventsResponseOps[Self <: EventsResponse] (val x: Self) extends AnyVal {
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
    def setResults(value: MapOfItemResponse): Self = this.set("Results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
  
}

