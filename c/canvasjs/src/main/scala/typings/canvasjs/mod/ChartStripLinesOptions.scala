package typings.canvasjs.mod

import typings.canvasjs.anon.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartStripLinesOptions extends StObject {
  
  /**
    * Sets the color of the stripLine.
    * Default: "orange"
    * Example: "green", "#23EA23"
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the point where the stripLine’s shaded region ends on the x-axis.
    * Default: null
    * Example: 50,60,200,300
    */
  var endValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the label of the stripLine. These are shown on top of axis labels.
    * Default: "" (empty string)
    * Example: "Threshold", "Deaths in 1920"
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * labelAlign allows you to place the stripline’s Label far, center or near the axis.
    * Default: “far”
    * Options: “far”, “center”, “near”
    */
  var labelAlign: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the background color of stripLine’s label.
    * Default: "#eeeeee"
    * Example: "red","#fabd76"
    */
  var labelBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font color of label.
    * Default: "orange"
    * Example: "blue","#4135e9"
    */
  var labelFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font-family of stripLine’s label. If the first font is not found in the system from the specified font-family list, it tries to use the next font in the list.
    * Default: "arial"
    * Example: "Arial, Trebuchet MS, Tahoma, sans-serif"
    */
  var labelFontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font size of the label in pixels.
    * Default: 12
    * Example: 18,19,20,22
    */
  var labelFontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the font style of stripLine’s label.
    * Default: "normal"
    * Example: "normal","italic","oblique"
    */
  var labelFontStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the font weight of stripLine’s label.
    * Default: "normal"
    * Example: "lighter","normal","bold","bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * A custom formatter function that returns stripLine’s label.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[Axis], String]] = js.undefined
  
  /**
    * labelMaxWidth defines the maximum width of labels after which they get wrapped or clipped depending on labelWrap’s value.
    * It overrides the labelMaxWidth value set at axis level.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: Double
  
  /**
    * labelPlacement allows you to place stripline’s Label either inside or outside of plotArea.
    * Default: “inside”
    * Options: “inside”, “outside”
    */
  var labelPlacement: js.UndefOr[String] = js.undefined
  
  /**
    * Setting labelWrap to true wraps the labels at labelMaxWidth. Clips the same when set to false. It overrides the labelWrap set at axis level.
    * Default: true
    * Example: true, false.
    */
  var labelWrap: Boolean
  
  /**
    * Sets the Dash Type for stripLine.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.undefined
  
  /**
    * Sets opacity of stripLine.
    * Default: null
    * Example: .1, .5, 1 etc.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * stripLine is displayed on top of dataPoints when showOnTop is set to true.
    * Default: false
    * Example: true, false
    */
  var showOnTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the point where the stripLine’s shaded region begins on the x-axis.
    * Default: null
    * Example: 20,30,100,50
    */
  var startValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the thickness of the stripLine in pixels.
    * Default: 2
    * Example: 2,4,5,6
    */
  var thickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the point where the stripLine has to be plotted or drawn along the axis X.
    * Default: null
    * Example: 20,30,100,50
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ChartStripLinesOptions {
  
  inline def apply(labelMaxWidth: Double, labelWrap: Boolean): ChartStripLinesOptions = {
    val __obj = js.Dynamic.literal(labelMaxWidth = labelMaxWidth.asInstanceOf[js.Any], labelWrap = labelWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStripLinesOptions]
  }
  
  extension [Self <: ChartStripLinesOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    inline def setLabelBackgroundColor(value: String): Self = StObject.set(x, "labelBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLabelBackgroundColorUndefined: Self = StObject.set(x, "labelBackgroundColor", js.undefined)
    
    inline def setLabelFontColor(value: String): Self = StObject.set(x, "labelFontColor", value.asInstanceOf[js.Any])
    
    inline def setLabelFontColorUndefined: Self = StObject.set(x, "labelFontColor", js.undefined)
    
    inline def setLabelFontFamily(value: String): Self = StObject.set(x, "labelFontFamily", value.asInstanceOf[js.Any])
    
    inline def setLabelFontFamilyUndefined: Self = StObject.set(x, "labelFontFamily", js.undefined)
    
    inline def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    inline def setLabelFontStyle(value: String): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    inline def setLabelFontWeight(value: String): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    inline def setLabelFormatter(value: /* e */ js.UndefOr[Axis] => String): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction1(value))
    
    inline def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    inline def setLabelMaxWidth(value: Double): Self = StObject.set(x, "labelMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacement(value: String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelWrap(value: Boolean): Self = StObject.set(x, "labelWrap", value.asInstanceOf[js.Any])
    
    inline def setLineDashType(value: DashType): Self = StObject.set(x, "lineDashType", value.asInstanceOf[js.Any])
    
    inline def setLineDashTypeUndefined: Self = StObject.set(x, "lineDashType", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShowOnTop(value: Boolean): Self = StObject.set(x, "showOnTop", value.asInstanceOf[js.Any])
    
    inline def setShowOnTopUndefined: Self = StObject.set(x, "showOnTop", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
