package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTrackerResponse extends js.Object {
  /**
    * An object that describes the event tracker.
    */
  var eventTracker: js.UndefOr[EventTracker] = js.native
}

object DescribeEventTrackerResponse {
  @scala.inline
  def apply(): DescribeEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTrackerResponse]
  }
  @scala.inline
  implicit class DescribeEventTrackerResponseOps[Self <: DescribeEventTrackerResponse] (val x: Self) extends AnyVal {
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
    def setEventTracker(value: EventTracker): Self = this.set("eventTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTracker: Self = this.set("eventTracker", js.undefined)
  }
  
}

