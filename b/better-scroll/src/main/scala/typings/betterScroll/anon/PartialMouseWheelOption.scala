package typings.betterScroll.anon

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
    easeTime: js.UndefOr[Double] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined
  ): PartialMouseWheelOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(easeTime)) __obj.updateDynamic("easeTime")(easeTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMouseWheelOption]
  }
}

