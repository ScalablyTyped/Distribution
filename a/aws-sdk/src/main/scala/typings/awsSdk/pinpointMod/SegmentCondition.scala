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
}

