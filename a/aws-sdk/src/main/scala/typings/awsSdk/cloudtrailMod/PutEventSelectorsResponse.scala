package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventSelectorsResponse extends js.Object {
  /**
    * Specifies the event selectors configured for your trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.native
  /**
    * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object PutEventSelectorsResponse {
  @scala.inline
  def apply(EventSelectors: EventSelectors = null, TrailARN: String = null): PutEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSelectors != null) __obj.updateDynamic("EventSelectors")(EventSelectors.asInstanceOf[js.Any])
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventSelectorsResponse]
  }
}

