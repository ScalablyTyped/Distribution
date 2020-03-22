package typings.betterScroll

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.SlideOption> */
trait PartialSlideOption extends js.Object {
  var el: js.UndefOr[Element] = js.undefined
  var listenFlick: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var stepX: js.UndefOr[Double] = js.undefined
  var stepY: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PartialSlideOption {
  @scala.inline
  def apply(
    el: Element = null,
    listenFlick: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    stepX: Int | Double = null,
    stepY: Int | Double = null,
    threshold: Int | Double = null
  ): PartialSlideOption = {
    val __obj = js.Dynamic.literal()
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(listenFlick)) __obj.updateDynamic("listenFlick")(listenFlick.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (stepX != null) __obj.updateDynamic("stepX")(stepX.asInstanceOf[js.Any])
    if (stepY != null) __obj.updateDynamic("stepY")(stepY.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSlideOption]
  }
}

