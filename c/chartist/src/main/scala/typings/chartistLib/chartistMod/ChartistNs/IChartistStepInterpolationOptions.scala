package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartistStepInterpolationOptions extends IChartistInterpolationOptions {
  var postpone: js.UndefOr[scala.Boolean] = js.undefined
}

object IChartistStepInterpolationOptions {
  @scala.inline
  def apply(
    fillHoles: js.UndefOr[scala.Boolean] = js.undefined,
    postpone: js.UndefOr[scala.Boolean] = js.undefined
  ): IChartistStepInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fillHoles)) __obj.updateDynamic("fillHoles")(fillHoles)
    if (!js.isUndefined(postpone)) __obj.updateDynamic("postpone")(postpone)
    __obj.asInstanceOf[IChartistStepInterpolationOptions]
  }
}

