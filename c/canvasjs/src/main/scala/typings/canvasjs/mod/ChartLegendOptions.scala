package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendOptions extends js.Object {
  /**
    * Sets the cursor type for legend items.
    * Default: "default"
    * Examples: "pointer", "crosshair" ..
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * When dockInsidePlotArea is set to true, legend renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: true, false
    */
  var dockInsidePlotArea: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the font color of Legend Text . The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Family of Legend Text.
    * Default: "calibri"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Sets the font Size of Legend Text in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Sets the fontStyle of Legend Text. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Example: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
    * Sets the Font Weight of Legend Text.
    * Default: "normal"
    * Example: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
    * This property lets you align the Legend Position horizontally.
    * Default: "right"
    * Example: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[String] = js.undefined
  /**
    * Sets the maximum width of individual legend items after which they get wrapped or clipped depending on whether itemWrap is set to true (default) or false.
    * itemMaxWidth can’t be greater than maxWidth of legend.
    * Default: Automatically calculated based on the chart size.
    * Example: 100, 150, 200 etc.
    */
  var itemMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * A custom formatter function that returns text to be displayed inside individual legend items.
    */
  var itemTextFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[typings.canvasjs.anon.Chart], String]] = js.undefined
  /**
    * Sets the width of individual legend items after which the it gets wrapped or clipped depending on whether itemWrap is set to true (default) or false.
    * itemWidth can’t be greater than itemMaxWidth and maxWidth of legend.
    * Default: Automatically calculated based on chart size.
    * Example: 100, 200, 300 etc.
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  /**
    * itemWrap specifies whether to wrap or clip legendText once its width crosses itemMaxWidth / maxWidth.
    * Default: true
    * Example: true, false
    */
  var itemWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the click event handler for the legend, which is triggered when the user clicks on a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemclick: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the mousemove event handler for the legend, which is triggered when the user moves the mouse(input device) within a legend item.
    * When the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the mouseout event handler for the legend, which is triggered when the user moves the mouse pointer outside a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the mouseover event handler for the legend, which is triggered when the user moves the mouse(input device) over a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler. Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.undefined
  /**
    * Sets the margin between marker and text of each item inside legend.
    * Default: Automatically calculated based on the chart size.
    * Example: 4,12 ..
    */
  var markerMargin: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum height of legend. Once the maximum height is reached, remaining legend items are not shown when horizontally stacked (while on top or bottom or plotArea)
    * and a new column is created when items are vertically stacked (when displayed to the left or right of plotArea).
    * Default: Automatically calculated based on chart size.
    * Example: 100,200, 300 etc.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Sets the maximum width of legend. If any item is longer than the maxWidth, it gets wrapped or clipped depending on the itemWrap property. itemWrap is true by default.
    * Whenever items are stacked horizontally, new items are moved to the next row once maxWidth is reached.
    * Default: Automatically calculated based on the chart size.
    * Example: 100, 200, 500 etc.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Setting reversed property to true shows legend items in reverse order.
    * Default: false;
    * Example: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * This property lets you align the Legend Position vertically.
    * Default: "bottom"
    * Example: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
}

object ChartLegendOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    dockInsidePlotArea: js.UndefOr[Boolean] = js.undefined,
    fontColor: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: String = null,
    fontWeight: String = null,
    horizontalAlign: String = null,
    itemMaxWidth: js.UndefOr[Double] = js.undefined,
    itemTextFormatter: /* e */ js.UndefOr[typings.canvasjs.anon.Chart] => String = null,
    itemWidth: js.UndefOr[Double] = js.undefined,
    itemWrap: js.UndefOr[Boolean] = js.undefined,
    itemclick: /* event */ ChartEvent => Unit = null,
    itemmousemove: /* event */ ChartEvent => Unit = null,
    itemmouseout: /* event */ ChartEvent => Unit = null,
    itemmouseover: /* event */ ChartEvent => Unit = null,
    markerMargin: js.UndefOr[Double] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: String = null
  ): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(dockInsidePlotArea)) __obj.updateDynamic("dockInsidePlotArea")(dockInsidePlotArea.get.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(itemMaxWidth)) __obj.updateDynamic("itemMaxWidth")(itemMaxWidth.get.asInstanceOf[js.Any])
    if (itemTextFormatter != null) __obj.updateDynamic("itemTextFormatter")(js.Any.fromFunction1(itemTextFormatter))
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemWrap)) __obj.updateDynamic("itemWrap")(itemWrap.get.asInstanceOf[js.Any])
    if (itemclick != null) __obj.updateDynamic("itemclick")(js.Any.fromFunction1(itemclick))
    if (itemmousemove != null) __obj.updateDynamic("itemmousemove")(js.Any.fromFunction1(itemmousemove))
    if (itemmouseout != null) __obj.updateDynamic("itemmouseout")(js.Any.fromFunction1(itemmouseout))
    if (itemmouseover != null) __obj.updateDynamic("itemmouseover")(js.Any.fromFunction1(itemmouseover))
    if (!js.isUndefined(markerMargin)) __obj.updateDynamic("markerMargin")(markerMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendOptions]
  }
}

