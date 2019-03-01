package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullUpOption extends js.Object {
  var threshold: scala.Double
}

object PullUpOption {
  @scala.inline
  def apply(threshold: scala.Double): PullUpOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[PullUpOption]
  }
}

