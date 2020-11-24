package typings.canvasjs.mod

import typings.canvasjs.anon.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartStripLinesOptions extends js.Object {
  
  /**
    * Sets the color of the stripLine.
    * Default: "orange"
    * Example: "green", "#23EA23"
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Sets the point where the stripLine’s shaded region ends on the x-axis.
    * Default: null
    * Example: 50,60,200,300
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /**
    * Sets the label of the stripLine. These are shown on top of axis labels.
    * Default: "" (empty string)
    * Example: "Threshold", "Deaths in 1920"
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * labelAlign allows you to place the stripline’s Label far, center or near the axis.
    * Default: “far”
    * Options: “far”, “center”, “near”
    */
  var labelAlign: js.UndefOr[String] = js.native
  
  /**
    * Sets the background color of stripLine’s label.
    * Default: "#eeeeee"
    * Example: "red","#fabd76"
    */
  var labelBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the font color of label.
    * Default: "orange"
    * Example: "blue","#4135e9"
    */
  var labelFontColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the font-family of stripLine’s label. If the first font is not found in the system from the specified font-family list, it tries to use the next font in the list.
    * Default: "arial"
    * Example: "Arial, Trebuchet MS, Tahoma, sans-serif"
    */
  var labelFontFamily: js.UndefOr[String] = js.native
  
  /**
    * Sets the font size of the label in pixels.
    * Default: 12
    * Example: 18,19,20,22
    */
  var labelFontSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the font style of stripLine’s label.
    * Default: "normal"
    * Example: "normal","italic","oblique"
    */
  var labelFontStyle: js.UndefOr[String] = js.native
  
  /**
    * Sets the font weight of stripLine’s label.
    * Default: "normal"
    * Example: "lighter","normal","bold","bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.native
  
  /**
    * A custom formatter function that returns stripLine’s label.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[Axis], String]] = js.native
  
  /**
    * labelMaxWidth defines the maximum width of labels after which they get wrapped or clipped depending on labelWrap’s value.
    * It overrides the labelMaxWidth value set at axis level.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: Double = js.native
  
  /**
    * labelPlacement allows you to place stripline’s Label either inside or outside of plotArea.
    * Default: “inside”
    * Options: “inside”, “outside”
    */
  var labelPlacement: js.UndefOr[String] = js.native
  
  /**
    * Setting labelWrap to true wraps the labels at labelMaxWidth. Clips the same when set to false. It overrides the labelWrap set at axis level.
    * Default: true
    * Example: true, false.
    */
  var labelWrap: Boolean = js.native
  
  /**
    * Sets the Dash Type for stripLine.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  
  /**
    * Sets opacity of stripLine.
    * Default: null
    * Example: .1, .5, 1 etc.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * stripLine is displayed on top of dataPoints when showOnTop is set to true.
    * Default: false
    * Example: true, false
    */
  var showOnTop: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the point where the stripLine’s shaded region begins on the x-axis.
    * Default: null
    * Example: 20,30,100,50
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /**
    * Sets the thickness of the stripLine in pixels.
    * Default: 2
    * Example: 2,4,5,6
    */
  var thickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the point where the stripLine has to be plotted or drawn along the axis X.
    * Default: null
    * Example: 20,30,100,50
    */
  var value: js.UndefOr[Double] = js.native
}
object ChartStripLinesOptions {
  
  @scala.inline
  def apply(labelMaxWidth: Double, labelWrap: Boolean): ChartStripLinesOptions = {
    val __obj = js.Dynamic.literal(labelMaxWidth = labelMaxWidth.asInstanceOf[js.Any], labelWrap = labelWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStripLinesOptions]
  }
  
  @scala.inline
  implicit class ChartStripLinesOptionsOps[Self <: ChartStripLinesOptions] (val x: Self) extends AnyVal {
    
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
    def setLabelMaxWidth(value: Double): Self = this.set("labelMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWrap(value: Boolean): Self = this.set("labelWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: String): Self = this.set("labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAlign: Self = this.set("labelAlign", js.undefined)
    
    @scala.inline
    def setLabelBackgroundColor(value: String): Self = this.set("labelBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBackgroundColor: Self = this.set("labelBackgroundColor", js.undefined)
    
    @scala.inline
    def setLabelFontColor(value: String): Self = this.set("labelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontColor: Self = this.set("labelFontColor", js.undefined)
    
    @scala.inline
    def setLabelFontFamily(value: String): Self = this.set("labelFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontFamily: Self = this.set("labelFontFamily", js.undefined)
    
    @scala.inline
    def setLabelFontSize(value: Double): Self = this.set("labelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontSize: Self = this.set("labelFontSize", js.undefined)
    
    @scala.inline
    def setLabelFontStyle(value: String): Self = this.set("labelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontStyle: Self = this.set("labelFontStyle", js.undefined)
    
    @scala.inline
    def setLabelFontWeight(value: String): Self = this.set("labelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFontWeight: Self = this.set("labelFontWeight", js.undefined)
    
    @scala.inline
    def setLabelFormatter(value: /* e */ js.UndefOr[Axis] => String): Self = this.set("labelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLabelFormatter: Self = this.set("labelFormatter", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: String): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    
    @scala.inline
    def setLineDashType(value: DashType): Self = this.set("lineDashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashType: Self = this.set("lineDashType", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setShowOnTop(value: Boolean): Self = this.set("showOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnTop: Self = this.set("showOnTop", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = this.set("startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
