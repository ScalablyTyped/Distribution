package typings.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisOptions extends js.Object {
  
  /**
    * Sets the color of Axis line. Axis line color can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "blue","#21AB13"..
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the dash type for axisY.
    * Default: "solid"
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  
  /**
    * Sets the Thickness of Axis line in pixels.
    * Default: 2
    * Example: 2, 4..
    */
  var lineThickness: js.UndefOr[Double] = js.native
  
  /**
    * This property lets you set margin between chart’s boundary and Axis.
    * Default: 2
    * Example: 8, 10..
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum value permitted on Axis. Values greater than maximum are clipped. maximum also set the upper limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var maximum: js.UndefOr[Double] = js.native
  
  /**
    * Sets the minimum value of Axis. Values smaller than minimum are clipped. minimum also sets the lower limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var minimum: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Axis Title.
    * Default: null
    * Example: "Axis X Title"
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Color of Axis Title. The value of titleFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "#666666"
    * Example: "red", "#006400" .
    */
  var titleFontColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Family of Axis Title.
    * Default: "arial"
    * Example: "calibri", "tahoma, "verdana" ..
    */
  var titleFontFamily: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Size of Axis Title in pixels.
    * Default: 20
    * Example: 16, 25 ..
    */
  var titleFontSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Font Style of Axis Title. It can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var titleFontStyle: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Weight used in the Axis Title. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var titleFontWeight: js.UndefOr[String] = js.native
  
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMaximum: js.UndefOr[Double] = js.native
  
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMinimum: js.UndefOr[Double] = js.native
}
object ChartAxisOptions {
  
  @scala.inline
  def apply(): ChartAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisOptions]
  }
  
  @scala.inline
  implicit class ChartAxisOptionsOps[Self <: ChartAxisOptions] (val x: Self) extends AnyVal {
    
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
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineDashType(value: DashType): Self = this.set("lineDashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashType: Self = this.set("lineDashType", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleFontColor(value: String): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontColor: Self = this.set("titleFontColor", js.undefined)
    
    @scala.inline
    def setTitleFontFamily(value: String): Self = this.set("titleFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontFamily: Self = this.set("titleFontFamily", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontStyle(value: String): Self = this.set("titleFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontStyle: Self = this.set("titleFontStyle", js.undefined)
    
    @scala.inline
    def setTitleFontWeight(value: String): Self = this.set("titleFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontWeight: Self = this.set("titleFontWeight", js.undefined)
    
    @scala.inline
    def setViewportMaximum(value: Double): Self = this.set("viewportMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportMaximum: Self = this.set("viewportMaximum", js.undefined)
    
    @scala.inline
    def setViewportMinimum(value: Double): Self = this.set("viewportMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportMinimum: Self = this.set("viewportMinimum", js.undefined)
  }
}
