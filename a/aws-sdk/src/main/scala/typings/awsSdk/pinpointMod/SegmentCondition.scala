package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentCondition extends js.Object {
  /**
    * The unique identifier for the segment to associate with the activity.
    */
  var SegmentId: string = js.native
}

object SegmentCondition {
  @scala.inline
  def apply(SegmentId: string): SegmentCondition = {
    val __obj = js.Dynamic.literal(SegmentId = SegmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentCondition]
  }
  @scala.inline
  implicit class SegmentConditionOps[Self <: SegmentCondition] (val x: Self) extends AnyVal {
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
    def setSegmentId(value: string): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
  }
  
}

