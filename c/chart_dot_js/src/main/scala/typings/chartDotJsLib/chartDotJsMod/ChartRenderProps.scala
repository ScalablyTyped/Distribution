package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartRenderProps extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartRenderProps {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    easing: Easing = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartRenderProps = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    __obj.asInstanceOf[ChartRenderProps]
  }
}

