package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.PullUpOption> */
trait PartialPullUpOption extends js.Object {
  var threshold: js.UndefOr[Double] = js.undefined
}

object PartialPullUpOption {
  @scala.inline
  def apply(threshold: js.UndefOr[Double] = js.undefined): PartialPullUpOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPullUpOption]
  }
}

