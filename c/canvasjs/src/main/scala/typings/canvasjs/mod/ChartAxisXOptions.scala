package typings.canvasjs.mod

import typings.canvasjs.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxisXOptions extends ChartAxisOptions {
  
  /**
    * Sets the Color of Grid Lines. Value of gridColor can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "red", "#FEFDDF" ..
    */
  var gridColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Dash Type for grid lines on axisX.
    * Default: solid
    */
  var gridDashType: js.UndefOr[DashType] = js.native
  
  /**
    * Sets the Thickness of Grid Lines. To display grid on Axis X, set the Grid Thickness to a number greater than zero.
    * Default: 0
    * Example: 2,4 ..
    */
  var gridThickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Interlacing Color that alternates between the set interval.
    * If the interval is not set explicitly, then the auto calculated interval is considered. The value of interlacedColor can be a “HTML Color Name” or “hex” code.
    * Default: null
    * Example: "#F8F1E4", "#FEFDDF"...
    */
  var interlacedColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the distance between Tick Marks, Grid Lines and Interlaced Colors.
    * Default: Automatically Calculated
    * Example: 50, 75..
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * intervalType is the unit of interval property.
    *  intervalType is by default set to "number" and hence you need to specify the interval type (eg "week", "month", etc) depending on the type of interval you intend to set.
    * If required interval is 3 months, you need to provide interval as 3 and intervalType as "month"
    * Default: Automatically handled when interval property is not set. Defaults to "number" when you set the interval.
    * Option: "number","millisecond" ,"second"," minute", "hour", "day", "month" ,"year"
    * Example: for interval as 15 minutes, set interval as 15, and set intervalType as "minute",
    */
  var intervalType: js.UndefOr[String] = js.native
  
  /**
    * Sets the angle for Axis Labels.
    * Notes:
    * 1.Units in degrees.
    * 2.Values can be positive or negative.
    * Default: null;
    * Example: 20, 45, -30..
    */
  var labelAngle: js.UndefOr[Double] = js.native
  
  /**
    * Setting labelAutoFit to true automatically wraps and/or rotates and/or reduces font size of label when they are too long and overlaps,
    * finds the best-fit and automatically manages label overlapping.
    * Default: true
    * Options: true, false
    */
  var labelAutoFit: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the Axis Label background color. The value of labelBackgroundColor can be a “HTML Color Name” or “hex” code.
    * Default: “transparent”
    * Example: “red”,”#fabd76″
    */
  var labelBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Axis Label color. The value of labelFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "grey"
    * Example: "red", "#FAC003" ..
    */
  var labelFontColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the Font Family of Axis labels.
    * Default: “calibri, optima, Candara, Verdana, Geneva, sans-serif”
    * Example: “calibri”, “tahoma”, “verdana” ..
    */
  var labelFontFamily: js.UndefOr[String] = js.native
  
  /**
    * Sets the Axis Label Font Size in pixels.
    * Default: Automatically Calculated based on Chart Size
    * Example: 16, 18, 22..
    */
  var labelFontSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the Font Style of Axis Labels. It can be set to one of the below options.
    * Default: "normal"
    * Options: "italic", "oblique", "normal"
    */
  var labelFontStyle: js.UndefOr[String] = js.native
  
  /**
    * Set the font Weight used in Axis Labels. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.native
  
  /**
    * A custom formatter function that returns label to be displayed on axisX.
    * Notes:
    * 1.labelFormatter function should return a string.
    * 2.You can use formatNumber and formatDate functions to format number/date values inside the formatter function.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ Label, String]] = js.native
  
  /**
    * Sets the maximum width of label after which it gets wrapped or clipped depending on whether labelWrap is set to true (default) or false.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * labelWrap specifies whether to wrap or clip label once its width crosses labelMaxWidth.
    * Default: true
    * Example: true, false
    */
  var labelWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the logarithm base for Axis X. Works only when logarithm property is set to true.
    * Default: 10
    * Options: 2, 16, Math.E, ..
    */
  var logarithmBase: js.UndefOr[Double] = js.native
  
  /**
    * Setting logarithmic property to true changes axis scale to logarithmic scale. Default Logarithm Base is 10 – which you can customize using logarithmBase property.
    * Default: false
    * Options: true, false
    */
  var logarithmic: js.UndefOr[Boolean] = js.native
  
  /**
    * A string that prepends all the labels on axisX.
    * Default: null
    * Example: "$","cat"..
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Setting reversed property to true shows axis in reverse order.
    * Default: false
    * Options: true, false
    */
  var reversed: js.UndefOr[Boolean] = js.native
  
  /**
    * Strip Lines / Trend Lines are vertical or horizontal lines used to highlight/mark a certain region on the plot area.
    * You can choose whether to draw a line at a specific position or shade a region on the plot area. Strip Lines are also referred to as Trend Lines.
    */
  var stripLines: js.UndefOr[ChartStripLinesOptions | js.Array[ChartStripLinesOptions]] = js.native
  
  /**
    * A string that appends all the labels on axisX.
    * Default: null
    * Example: "$","cat"..
    */
  var suffix: js.UndefOr[String] = js.native
  
  /**
    * Sets the color of Tick Marks drawn on the axis. The value of tickColor can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "red", "#006400".
    */
  var tickColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the length of Tick Marks that are drawn on the Axis.
    * Default: 5
    * Example: 10, 14..
    */
  var tickLength: js.UndefOr[Double] = js.native
  
  /**
    * Sets the thickness of the Tick Marks in pixels.
    * Default: 2
    * Example: 3, 4..
    */
  var tickThickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the maximum width of title after which it gets wrapped or clipped depending on whether titleWrap is set to true (default) or false.
    * Default: Automatically calculated based on the length of axis.
    * Example: 100, 200...
    */
  var titleMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * TitleWrap specifies whether to wrap or clip axis title once its width crosses titleMaxWidth.
    * Default: true
    * Options: true, false
    */
  var titleWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines how values must be formatted before they appear on Axis X.
    * You can format numbers and date time values using this property.
    * More Detail: https://canvasjs.com/docs/charts/chart-options/axisx/valueformatstring/
    */
  var valueFormatString: js.UndefOr[String] = js.native
}
object ChartAxisXOptions {
  
