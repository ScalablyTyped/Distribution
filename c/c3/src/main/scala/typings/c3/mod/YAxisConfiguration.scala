package typings.c3.mod

import typings.c3.anon.Position
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
    center: js.UndefOr[Double] = js.undefined,
    default: js.Tuple2[Double, Double] = null,
    inner: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: String | Position = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    padding: Padding = null,
    show: js.UndefOr[Boolean] = js.undefined,
    tick: YTickConfiguration = null
  ): YAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisConfiguration]
  }
}

