package typings.betterScroll.anon

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
  def apply(stop: js.UndefOr[Double] = js.undefined, threshold: js.UndefOr[Double] = js.undefined): PartialPullDownOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stop)) __obj.updateDynamic("stop")(stop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPullDownOption]
  }
}

