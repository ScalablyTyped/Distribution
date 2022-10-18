package typings.canvasjs.mod

import typings.canvasjs.anon.DataPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendOptions extends StObject {
  
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
  var itemTextFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[DataPoint], String]] = js.undefined
  
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
  
  inline def apply(): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendOptions]
  }
  
  extension [Self <: ChartLegendOptions](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDockInsidePlotArea(value: Boolean): Self = StObject.set(x, "dockInsidePlotArea", value.asInstanceOf[js.Any])
    
    inline def setDockInsidePlotAreaUndefined: Self = StObject.set(x, "dockInsidePlotArea", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setHorizontalAlign(value: String): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
    
    inline def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
    
    inline def setItemTextFormatter(value: /* e */ js.UndefOr[DataPoint] => String): Self = StObject.set(x, "itemTextFormatter", js.Any.fromFunction1(value))
    
    inline def setItemTextFormatterUndefined: Self = StObject.set(x, "itemTextFormatter", js.undefined)
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    inline def setItemWrap(value: Boolean): Self = StObject.set(x, "itemWrap", value.asInstanceOf[js.Any])
    
    inline def setItemWrapUndefined: Self = StObject.set(x, "itemWrap", js.undefined)
    
    inline def setItemclick(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemclick", js.Any.fromFunction1(value))
    
    inline def setItemclickUndefined: Self = StObject.set(x, "itemclick", js.undefined)
    
    inline def setItemmousemove(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemmousemove", js.Any.fromFunction1(value))
    
    inline def setItemmousemoveUndefined: Self = StObject.set(x, "itemmousemove", js.undefined)
    
    inline def setItemmouseout(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemmouseout", js.Any.fromFunction1(value))
    
    inline def setItemmouseoutUndefined: Self = StObject.set(x, "itemmouseout", js.undefined)
    
    inline def setItemmouseover(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemmouseover", js.Any.fromFunction1(value))
    
    inline def setItemmouseoverUndefined: Self = StObject.set(x, "itemmouseover", js.undefined)
    
    inline def setMarkerMargin(value: Double): Self = StObject.set(x, "markerMargin", value.asInstanceOf[js.Any])
    
    inline def setMarkerMarginUndefined: Self = StObject.set(x, "markerMargin", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
