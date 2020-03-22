package typings.c3.mod

import typings.c3.AnonLeft
import typings.c3.AnonName
import typings.c3.AnonPositionShow
import typings.c3.c3Strings.asc
import typings.c3.c3Strings.desc
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  /**
    * Set custom HTML for the tooltip.
    * @param data If `tooltip.grouped` is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ js.Array[DataPoint], 
      /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* color */ js.Function1[/* repeated */ js.Any, _], 
      String
    ]
  ] = js.undefined
  var format: js.UndefOr[AnonName] = js.undefined
  /**
    * Set if tooltip is grouped or not for the data points.
    * Defaults to `true`.
    */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /** Show the tooltips based on the horizontal position of the mouse. */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[AnonPositionShow] = js.undefined
  /**
    * Set tooltip values order.
    */
  var order: js.UndefOr[
    desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) | Null
  ] = js.undefined
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ Primitive, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ SVGElement, 
      AnonLeft
    ]
  ] = js.undefined
  /**
    * Show or hide tooltip.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    contents: js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ js.Array[DataPoint], 
      /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* color */ js.Function1[/* repeated */ js.Any, _], 
      String
    ] = null,
    format: AnonName = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    init: AnonPositionShow = null,
    order: desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) = null,
    position: js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ Primitive, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ SVGElement, 
      AnonLeft
    ] = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

