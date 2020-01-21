package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCondition extends js.Object {
  /**
    * The custom description of the condition.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The segment that's associated with the first activity in the journey. This segment determines which users are participants in the journey.
    */
  var SegmentStartCondition: js.UndefOr[SegmentCondition] = js.native
}

object StartCondition {
  @scala.inline
  def apply(Description: string = null, SegmentStartCondition: SegmentCondition = null): StartCondition = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (SegmentStartCondition != null) __obj.updateDynamic("SegmentStartCondition")(SegmentStartCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCondition]
  }
}

