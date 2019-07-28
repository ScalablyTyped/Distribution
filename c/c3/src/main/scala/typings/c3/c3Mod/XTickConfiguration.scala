package typings.c3.c3Mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTickConfiguration extends js.Object {
  /**
    * Centerise ticks on category axis
    */
  var centered: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of x axis ticks to show.
    * This option hides tick lines together with tick text. If this option is used on timeseries axis, the ticks position will be determined precisely and not nicely positioned (e.g. it will
    * have rough second value).
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Setting for culling ticks.
    * If true is set, the ticks will be culled, then only limitted tick text will be shown. This option does not hide the tick lines. If false is set, all of ticks will be shown.
    */
  var culling: js.UndefOr[Boolean | CullingConfiguration] = js.undefined
  /**
    * Fit x axis ticks.
    * If true set, the ticks will be positioned nicely. If false set, the ticks will be positioned according to x value of the data points.
    */
  var fit: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to format tick value. Format string is also available for timeseries data.
    */
  var format: js.UndefOr[String | (js.Function1[/* x */ Double | Date, String | Double])] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Show x axis outer tick.
    */
  var outer: js.UndefOr[Boolean] = js.undefined
  /**
    * Rotate x axis tick text. If you set negative value, it will rotate to opposite direction.
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Set the x values of ticks manually.
    * If this option is provided, the position of the ticks will be determined based on those values. This option works with timeseries data and the x values will be parsed accoding to the type
    * of the value and data.xFormat option.
    */
  var values: js.UndefOr[js.Array[Double | String]] = js.undefined
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
    culling: Boolean | CullingConfiguration = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    format: String | (js.Function1[/* x */ Double | Date, String | Double]) = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    outer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    values: js.Array[Double | String] = null,
    width: Int | Double = null
  ): XTickConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (culling != null) __obj.updateDynamic("culling")(culling.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (!js.isUndefined(outer)) __obj.updateDynamic("outer")(outer)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[XTickConfiguration]
  }
}

