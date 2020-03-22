package typings.betterScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.MouseWheelOption> */
trait PartialMouseWheelOption extends js.Object {
  var easeTime: js.UndefOr[Double] = js.undefined
  var invert: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object PartialMouseWheelOption {
  @scala.inline
  def apply(
    easeTime: Int | Double = null,
    invert: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null
  ): PartialMouseWheelOption = {
    val __obj = js.Dynamic.literal()
    if (easeTime != null) __obj.updateDynamic("easeTime")(easeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMouseWheelOption]
  }
}

