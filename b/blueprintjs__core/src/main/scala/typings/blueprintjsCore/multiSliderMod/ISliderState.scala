package typings.blueprintjsCore.multiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderState extends js.Object {
  var labelPrecision: js.UndefOr[Double] = js.undefined
  /** the client size, in pixels, of one tick */
  var tickSize: js.UndefOr[Double] = js.undefined
  /** the size of one tick as a ratio of the component's client size */
  var tickSizeRatio: js.UndefOr[Double] = js.undefined
}

object ISliderState {
  @scala.inline
  def apply(
    labelPrecision: js.UndefOr[Double] = js.undefined,
    tickSize: js.UndefOr[Double] = js.undefined,
    tickSizeRatio: js.UndefOr[Double] = js.undefined
  ): ISliderState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(labelPrecision)) __obj.updateDynamic("labelPrecision")(labelPrecision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSize)) __obj.updateDynamic("tickSize")(tickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSizeRatio)) __obj.updateDynamic("tickSizeRatio")(tickSizeRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderState]
  }
}

