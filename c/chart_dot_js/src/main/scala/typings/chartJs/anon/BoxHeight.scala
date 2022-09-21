package typings.chartJs.anon

import typings.chartJs.basicMod.AnyObject
import typings.chartJs.mod.ChartData
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.LegendItem
import typings.chartJs.mod.ScriptableAndScriptableOptions
import typings.chartJs.mod.ScriptableChartContext
import typings.chartJs.mod.TextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxHeight extends StObject {
  
  /**
    * Height of the coloured box.
    * @default fontSize
    */
  var boxHeight: Double
  
  /**
    * Padding between the color box and the text
    * @default 1
    */
  var boxPadding: Double
  
  /**
    * Width of colored box.
    * @default 40
    */
  var boxWidth: Double
  
  /**
    * Color of label
    * @see Defaults.color
    */
  var color: typings.chartJs.colorMod.Color
  
  /**
    * Filters legend items out of the legend. Receives 2 parameters, a Legend Item and the chart data
    */
  def filter(item: LegendItem, data: ChartData[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]): Boolean
  
  /**
    * Font of label
    * @see Defaults.font
    */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]
  
  /**
    * Generates legend items for each thing in the legend. Default implementation returns the text + styling for the color box. See Legend Item for details.
    */
  def generateLabels(chart: typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]): js.Array[LegendItem]
  
  /**
    * Padding between rows of colored boxes.
    * @default 10
    */
  var padding: Double
  
  /**
    * Override point style for the legend. Only applies if usePointStyle is true
    */
  var pointStyle: typings.chartJs.mod.PointStyle
  
  /**
    * Sorts the legend items
    */
  def sort(
    a: LegendItem,
    b: LegendItem,
    data: ChartData[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]
  ): Double
  
  /**
    * Text alignment
    */
  var textAlign: js.UndefOr[TextAlign] = js.undefined
  
  /**
    * Label style will match corresponding point style (size is based on the minimum value between boxWidth and font.size).
    * @default false
    */
  var usePointStyle: Boolean
}
object BoxHeight {
  
  inline def apply(
    boxHeight: Double,
    boxPadding: Double,
    boxWidth: Double,
    color: typings.chartJs.colorMod.Color,
    filter: (LegendItem, ChartData[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext],
    generateLabels: typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any] => js.Array[LegendItem],
    padding: Double,
    pointStyle: typings.chartJs.mod.PointStyle,
    sort: (LegendItem, LegendItem, ChartData[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Double,
    usePointStyle: Boolean
  ): BoxHeight = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight.asInstanceOf[js.Any], boxPadding = boxPadding.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), font = font.asInstanceOf[js.Any], generateLabels = js.Any.fromFunction1(generateLabels), padding = padding.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], sort = js.Any.fromFunction3(sort), usePointStyle = usePointStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxHeight]
  }
  
  extension [Self <: BoxHeight](x: Self) {
    
    inline def setBoxHeight(value: Double): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
    
    inline def setBoxPadding(value: Double): Self = StObject.set(x, "boxPadding", value.asInstanceOf[js.Any])
    
    inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.chartJs.colorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFilter(
      value: (LegendItem, ChartData[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableChartContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setGenerateLabels(
      value: typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any] => js.Array[LegendItem]
    ): Self = StObject.set(x, "generateLabels", js.Any.fromFunction1(value))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: typings.chartJs.mod.PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setSort(
      value: (LegendItem, LegendItem, ChartData[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any]) => Double
    ): Self = StObject.set(x, "sort", js.Any.fromFunction3(value))
    
    inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setUsePointStyle(value: Boolean): Self = StObject.set(x, "usePointStyle", value.asInstanceOf[js.Any])
  }
}
