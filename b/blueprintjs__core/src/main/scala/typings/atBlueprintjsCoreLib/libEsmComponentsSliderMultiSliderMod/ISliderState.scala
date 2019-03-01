package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderState extends js.Object {
  var labelPrecision: js.UndefOr[scala.Double] = js.undefined
  /** the client size, in pixels, of one tick */
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  /** the size of one tick as a ratio of the component's client size */
  var tickSizeRatio: js.UndefOr[scala.Double] = js.undefined
}

object ISliderState {
  @scala.inline
  def apply(
    labelPrecision: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    tickSizeRatio: scala.Int | scala.Double = null
  ): ISliderState = {
    val __obj = js.Dynamic.literal()
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickSizeRatio != null) __obj.updateDynamic("tickSizeRatio")(tickSizeRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderState]
  }
}

