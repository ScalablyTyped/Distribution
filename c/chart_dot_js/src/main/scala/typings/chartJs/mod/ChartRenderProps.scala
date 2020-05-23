package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartRenderProps extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
}

object ChartRenderProps {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    easing: Easing = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined
  ): ChartRenderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartRenderProps]
  }
}

