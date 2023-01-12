package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.bubble
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.ScriptableAndArray
import typings.chartJs.mod.ScriptableContext
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'bubble'} & chart.js.chart.js.BubbleControllerDatasetOptions */
trait typebubbleBubbleControlle extends StObject {
  
  var backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]
  
  var borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]
  
  var borderWidth: ScriptableAndArray[Double, ScriptableContext[bubble]]
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  var drawActiveElementsOnTop: ScriptableAndArray[Boolean, ScriptableContext[bubble]]
  
  /**
    * Configures the visibility state of the dataset. Set it to true, to hide the dataset from the chart.
    * @default false
    */
  var hidden: Boolean
  
  var hitRadius: ScriptableAndArray[Double, ScriptableContext[bubble]]
  
  var hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]
  
  var hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]
  
  var hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[bubble]]
  
  var hoverRadius: ScriptableAndArray[Double, ScriptableContext[bubble]]
  
  /**
    * The base axis of the chart. 'x' for vertical charts and 'y' for horizontal charts.
    * @default 'x'
    */
  var indexAxis: x | y
  
  /**
    * The label for the dataset which appears in the legend and tooltips.
    */
  var label: String
  
  /**
    * Chart.js is fastest if you provide data with indices that are unique, sorted, and consistent across datasets and provide the normalized: true option to let Chart.js know that you have done so.
    */
  var normalized: Boolean
  
  /**
    * The drawing order of dataset. Also affects order for stacking, tooltip and legend.
    */
  var order: Double
  
  /**
    * How to parse the dataset. The parsing can be disabled by specifying parsing: false at chart options or dataset. If parsing is disabled, data must be sorted and in the formats the associated chart type and scales use internally.
    */
  var parsing: StringDictionary[String] | `false`
  
  var pointStyle: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[bubble]]
  
  var radius: ScriptableAndArray[Double, ScriptableContext[bubble]]
  
  var rotation: ScriptableAndArray[Double, ScriptableContext[bubble]]
  
  /**
    * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack).
    */
  var stack: String
  
  var `type`: bubble
}
object typebubbleBubbleControlle {
  
  inline def apply(
    backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]],
    borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]],
    borderWidth: ScriptableAndArray[Double, ScriptableContext[bubble]],
    clip: Double | ChartArea | `false`,
    drawActiveElementsOnTop: ScriptableAndArray[Boolean, ScriptableContext[bubble]],
    hidden: Boolean,
    hitRadius: ScriptableAndArray[Double, ScriptableContext[bubble]],
    hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]],
    hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[bubble]],
    hoverRadius: ScriptableAndArray[Double, ScriptableContext[bubble]],
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    pointStyle: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[bubble]],
    radius: ScriptableAndArray[Double, ScriptableContext[bubble]],
    rotation: ScriptableAndArray[Double, ScriptableContext[bubble]],
    stack: String
  ): typebubbleBubbleControlle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], drawActiveElementsOnTop = drawActiveElementsOnTop.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverRadius = hoverRadius.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bubble")
    __obj.asInstanceOf[typebubbleBubbleControlle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typebubbleBubbleControlle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "borderColor", js.Array(value*))
    
    inline def setBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[bubble]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthVarargs(value: Double*): Self = StObject.set(x, "borderWidth", js.Array(value*))
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setDrawActiveElementsOnTop(value: ScriptableAndArray[Boolean, ScriptableContext[bubble]]): Self = StObject.set(x, "drawActiveElementsOnTop", value.asInstanceOf[js.Any])
    
    inline def setDrawActiveElementsOnTopFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "drawActiveElementsOnTop", js.Any.fromFunction2(value))
    
    inline def setDrawActiveElementsOnTopVarargs(value: Boolean*): Self = StObject.set(x, "drawActiveElementsOnTop", js.Array(value*))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHitRadius(value: ScriptableAndArray[Double, ScriptableContext[bubble]]): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    inline def setHitRadiusFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hitRadius", js.Any.fromFunction2(value))
    
    inline def setHitRadiusVarargs(value: Double*): Self = StObject.set(x, "hitRadius", js.Array(value*))
    
    inline def setHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorFunction2(
      value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBackgroundColor", js.Array(value*))
    
    inline def setHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bubble]]): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColorFunction2(
      value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBorderColor", js.Array(value*))
    
    inline def setHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[bubble]]): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidthFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "hoverBorderWidth", js.Array(value*))
    
    inline def setHoverRadius(value: ScriptableAndArray[Double, ScriptableContext[bubble]]): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
    
    inline def setHoverRadiusFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverRadius", js.Any.fromFunction2(value))
    
    inline def setHoverRadiusVarargs(value: Double*): Self = StObject.set(x, "hoverRadius", js.Array(value*))
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[bubble]]): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleFunction2(
      value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[typings.chartJs.mod.PointStyle]
    ): Self = StObject.set(x, "pointStyle", js.Any.fromFunction2(value))
    
    inline def setPointStyleVarargs(value: typings.chartJs.mod.PointStyle*): Self = StObject.set(x, "pointStyle", js.Array(value*))
    
    inline def setRadius(value: ScriptableAndArray[Double, ScriptableContext[bubble]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "radius", js.Any.fromFunction2(value))
    
    inline def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value*))
    
    inline def setRotation(value: ScriptableAndArray[Double, ScriptableContext[bubble]]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationFunction2(value: (ScriptableContext[bubble], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "rotation", js.Any.fromFunction2(value))
    
    inline def setRotationVarargs(value: Double*): Self = StObject.set(x, "rotation", js.Array(value*))
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setType(value: bubble): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
