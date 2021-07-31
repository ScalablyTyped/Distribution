package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAxisOptions extends StObject {
  
  /**
    * Sets the color of Axis line. Axis line color can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "blue","#21AB13"..
    */
  var lineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the dash type for axisY.
    * Default: "solid"
    */
  var lineDashType: js.UndefOr[DashType] = js.undefined
  
  /**
    * Sets the Thickness of Axis line in pixels.
    * Default: 2
    * Example: 2, 4..
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * This property lets you set margin between chart’s boundary and Axis.
    * Default: 2
    * Example: 8, 10..
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the maximum value permitted on Axis. Values greater than maximum are clipped. maximum also set the upper limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var maximum: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the minimum value of Axis. Values smaller than minimum are clipped. minimum also sets the lower limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var minimum: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Axis Title.
    * Default: null
    * Example: "Axis X Title"
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Color of Axis Title. The value of titleFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "#666666"
    * Example: "red", "#006400" .
    */
  var titleFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Family of Axis Title.
    * Default: "arial"
    * Example: "calibri", "tahoma, "verdana" ..
    */
  var titleFontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Size of Axis Title in pixels.
    * Default: 20
    * Example: 16, 25 ..
    */
  var titleFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the Font Style of Axis Title. It can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var titleFontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the Font Weight used in the Axis Title. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var titleFontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMinimum: js.UndefOr[Double] = js.undefined
}
object ChartAxisOptions {
  
  @scala.inline
  def apply(): ChartAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisOptions]
  }
  
  @scala.inline
  implicit class ChartAxisOptionsMutableBuilder[Self <: ChartAxisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineDashType(value: DashType): Self = StObject.set(x, "lineDashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashTypeUndefined: Self = StObject.set(x, "lineDashType", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontColor(value: String): Self = StObject.set(x, "titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontColorUndefined: Self = StObject.set(x, "titleFontColor", js.undefined)
    
    @scala.inline
    def setTitleFontFamily(value: String): Self = StObject.set(x, "titleFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontFamilyUndefined: Self = StObject.set(x, "titleFontFamily", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontStyle(value: String): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
    
    @scala.inline
    def setTitleFontWeight(value: String): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setViewportMaximum(value: Double): Self = StObject.set(x, "viewportMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportMaximumUndefined: Self = StObject.set(x, "viewportMaximum", js.undefined)
    
    @scala.inline
    def setViewportMinimum(value: Double): Self = StObject.set(x, "viewportMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportMinimumUndefined: Self = StObject.set(x, "viewportMinimum", js.undefined)
  }
}
