package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreStatsEventMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreStatsMod._UnmarshalledStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledStatsEvent extends _StatsEvent {
  /**
    * <p>The Stats event details.</p>
    */
  @JSName("Details")
  var Details__UnmarshalledStatsEvent: js.UndefOr[_UnmarshalledStats] = js.undefined
}

object _UnmarshalledStatsEvent {
  @scala.inline
  def apply(Details: _UnmarshalledStats = null): _UnmarshalledStatsEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledStatsEvent]
  }
}

