package typings.c3.mod

import typings.c3.anon.MaxNumber
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
  var culling: js.UndefOr[Boolean | MaxNumber] = js.undefined
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
    count: js.UndefOr[Double] = js.undefined,
    culling: Boolean | MaxNumber = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    format: String | (js.Function1[/* x */ Double | Date, String | Double]) = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    multilineMax: js.UndefOr[Double] = js.undefined,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    values: js.Array[Double | String] = null,
    width: js.UndefOr[Double] = js.undefined
  ): XTickConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (culling != null) __obj.updateDynamic("culling")(culling.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multilineMax)) __obj.updateDynamic("multilineMax")(multilineMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XTickConfiguration]
  }
}

