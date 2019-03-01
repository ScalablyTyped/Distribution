package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullDownOption extends js.Object {
  var stop: scala.Double
  var threshold: scala.Double
}

object PullDownOption {
  @scala.inline
  def apply(stop: scala.Double, threshold: scala.Double): PullDownOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[PullDownOption]
  }
}

