package typings.c3.c3Mod

import typings.c3.Anon_IdIndex
import typings.c3.Anon_LeftTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  /**
    * Set custom HTML for the tooltip.
    * Specified function receives data, defaultTitleFormat, defaultValueFormat and color of the data point to show. If tooltip.grouped is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* defaultTitleFormat */ String, 
      /* defaultValueFormat */ String, 
      /* color */ js.Any, 
      String
    ]
  ] = js.undefined
  var format: js.UndefOr[Anon_IdIndex] = js.undefined
  /**
    * Set if tooltip is grouped or not for the data points.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /**
    * Set tooltip values order
    * Available Values: desc, asc, any[], function (data1, data2) { ... }, null
    */
  var order: js.UndefOr[
    String | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) | Null
  ] = js.undefined
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ js.Any, 
      Anon_LeftTop
    ]
  ] = js.undefined
  /**
    * Show or hide tooltip.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    contents: (/* data */ js.Any, /* defaultTitleFormat */ String, /* defaultValueFormat */ String, /* color */ js.Any) => String = null,
    format: Anon_IdIndex = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    order: String | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) = null,
    position: (/* data */ js.Any, /* width */ Double, /* height */ Double, /* element */ js.Any) => Anon_LeftTop = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(js.Any.fromFunction4(contents))
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction4(position))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[TooltipOptions]
  }
}

