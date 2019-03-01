package typings
package betterDashQueueLib.betterDashQueueMod.BetterQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueStats extends js.Object {
  var average: scala.Double
  var peak: scala.Double
  var successRate: scala.Double
  var total: scala.Double
}

object QueueStats {
  @scala.inline
  def apply(average: scala.Double, peak: scala.Double, successRate: scala.Double, total: scala.Double): QueueStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("average")(average)
    __obj.updateDynamic("peak")(peak)
    __obj.updateDynamic("successRate")(successRate)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[QueueStats]
  }
}

