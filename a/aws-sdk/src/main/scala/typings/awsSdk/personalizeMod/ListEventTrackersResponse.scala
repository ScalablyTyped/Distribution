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
  def apply(eventTrackers: EventTrackers = null, nextToken: NextToken = null): ListEventTrackersResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTrackers != null) __obj.updateDynamic("eventTrackers")(eventTrackers.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTrackersResponse]
  }
}

