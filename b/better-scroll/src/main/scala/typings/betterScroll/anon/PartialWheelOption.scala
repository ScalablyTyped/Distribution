package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.WheelOption> */
trait PartialWheelOption extends js.Object {
  var adjustTime: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var wheelItemClass: js.UndefOr[String] = js.undefined
  var wheelWrapperClass: js.UndefOr[String] = js.undefined
}

object PartialWheelOption {
  @scala.inline
  def apply(
    adjustTime: js.UndefOr[Double] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    selectedIndex: js.UndefOr[Double] = js.undefined,
    wheelItemClass: String = null,
    wheelWrapperClass: String = null
  ): PartialWheelOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustTime)) __obj.updateDynamic("adjustTime")(adjustTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    if (wheelItemClass != null) __obj.updateDynamic("wheelItemClass")(wheelItemClass.asInstanceOf[js.Any])
    if (wheelWrapperClass != null) __obj.updateDynamic("wheelWrapperClass")(wheelWrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWheelOption]
  }
}

