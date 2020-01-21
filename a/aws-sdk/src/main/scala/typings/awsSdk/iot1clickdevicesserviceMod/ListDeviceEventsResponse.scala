package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceEventsResponse extends js.Object {
  /**
    * An array of zero or more elements describing the event(s) associated with the
    device.
    */
  var Events: js.UndefOr[listOfDeviceEvent] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDeviceEventsResponse {
  @scala.inline
  def apply(Events: listOfDeviceEvent = null, NextToken: string = null): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
}

