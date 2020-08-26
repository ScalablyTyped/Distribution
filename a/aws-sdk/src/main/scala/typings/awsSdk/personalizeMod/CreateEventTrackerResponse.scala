package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventTrackerResponse extends js.Object {
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.native
}

object CreateEventTrackerResponse {
  @scala.inline
  def apply(): CreateEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventTrackerResponse]
  }
  @scala.inline
  implicit class CreateEventTrackerResponseOps[Self <: CreateEventTrackerResponse] (val x: Self) extends AnyVal {
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
    def setEventTrackerArn(value: Arn): Self = this.set("eventTrackerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTrackerArn: Self = this.set("eventTrackerArn", js.undefined)
    @scala.inline
    def setTrackingId(value: TrackingId): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
  
}

