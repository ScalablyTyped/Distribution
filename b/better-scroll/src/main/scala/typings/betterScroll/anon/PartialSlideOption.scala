package typings.betterScroll.anon

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
    speed: js.UndefOr[Double] = js.undefined,
    stepX: js.UndefOr[Double] = js.undefined,
    stepY: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): PartialSlideOption = {
    val __obj = js.Dynamic.literal()
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(listenFlick)) __obj.updateDynamic("listenFlick")(listenFlick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepX)) __obj.updateDynamic("stepX")(stepX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepY)) __obj.updateDynamic("stepY")(stepY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSlideOption]
  }
}

