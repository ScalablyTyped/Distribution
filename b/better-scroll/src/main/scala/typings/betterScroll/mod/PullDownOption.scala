package typings.betterScroll.mod

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
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDownOption]
  }
}

