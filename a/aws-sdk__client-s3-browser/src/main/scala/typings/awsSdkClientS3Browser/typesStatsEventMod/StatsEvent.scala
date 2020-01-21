package typings.awsSdkClientS3Browser.typesStatsEventMod

import typings.awsSdkClientS3Browser.typesStatsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsEvent extends js.Object {
  /**
    * <p>The Stats event details.</p>
    */
  var Details: js.UndefOr[Stats] = js.undefined
}

object StatsEvent {
  @scala.inline
  def apply(Details: Stats = null): StatsEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsEvent]
  }
}

