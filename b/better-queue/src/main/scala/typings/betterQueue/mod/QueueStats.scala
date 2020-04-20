package typings.betterQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueStats extends js.Object {
  var average: Double
  var peak: Double
  var successRate: Double
  var total: Double
}

object QueueStats {
  @scala.inline
  def apply(average: Double, peak: Double, successRate: Double, total: Double): QueueStats = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any], successRate = successRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueStats]
  }
}

