package typings.betterDashScroll.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullDownOption extends js.Object {
  var stop: Double
  var threshold: Double
}

object PullDownOption {
  @scala.inline
  def apply(stop: Double, threshold: Double): PullDownOption = {
    val __obj = js.Dynamic.literal(stop = stop, threshold = threshold)
  
    __obj.asInstanceOf[PullDownOption]
  }
}

