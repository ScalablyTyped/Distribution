package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAnimationObject extends js.Object {
  var currentStep: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var numSteps: js.UndefOr[Double] = js.undefined
  var onAnimationComplete: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.undefined
  var onAnimationProgress: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.undefined
}

object ChartAnimationObject {
  @scala.inline
  def apply(
    currentStep: Int | Double = null,
    easing: Easing = null,
    numSteps: Int | Double = null,
    onAnimationComplete: /* arg */ js.Any => Unit = null,
    onAnimationProgress: /* arg */ js.Any => Unit = null,
    render: /* arg */ js.Any => Unit = null
  ): ChartAnimationObject = {
    val __obj = js.Dynamic.literal()
    if (currentStep != null) __obj.updateDynamic("currentStep")(currentStep.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (numSteps != null) __obj.updateDynamic("numSteps")(numSteps.asInstanceOf[js.Any])
    if (onAnimationComplete != null) __obj.updateDynamic("onAnimationComplete")(js.Any.fromFunction1(onAnimationComplete))
    if (onAnimationProgress != null) __obj.updateDynamic("onAnimationProgress")(js.Any.fromFunction1(onAnimationProgress))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[ChartAnimationObject]
  }
}

