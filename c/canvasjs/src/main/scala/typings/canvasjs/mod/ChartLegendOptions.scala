package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegendOptions extends js.Object {
  /**
    * Sets the cursor type for legend items.
    * Default: "default"
    * Examples: "pointer", "crosshair" ..
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * When dockInsidePlotArea is set to true, legend renders inside the plot area there by giving more space to plot area.
    * Default: false
    * Example: true, false
    */
  var dockInsidePlotArea: js.UndefOr[Boolean] = js.native
  /**
    * Sets the font color of Legend Text . The value of fontColor can be a "HTML Color Name" or "hex" code .
    * Default: "black"
    * Example: "red", "#FAC003" ..
    */
  var fontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Font Family of Legend Text.
    * Default: "calibri"
    * Example: "arial" , "tahoma", "verdana" ..
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the font Size of Legend Text in pixels.
    * Default: 20
    * Example: 16,18,22 ..
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the fontStyle of Legend Text. fontStyle can be set to one of the below options.
    * Default: "normal"
    * Example: "normal", "italic" , "oblique"
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * Sets the Font Weight of Legend Text.
    * Default: "normal"
    * Example: "lighter", "normal", "bold" , "bolder"
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * This property lets you align the Legend Position horizontally.
    * Default: "right"
    * Example: "left", "right", "center"
    */
  var horizontalAlign: js.UndefOr[String] = js.native
  /**
    * Sets the maximum width of individual legend items after which they get wrapped or clipped depending on whether itemWrap is set to true (default) or false.
    * itemMaxWidth can’t be greater than maxWidth of legend.
    * Default: Automatically calculated based on the chart size.
    * Example: 100, 150, 200 etc.
    */
  var itemMaxWidth: js.UndefOr[Double] = js.native
  /**
    * A custom formatter function that returns text to be displayed inside individual legend items.
    */
  var itemTextFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[typings.canvasjs.anon.Chart], String]] = js.native
  /**
    * Sets the width of individual legend items after which the it gets wrapped or clipped depending on whether itemWrap is set to true (default) or false.
    * itemWidth can’t be greater than itemMaxWidth and maxWidth of legend.
    * Default: Automatically calculated based on chart size.
    * Example: 100, 200, 300 etc.
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * itemWrap specifies whether to wrap or clip legendText once its width crosses itemMaxWidth / maxWidth.
    * Default: true
    * Example: true, false
    */
  var itemWrap: js.UndefOr[Boolean] = js.native
  /**
    * Sets the click event handler for the legend, which is triggered when the user clicks on a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemclick: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mousemove event handler for the legend, which is triggered when the user moves the mouse(input device) within a legend item.
    * When the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmousemove: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mouseout event handler for the legend, which is triggered when the user moves the mouse pointer outside a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler.
    * Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmouseout: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the mouseover event handler for the legend, which is triggered when the user moves the mouse(input device) over a legend item.
    * After the event is triggered, the event related data is passed as a parameter to the assigned event handler. Parameters passed to the function are shown in the Event Object section below.
    * @param event a chart event
    */
  var itemmouseover: js.UndefOr[js.Function1[/* event */ ChartEvent, Unit]] = js.native
  /**
    * Sets the margin between marker and text of each item inside legend.
    * Default: Automatically calculated based on the chart size.
    * Example: 4,12 ..
    */
  var markerMargin: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum height of legend. Once the maximum height is reached, remaining legend items are not shown when horizontally stacked (while on top or bottom or plotArea)
    * and a new column is created when items are vertically stacked (when displayed to the left or right of plotArea).
    * Default: Automatically calculated based on chart size.
    * Example: 100,200, 300 etc.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum width of legend. If any item is longer than the maxWidth, it gets wrapped or clipped depending on the itemWrap property. itemWrap is true by default.
    * Whenever items are stacked horizontally, new items are moved to the next row once maxWidth is reached.
    * Default: Automatically calculated based on the chart size.
    * Example: 100, 200, 500 etc.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * Setting reversed property to true shows legend items in reverse order.
    * Default: false;
    * Example: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * This property lets you align the Legend Position vertically.
    * Default: "bottom"
    * Example: "top", "center", "bottom"
    */
  var verticalAlign: js.UndefOr[String] = js.native
}

object ChartLegendOptions {
  @scala.inline
  def apply(): ChartLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendOptions]
  }
  @scala.inline
  implicit class ChartLegendOptionsOps[Self <: ChartLegendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDockInsidePlotArea(value: Boolean): Self = this.set("dockInsidePlotArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDockInsidePlotArea: Self = this.set("dockInsidePlotArea", js.undefined)
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setHorizontalAlign(value: String): Self = this.set("horizontalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlign: Self = this.set("horizontalAlign", js.undefined)
    @scala.inline
    def setItemMaxWidth(value: Double): Self = this.set("itemMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemMaxWidth: Self = this.set("itemMaxWidth", js.undefined)
    @scala.inline
    def setItemTextFormatter(value: /* e */ js.UndefOr[typings.canvasjs.anon.Chart] => String): Self = this.set("itemTextFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemTextFormatter: Self = this.set("itemTextFormatter", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setItemWrap(value: Boolean): Self = this.set("itemWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWrap: Self = this.set("itemWrap", js.undefined)
    @scala.inline
    def setItemclick(value: /* event */ ChartEvent => Unit): Self = this.set("itemclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemclick: Self = this.set("itemclick", js.undefined)
    @scala.inline
    def setItemmousemove(value: /* event */ ChartEvent => Unit): Self = this.set("itemmousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemmousemove: Self = this.set("itemmousemove", js.undefined)
    @scala.inline
    def setItemmouseout(value: /* event */ ChartEvent => Unit): Self = this.set("itemmouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemmouseout: Self = this.set("itemmouseout", js.undefined)
    @scala.inline
    def setItemmouseover(value: /* event */ ChartEvent => Unit): Self = this.set("itemmouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemmouseover: Self = this.set("itemmouseover", js.undefined)
    @scala.inline
    def setMarkerMargin(value: Double): Self = this.set("markerMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerMargin: Self = this.set("markerMargin", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}

