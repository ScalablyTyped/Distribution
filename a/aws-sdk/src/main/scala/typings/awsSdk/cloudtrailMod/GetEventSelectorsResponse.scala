package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventSelectorsResponse extends js.Object {
  /**
    * The event selectors that are configured for the trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.native
  /**
    * The specified trail ARN that has the event selectors.
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object GetEventSelectorsResponse {
  @scala.inline
  def apply(EventSelectors: EventSelectors = null, TrailARN: String = null): GetEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSelectors != null) __obj.updateDynamic("EventSelectors")(EventSelectors.asInstanceOf[js.Any])
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventSelectorsResponse]
  }
}

