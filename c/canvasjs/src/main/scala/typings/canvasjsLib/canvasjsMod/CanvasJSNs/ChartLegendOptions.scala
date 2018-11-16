package typings
package canvasjsLib.canvasjsMod.CanvasJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartLegendOptions extends js.Object {
  /**
           * Sets the cursor type for legend items.
           * Default: "default"
           * Examples: "pointer", "crosshair" ..
           */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When dockInsidePlotArea is set to true, legend renders inside the plot area there by giving more space to plot area.
           * Default: false
           * Example: true, false
           */
  var dockInsidePlotArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Sets the font color of Legend Text . The value of fontColor can be a "HTML Color Name" or "hex" code .
           * Default: "black"
           * Example: "red", "#FAC003" ..
           */
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the Font Family of Legend Text.
           * Default: "calibri"
           * Example: "arial" , "tahoma", "verdana" ..
           */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the font Size of Legend Text in pixels.
           * Default: 20
           * Example: 16,18,22 ..
           */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the fontStyle of Legend Text. fontStyle can be set to one of the below options.
           * Default: "normal"
           * Example: "normal", "italic" , "oblique"
           */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the Font Weight of Legend Text.
           * Default: "normal"
           * Example: "lighter", "normal", "bold" , "bolder"
           */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
           * This property lets you align the Legend Position horizontally.
           * Default: "right"
           * Example: "left", "right", "center"
           */
  var horizontalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Sets the maximum width of individual legend items after which they get wrapped or clipped depending on whether itemWrap is set to true (default) or false.
           * itemMaxWidth can’t be greater than maxWidth of legend.
           * Default: Automatically calculated based on the chart size.
           * Example: 100, 150, 200 etc.
           */
  var itemMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * A custom formatter function that returns text to be displayed inside individual legend items.
           */
  var itemTextFormatter: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[canvasjsLib.Anon_DataSeriesLegend], java.lang.String]
  ] = js.undefined
  /**
           * Sets the width of individual legend items after which the it gets wrapped or clipped depending on whether itemWrap is set to true (default) or false.
           * itemWidth can’t be greater than itemMaxWidth and maxWidth of legend.
           * Default: Automatically calculated based on chart size.
           * Example: 100, 200, 300 etc.
           */
  var itemWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * itemWrap specifies whether to wrap or clip legendText once its width crosses itemMaxWidth / maxWidth.
           * Default: true
           * Example: true, false
           */
  var itemWrap: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Sets the click event handler for the legend, which is triggered when the user clicks on a legend item.
           * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
           * Parameters passed to the function are shown in the Event Object section below.
           * @param event a chart event
           */
  var itemclick: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
           * Sets the mousemove event handler for the legend, which is triggered when the user moves the mouse(input device) within a legend item.
           * When the event is triggered, the event related data is passed as a parameter to the assigned event handler.
           * Parameters passed to the function are shown in the Event Object section below.
           * @param event a chart event
           */
  var itemmousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
           * Sets the mouseout event handler for the legend, which is triggered when the user moves the mouse pointer outside a legend item.
           * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
           * Parameters passed to the function are shown in the Event Object section below.
           * @param event a chart event
           */
  var itemmouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
           * Sets the mouseover event handler for the legend, which is triggered when the user moves the mouse(input device) over a legend item.
           * After the event is triggered, the event related data is passed as a parameter to the assigned event handler. Parameters passed to the function are shown in the Event Object section below.
           * @param event a chart event
           */
  var itemmouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, scala.Unit]] = js.undefined
  /**
           * Sets the margin between marker and text of each item inside legend.
           * Default: Automatically calculated based on the chart size.
           * Example: 4,12 ..
           */
  var markerMargin: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the maximum height of legend. Once the maximum height is reached, remaining legend items are not shown when horizontally stacked (while on top or bottom or plotArea)
           * and a new column is created when items are vertically stacked (when displayed to the left or right of plotArea).
           * Default: Automatically calculated based on chart size.
           * Example: 100,200, 300 etc.
           */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
           * Sets the maximum width of legend. If any item is longer than the maxWidth, it gets wrapped or clipped depending on the itemWrap property. itemWrap is true by default.
           * Whenever items are stacked horizontally, new items are moved to the next row once maxWidth is reached.
           * Default: Automatically calculated based on the chart size.
           * Example: 100, 200, 500 etc.
           */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * Setting reversed property to true shows legend items in reverse order.
           * Default: false;
           * Example: true, false
           */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * This property lets you align the Legend Position vertically.
           * Default: "bottom"
           * Example: "top", "center", "bottom"
           */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
}

