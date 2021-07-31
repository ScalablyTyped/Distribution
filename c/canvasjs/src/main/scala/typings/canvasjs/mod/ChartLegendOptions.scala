package typings.canvasjs.mod

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
  def apply(): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendOptions]
  }
  
  @scala.inline
  implicit class ChartLegendOptionsMutableBuilder[Self <: ChartLegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDockInsidePlotArea(value: Boolean): Self = StObject.set(x, "dockInsidePlotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockInsidePlotAreaUndefined: Self = StObject.set(x, "dockInsidePlotArea", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHorizontalAlign(value: String): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
    
    @scala.inline
    def setItemMaxWidth(value: Double): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
    
    @scala.inline
    def setItemTextFormatter(value: /* e */ js.UndefOr[typings.canvasjs.anon.Chart] => String): Self = StObject.set(x, "itemTextFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemTextFormatterUndefined: Self = StObject.set(x, "itemTextFormatter", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    @scala.inline
    def setItemWrap(value: Boolean): Self = StObject.set(x, "itemWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWrapUndefined: Self = StObject.set(x, "itemWrap", js.undefined)
    
    @scala.inline
    def setItemclick(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemclickUndefined: Self = StObject.set(x, "itemclick", js.undefined)
    
    @scala.inline
    def setItemmousemove(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemmousemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemmousemoveUndefined: Self = StObject.set(x, "itemmousemove", js.undefined)
    
    @scala.inline
    def setItemmouseout(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemmouseoutUndefined: Self = StObject.set(x, "itemmouseout", js.undefined)
    
    @scala.inline
    def setItemmouseover(value: /* event */ ChartEvent => Unit): Self = StObject.set(x, "itemmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemmouseoverUndefined: Self = StObject.set(x, "itemmouseover", js.undefined)
    
    @scala.inline
    def setMarkerMargin(value: Double): Self = StObject.set(x, "markerMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMarginUndefined: Self = StObject.set(x, "markerMargin", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
