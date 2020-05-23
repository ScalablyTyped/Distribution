package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TumblingWindow extends js.Object {
  /**
    * The time interval for the tumbling window. Note that w represents weeks, d represents days, h represents hours, and m represents minutes. AWS IoT SiteWise computes the 1w interval the end of Sunday at midnight each week (UTC), the 1d interval at the end of each day at midnight (UTC), the 1h interval at the end of each hour, and so on.  When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at the end of the interval.
    */
  var interval: Interval = js.native
}

object TumblingWindow {
  @scala.inline
  def apply(interval: Interval): TumblingWindow = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TumblingWindow]
  }
}

