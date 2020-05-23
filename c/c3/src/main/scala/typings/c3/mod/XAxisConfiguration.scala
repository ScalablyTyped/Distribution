package typings.c3.mod

import typings.c3.anon.Position
import typings.c3.c3Strings.category
import typings.c3.c3Strings.indexed
import typings.c3.c3Strings.timeseries
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisConfiguration extends AxisConfiguration {
  /**
    * Set category names on category axis.
    * This must be an array that includes category names in string. If category names are included in the date by `data.x` option, this is not required.
    */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set default extent for subchart and zoom. This can be an array or function that returns an array.
    */
  var extent: js.UndefOr[js.Array[Double] | js.Function0[js.Array[Double]]] = js.undefined
  /**
    * Set height of x axis.
    * The height of x axis can be set manually by this option. If you need more space for x axis, please use this option for that. The unit is pixel.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Set how to treat the timezone of x values.
    * If `true` (default), treat x value as localtime. If `false`, convert to UTC internally.
    */
  var localtime: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var tick: js.UndefOr[XTickConfiguration] = js.undefined
  /**
    * Set type of x axis.
    * Defaults to `"indexed"`.
    */
  var `type`: js.UndefOr[timeseries | category | indexed] = js.undefined
}

object XAxisConfiguration {
  @scala.inline
  def apply(
    categories: js.Array[String] = null,
    extent: js.Array[Double] | js.Function0[js.Array[Double]] = null,
    height: js.UndefOr[Double] = js.undefined,
    inner: js.UndefOr[Boolean] = js.undefined,
    label: String | Position = null,
    localtime: js.UndefOr[Boolean] = js.undefined,
    max: String | Double | Date = null,
    min: String | Double | Date = null,
    padding: Padding = null,
    selection: js.Any = null,
    show: js.UndefOr[Boolean] = js.undefined,
    tick: XTickConfiguration = null,
    `type`: timeseries | category | indexed = null
  ): XAxisConfiguration = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inner)) __obj.updateDynamic("inner")(inner.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(localtime)) __obj.updateDynamic("localtime")(localtime.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisConfiguration]
  }
}

