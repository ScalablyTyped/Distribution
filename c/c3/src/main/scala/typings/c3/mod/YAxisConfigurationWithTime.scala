package typings.c3.mod

import typings.c3.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisConfigurationWithTime extends YAxisConfiguration {
  @JSName("tick")
  var tick_YAxisConfigurationWithTime: js.UndefOr[YTickConfigurationWithTime] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object YAxisConfigurationWithTime {
  @scala.inline
  def apply(
    center: Int | Double = null,
    default: js.Tuple2[Double, Double] = null,
    inner: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: String | AnonPosition = null,
    max: Int | Double = null,
    min: Int | Double = null,
    padding: Padding = null,
    show: js.UndefOr[Boolean] = js.undefined,
    tick: YTickConfigurationWithTime = null,
    `type`: js.Any = null
  ): YAxisConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisConfigurationWithTime]
  }
}

