package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentBehaviorsMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreRecencyDimensionMod._UnmarshalledRecencyDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentBehaviors extends _SegmentBehaviors {
  /**
    * The recency of use.
    */
  @JSName("Recency")
  var Recency__UnmarshalledSegmentBehaviors: js.UndefOr[_UnmarshalledRecencyDimension] = js.undefined
}

object _UnmarshalledSegmentBehaviors {
  @scala.inline
  def apply(Recency: _UnmarshalledRecencyDimension = null): _UnmarshalledSegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    if (Recency != null) __obj.updateDynamic("Recency")(Recency.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentBehaviors]
  }
}

