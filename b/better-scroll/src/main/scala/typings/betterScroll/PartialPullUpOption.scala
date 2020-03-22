package typings.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.PullUpOption> */
trait PartialPullUpOption extends js.Object {
  var threshold: js.UndefOr[Double] = js.undefined
}

object PartialPullUpOption {
  @scala.inline
  def apply(threshold: Int | Double = null): PartialPullUpOption = {
    val __obj = js.Dynamic.literal()
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPullUpOption]
  }
}

