package typings.c3.mod

import typings.c3.anon.Position
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisConfiguration extends js.Object {
  /**
    * Show the axis inside of the chart.
    */
  var inner: js.UndefOr[Boolean] = js.undefined
  /**
    * Set label on axis.
    * Valid horizontal axis positions: inner-right (default), inner-center, inner-left, outer-right, outer-center, outer-left
    * Valid vertical axis positions: inner-top, inner-middle, inner-bottom, outer-top, outer-middle, outer-bottom
    */
  var label: js.UndefOr[String | Position] = js.undefined
  /**
    * Set max value of the axis.
    */
  var max: js.UndefOr[String | Double | Date] = js.undefined
  /**
    * Set min value of the axis.
    */
  var min: js.UndefOr[String | Double | Date] = js.undefined
  /**
    * Set padding for axis.
    * If this option is set, the range of axis will increase/decrease according to the values. If no padding is needed in the range of axis, `0` should be set. On category axis, this option
    * will be ignored.
    */
  var padding: js.UndefOr[Padding] = js.undefined
  /**
    * Show or hide the axis.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object AxisConfiguration {
  @scala.inline
  def apply(
    inner: js.UndefOr[Boolean] = js.undefined,
    label: String | Position = null,
    max: String | Double | Date = null,
    min: String | Double | Date = null,
    padding: Padding = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): AxisConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisConfiguration]
  }
}

