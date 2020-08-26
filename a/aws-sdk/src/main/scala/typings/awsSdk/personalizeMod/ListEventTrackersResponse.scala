package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTrackersResponse extends js.Object {
  /**
    * A list of event trackers.
    */
  var eventTrackers: js.UndefOr[EventTrackers] = js.native
  /**
    * A token for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListEventTrackersResponse {
  @scala.inline
  def apply(): ListEventTrackersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTrackersResponse]
  }
  @scala.inline
  implicit class ListEventTrackersResponseOps[Self <: ListEventTrackersResponse] (val x: Self) extends AnyVal {
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
    def setEventTrackersVarargs(value: EventTrackerSummary*): Self = this.set("eventTrackers", js.Array(value :_*))
    @scala.inline
    def setEventTrackers(value: EventTrackers): Self = this.set("eventTrackers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTrackers: Self = this.set("eventTrackers", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

