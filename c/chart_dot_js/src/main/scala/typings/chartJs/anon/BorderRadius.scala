package typings.chartJs.anon

import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartData
import typings.chartJs.distTypesIndexMod.LegendItem
import typings.chartJs.distTypesIndexMod.ScriptableAndScriptableOptions
import typings.chartJs.distTypesIndexMod.ScriptableChartContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadius extends StObject {
  
  /**
    * Override the borderRadius to use.
    * @default undefined
    */
  var borderRadius: Double
  
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
  var color: typings.chartJs.distTypesColorMod.Color
  
  /**
    * Filters legend items out of the legend. Receives 2 parameters, a Legend Item and the chart data
    */
  def filter(
    item: LegendItem,
    data: ChartData[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ]
  ): Boolean
  
  /**
    * Font of label
    * @see Defaults.font
    */
  var font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]
  
  /**
    * Generates legend items for each thing in the legend. Default implementation returns the text + styling for the color box. See Legend Item for details.
    */
  def generateLabels(
    chart: typings.chartJs.distTypesIndexMod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ]
  ): js.Array[LegendItem]
  
  /**
    * Padding between rows of colored boxes.
    * @default 10
    */
  var padding: Double
  
  /**
    * Override point style for the legend. Only applies if usePointStyle is true
    */
  var pointStyle: typings.chartJs.distTypesIndexMod.PointStyle
  
  /**
    * Sorts the legend items
    */
  def sort(
    a: LegendItem,
    b: LegendItem,
    data: ChartData[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ]
  ): Double
  
  /**
    * Text alignment
    */
  var textAlign: js.UndefOr[typings.chartJs.distTypesIndexMod.TextAlign] = js.undefined
  
  /**
    * Label borderRadius will match corresponding borderRadius.
    * @default false
    */
  var useBorderRadius: Boolean
  
  /**
    * Label style will match corresponding point style (size is based on the minimum value between boxWidth and font.size).
    * @default false
    */
  var usePointStyle: Boolean
}
object BorderRadius {
  
  inline def apply(
    borderRadius: Double,
    boxHeight: Double,
    boxPadding: Double,
    boxWidth: Double,
    color: typings.chartJs.distTypesColorMod.Color,
    filter: (LegendItem, ChartData[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ]) => Boolean,
    font: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext],
    generateLabels: typings.chartJs.distTypesIndexMod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ] => js.Array[LegendItem],
    padding: Double,
    pointStyle: typings.chartJs.distTypesIndexMod.PointStyle,
    sort: (LegendItem, LegendItem, ChartData[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ]) => Double,
    useBorderRadius: Boolean,
    usePointStyle: Boolean
  ): BorderRadius = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], boxHeight = boxHeight.asInstanceOf[js.Any], boxPadding = boxPadding.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), font = font.asInstanceOf[js.Any], generateLabels = js.Any.fromFunction1(generateLabels), padding = padding.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], sort = js.Any.fromFunction3(sort), useBorderRadius = useBorderRadius.asInstanceOf[js.Any], usePointStyle = usePointStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderRadius] (val x: Self) extends AnyVal {
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBoxHeight(value: Double): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
    
    inline def setBoxPadding(value: Double): Self = StObject.set(x, "boxPadding", value.asInstanceOf[js.Any])
    
    inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.chartJs.distTypesColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFilter(
      value: (LegendItem, ChartData[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableChartContext]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontFunction2(value: (ScriptableChartContext, /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "font", js.Any.fromFunction2(value))
    
    inline def setGenerateLabels(
      value: typings.chartJs.distTypesIndexMod.Chart[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ] => js.Array[LegendItem]
    ): Self = StObject.set(x, "generateLabels", js.Any.fromFunction1(value))
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: typings.chartJs.distTypesIndexMod.PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setSort(
      value: (LegendItem, LegendItem, ChartData[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ]) => Double
    ): Self = StObject.set(x, "sort", js.Any.fromFunction3(value))
    
    inline def setTextAlign(value: typings.chartJs.distTypesIndexMod.TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setUseBorderRadius(value: Boolean): Self = StObject.set(x, "useBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setUsePointStyle(value: Boolean): Self = StObject.set(x, "usePointStyle", value.asInstanceOf[js.Any])
  }
}
