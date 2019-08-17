package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStatsEventMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStatsMod._Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StatsEvent extends js.Object {
  /**
    * <p>The Stats event details.</p>
    */
  var Details: js.UndefOr[_Stats] = js.undefined
}

object _StatsEvent {
  @scala.inline
  def apply(Details: _Stats = null): _StatsEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    __obj.asInstanceOf[_StatsEvent]
  }
}

