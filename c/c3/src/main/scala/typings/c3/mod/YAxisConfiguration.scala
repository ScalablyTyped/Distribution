package typings.c3.mod

import typings.c3.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisConfiguration extends AxisConfiguration {
  /**
    * Set center value of y axis.
    */
  var center: js.UndefOr[Double] = js.undefined
  /**
    * Set default range of y axis. This option set the default value for y axis when there is no data on init.
    */
  var default: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /**
    * Change the direction of y axis.
    * If true set, the direction will be from the top to the bottom.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  @JSName("max")
  var max_YAxisConfiguration: js.UndefOr[Double] = js.undefined
  @JSName("min")
  var min_YAxisConfiguration: js.UndefOr[Double] = js.undefined
  var tick: js.UndefOr[YTickConfiguration] = js.undefined
}

object YAxisConfiguration {
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
    tick: YTickConfiguration = null
  ): YAxisConfiguration = {
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
    __obj.asInstanceOf[YAxisConfiguration]
  }
}

