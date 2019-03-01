package typings
package betterDashQueueLib.betterDashQueueMod.BetterQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickerProgress extends js.Object {
  var complete: scala.Double
  var eta: java.lang.String
  var message: java.lang.String
  var pct: scala.Double
  var total: scala.Double
}

object TickerProgress {
  @scala.inline
  def apply(
    complete: scala.Double,
    eta: java.lang.String,
    message: java.lang.String,
    pct: scala.Double,
    total: scala.Double
  ): TickerProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("eta")(eta)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("pct")(pct)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[TickerProgress]
  }
}

