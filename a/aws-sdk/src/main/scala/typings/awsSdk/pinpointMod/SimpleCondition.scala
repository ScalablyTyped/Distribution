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
  def apply(): SimpleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleCondition]
  }
  @scala.inline
  implicit class SimpleConditionOps[Self <: SimpleCondition] (val x: Self) extends AnyVal {
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
    def setEventCondition(value: EventCondition): Self = this.set("EventCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCondition: Self = this.set("EventCondition", js.undefined)
    @scala.inline
    def setSegmentCondition(value: SegmentCondition): Self = this.set("SegmentCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentCondition: Self = this.set("SegmentCondition", js.undefined)
    @scala.inline
    def setSegmentDimensions(value: SegmentDimensions): Self = this.set("SegmentDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentDimensions: Self = this.set("SegmentDimensions", js.undefined)
  }
  
}

