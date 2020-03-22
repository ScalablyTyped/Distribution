package typings.betterScroll

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
    adjustTime: Int | Double = null,
    rotate: Int | Double = null,
    selectedIndex: Int | Double = null,
    wheelItemClass: String = null,
    wheelWrapperClass: String = null
  ): PartialWheelOption = {
    val __obj = js.Dynamic.literal()
    if (adjustTime != null) __obj.updateDynamic("adjustTime")(adjustTime.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (wheelItemClass != null) __obj.updateDynamic("wheelItemClass")(wheelItemClass.asInstanceOf[js.Any])
    if (wheelWrapperClass != null) __obj.updateDynamic("wheelWrapperClass")(wheelWrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWheelOption]
  }
}

