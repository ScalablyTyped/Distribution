package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistStepInterpolationOptions extends IChartistInterpolationOptions {
  var postpone: js.UndefOr[Boolean] = js.undefined
}

object IChartistStepInterpolationOptions {
  @scala.inline
  def apply(fillHoles: js.UndefOr[Boolean] = js.undefined, postpone: js.UndefOr[Boolean] = js.undefined): IChartistStepInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles.asInstanceOf[js.Any])
    if (!js.isUndefined(postpone)) __obj.updateDynamic("postpone")(postpone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistStepInterpolationOptions]
  }
}

