package typings.betterDashQueue.betterDashQueueMod

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
    val __obj = js.Dynamic.literal(average = average, peak = peak, successRate = successRate, total = total)
  
    __obj.asInstanceOf[QueueStats]
  }
}

