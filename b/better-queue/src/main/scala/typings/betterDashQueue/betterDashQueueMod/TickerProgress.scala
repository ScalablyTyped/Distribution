package typings.betterDashQueue.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickerProgress extends js.Object {
  var complete: Double
  var eta: String
  var message: String
  var pct: Double
  var total: Double
}

object TickerProgress {
  @scala.inline
  def apply(complete: Double, eta: String, message: String, pct: Double, total: Double): TickerProgress = {
    val __obj = js.Dynamic.literal(complete = complete, eta = eta, message = message, pct = pct, total = total)
  
    __obj.asInstanceOf[TickerProgress]
  }
}

