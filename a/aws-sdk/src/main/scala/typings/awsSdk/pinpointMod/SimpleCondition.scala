package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleCondition extends js.Object {
  /**
    * The dimension settings for the event that's associated with the activity.
    */
  var EventCondition: js.UndefOr[typings.awsSdk.pinpointMod.EventCondition] = js.native
  /**
    * The segment that's associated with the activity.
    */
  var SegmentCondition: js.UndefOr[typings.awsSdk.pinpointMod.SegmentCondition] = js.native
  /**
    * The dimension settings for the segment that's associated with the activity.
    */
  var SegmentDimensions: js.UndefOr[typings.awsSdk.pinpointMod.SegmentDimensions] = js.native
}

object SimpleCondition {
  @scala.inline
  def apply(
    EventCondition: EventCondition = null,
    SegmentCondition: SegmentCondition = null,
    SegmentDimensions: SegmentDimensions = null
  ): SimpleCondition = {
    val __obj = js.Dynamic.literal()
    if (EventCondition != null) __obj.updateDynamic("EventCondition")(EventCondition.asInstanceOf[js.Any])
    if (SegmentCondition != null) __obj.updateDynamic("SegmentCondition")(SegmentCondition.asInstanceOf[js.Any])
    if (SegmentDimensions != null) __obj.updateDynamic("SegmentDimensions")(SegmentDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCondition]
  }
}