  @scala.inline
  def apply(): ChartAxisXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisXOptions]
  }
  
  @scala.inline
  implicit class ChartAxisXOptionsMutableBuilder[Self <: ChartAxisXOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
    
    @scala.inline
    def setGridDashType(value: DashType): Self = StObject.set(x, "gridDashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridDashTypeUndefined: Self = StObject.set(x, "gridDashType", js.undefined)
    
    @scala.inline
    def setGridThickness(value: Double): Self = StObject.set(x, "gridThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridThicknessUndefined: Self = StObject.set(x, "gridThickness", js.undefined)
    
    @scala.inline
    def setInterlacedColor(value: String): Self = StObject.set(x, "interlacedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlacedColorUndefined: Self = StObject.set(x, "interlacedColor", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalType(value: String): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setLabelAngle(value: Double): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
    
    @scala.inline
    def setLabelAutoFit(value: Boolean): Self = StObject.set(x, "labelAutoFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAutoFitUndefined: Self = StObject.set(x, "labelAutoFit", js.undefined)
    
    @scala.inline
    def setLabelBackgroundColor(value: String): Self = StObject.set(x, "labelBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelBackgroundColorUndefined: Self = StObject.set(x, "labelBackgroundColor", js.undefined)
    
    @scala.inline
    def setLabelFontColor(value: String): Self = StObject.set(x, "labelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontColorUndefined: Self = StObject.set(x, "labelFontColor", js.undefined)
    
    @scala.inline
    def setLabelFontFamily(value: String): Self = StObject.set(x, "labelFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontFamilyUndefined: Self = StObject.set(x, "labelFontFamily", js.undefined)
    
    @scala.inline
    def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    @scala.inline
    def setLabelFontStyle(value: String): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    @scala.inline
    def setLabelFontWeight(value: String): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    @scala.inline
    def setLabelFormatter(value: /* e */ Label => String): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    @scala.inline
    def setLabelMaxWidth(value: Double): Self = StObject.set(x, "labelMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMaxWidthUndefined: Self = StObject.set(x, "labelMaxWidth", js.undefined)
    
    @scala.inline
    def setLabelWrap(value: Boolean): Self = StObject.set(x, "labelWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWrapUndefined: Self = StObject.set(x, "labelWrap", js.undefined)
    
    @scala.inline
    def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    @scala.inline
    def setLogarithmic(value: Boolean): Self = StObject.set(x, "logarithmic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogarithmicUndefined: Self = StObject.set(x, "logarithmic", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setStripLines(value: ChartStripLinesOptions | js.Array[ChartStripLinesOptions]): Self = StObject.set(x, "stripLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripLinesUndefined: Self = StObject.set(x, "stripLines", js.undefined)
    
    @scala.inline
    def setStripLinesVarargs(value: ChartStripLinesOptions*): Self = StObject.set(x, "stripLines", js.Array(value :_*))
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setTickColor(value: String): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    @scala.inline
    def setTickThickness(value: Double): Self = StObject.set(x, "tickThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickThicknessUndefined: Self = StObject.set(x, "tickThickness", js.undefined)
    
    @scala.inline
    def setTitleMaxWidth(value: Double): Self = StObject.set(x, "titleMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleMaxWidthUndefined: Self = StObject.set(x, "titleMaxWidth", js.undefined)
    
    @scala.inline
    def setTitleWrap(value: Boolean): Self = StObject.set(x, "titleWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleWrapUndefined: Self = StObject.set(x, "titleWrap", js.undefined)
    
    @scala.inline
    def setValueFormatString(value: String): Self = StObject.set(x, "valueFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatStringUndefined: Self = StObject.set(x, "valueFormatString", js.undefined)
  }
}
