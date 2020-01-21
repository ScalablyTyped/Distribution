package typings.betterQueue.mod

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
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TickerProgress]
  }
}

