package typings.c3.mod

import typings.c3.AnonMaxNumber
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTickConfiguration extends TickConfiguration {
  /**
    * Centerise ticks on category axis
    */
  var centered: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting for culling ticks.
    * If `true` is set, the ticks will be culled, then only limitted tick text will be shown.
    * This option does not hide the tick lines. If `false` is set, all of ticks will be shown.
    */
  var culling: js.UndefOr[Boolean | AnonMaxNumber] = js.undefined
  /**
    * Fit x axis ticks.
    * If `true` set, the ticks will be positioned nicely. If `false` set, the ticks will be positioned
    * according to x value of the data points.
    */
  var fit: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to format x-axis tick values. A format string is also supported for timeseries data.
    */
  var format: js.UndefOr[String | (js.Function1[/* x */ Double | Date, String | Double])] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var multilineMax: js.UndefOr[Double] = js.undefined
  /**
    * Set width of x axis tick.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object XTickConfiguration {
  @scala.inline
  def apply(
    centered: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    culling: Boolean | AnonMaxNumber = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    format: String | (js.Function1[/* x */ Double | Date, String | Double]) = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    multilineMax: Int | Double = null,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    values: js.Array[Double | String] = null,
    width: Int | Double = null
  ): XTickConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (culling != null) __obj.updateDynamic("culling")(culling.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (multilineMax != null) __obj.updateDynamic("multilineMax")(multilineMax.asInstanceOf[js.Any])
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[XTickConfiguration]
  }
}

