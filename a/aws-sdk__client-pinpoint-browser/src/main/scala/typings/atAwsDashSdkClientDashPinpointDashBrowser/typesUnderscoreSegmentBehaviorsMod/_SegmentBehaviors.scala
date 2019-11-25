package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentBehaviorsMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreRecencyDimensionMod._RecencyDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentBehaviors extends js.Object {
  /**
    * The recency of use.
    */
  var Recency: js.UndefOr[_RecencyDimension] = js.undefined
}

object _SegmentBehaviors {
  @scala.inline
  def apply(Recency: _RecencyDimension = null): _SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    if (Recency != null) __obj.updateDynamic("Recency")(Recency.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentBehaviors]
  }
}

