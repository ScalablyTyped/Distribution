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
    labelPrecision: Int | Double = null,
    tickSize: Int | Double = null,
    tickSizeRatio: Int | Double = null
  ): ISliderState = {
    val __obj = js.Dynamic.literal()
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickSizeRatio != null) __obj.updateDynamic("tickSizeRatio")(tickSizeRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderState]
  }
}

