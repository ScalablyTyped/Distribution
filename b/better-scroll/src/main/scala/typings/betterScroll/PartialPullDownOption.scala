package typings.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.PullDownOption> */
trait PartialPullDownOption extends js.Object {
  var stop: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PartialPullDownOption {
  @scala.inline
  def apply(stop: Int | Double = null, threshold: Int | Double = null): PartialPullDownOption = {
    val __obj = js.Dynamic.literal()
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPullDownOption]
  }
}

