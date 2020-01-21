package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViolationEventsResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The security profile violation alerts issued for this account during the given time period, potentially filtered by security profile, behavior violated, or thing (device) violating.
    */
  var violationEvents: js.UndefOr[ViolationEvents] = js.native
}

object ListViolationEventsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, violationEvents: ViolationEvents = null): ListViolationEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (violationEvents != null) __obj.updateDynamic("violationEvents")(violationEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViolationEventsResponse]
  }
}

