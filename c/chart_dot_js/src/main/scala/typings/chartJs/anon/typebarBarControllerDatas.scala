package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.bar
import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.end
import typings.chartJs.chartJsStrings.flex
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.start
import typings.chartJs.chartJsStrings.top
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.AnimationsSpec
import typings.chartJs.mod.BorderRadius
import typings.chartJs.mod.ScriptableAndArray
import typings.chartJs.mod.ScriptableContext
import typings.chartJs.mod.TransitionsSpec
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'bar'} & chart.js.chart.js.BarControllerDatasetOptions */
trait typebarBarControllerDatas extends StObject {
  
  var animation: `false` | AnimationSpecbaronProgres
  
  var animations: AnimationsSpec[bar]
  
  var backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]
  
  /**
    * Percent (0-1) of the available width each bar should be within the category width. 1.0 will take the whole category width and put the bars right next to each other.
    * @default 0.9
    */
  var barPercentage: Double
  
  /**
    * Manually set width of each bar in pixels. If set to 'flex', it computes "optimal" sample widths that globally arrange bars side by side. If not set (default), bars are equally sized based on the smallest interval.
    */
  var barThickness: Double | flex
  
  var base: ScriptableAndArray[Double, ScriptableContext[bar]]
  
  var borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]
  
  var borderRadius: ScriptableAndArray[Double | BorderRadius, ScriptableContext[bar]]
  
  var borderSkipped: ScriptableAndArray[
    start | end | left | right | bottom | top | middle | Boolean, 
    ScriptableContext[bar]
  ]
  
  var borderWidth: ScriptableAndArray[Double | Right, ScriptableContext[bar]]
  
  /**
    * Percent (0-1) of the available width each category should be within the sample width.
    * @default 0.8
    */
  var categoryPercentage: Double
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  /**
    * Configures the visibility state of the dataset. Set it to true, to hide the dataset from the chart.
    * @default false
    */
  var hidden: Boolean
  
  var hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]
  
  var hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]
  
  var hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[bar]]
  
  /**
    * The base axis of the chart. 'x' for vertical charts and 'y' for horizontal charts.
    * @default 'x'
    */
  var indexAxis: x | y
  
  var inflateAmount: ScriptableAndArray[Double | auto, ScriptableContext[bar]]
  
  /**
    * The label for the dataset which appears in the legend and tooltips.
    */
  var label: String
  
  /**
    * Set this to ensure that bars are not sized thicker than this.
    */
  var maxBarThickness: Double
  
  /**
    * Set this to ensure that bars have a minimum length in pixels.
    */
  var minBarLength: Double
  
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
  
  /**
    * Point style for the legend
    * @default 'circle;
    */
  var pointStyle: typings.chartJs.mod.PointStyle
  
  /**
    * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack).
    */
  var stack: String
  
  var transitions: TransitionsSpec[bar]
  
  var `type`: bar
  
  /**
    * The ID of the x axis to plot this dataset on.
    */
  var xAxisID: String
  
  /**
    * The ID of the y axis to plot this dataset on.
    */
  var yAxisID: String
}
object typebarBarControllerDatas {
  
  inline def apply(
    animation: `false` | AnimationSpecbaronProgres,
    animations: AnimationsSpec[bar],
    backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]],
    barPercentage: Double,
    barThickness: Double | flex,
    base: ScriptableAndArray[Double, ScriptableContext[bar]],
    borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]],
    borderRadius: ScriptableAndArray[Double | BorderRadius, ScriptableContext[bar]],
    borderSkipped: ScriptableAndArray[
      start | end | left | right | bottom | top | middle | Boolean, 
      ScriptableContext[bar]
    ],
    borderWidth: ScriptableAndArray[Double | Right, ScriptableContext[bar]],
    categoryPercentage: Double,
    clip: Double | ChartArea | `false`,
    hidden: Boolean,
    hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]],
    hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[bar]],
    indexAxis: x | y,
    inflateAmount: ScriptableAndArray[Double | auto, ScriptableContext[bar]],
    label: String,
    maxBarThickness: Double,
    minBarLength: Double,
    normalized: Boolean,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    pointStyle: typings.chartJs.mod.PointStyle,
    stack: String,
    transitions: TransitionsSpec[bar],
    xAxisID: String,
    yAxisID: String
  ): typebarBarControllerDatas = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], barPercentage = barPercentage.asInstanceOf[js.Any], barThickness = barThickness.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderSkipped = borderSkipped.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], categoryPercentage = categoryPercentage.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], inflateAmount = inflateAmount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxBarThickness = maxBarThickness.asInstanceOf[js.Any], minBarLength = minBarLength.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], xAxisID = xAxisID.asInstanceOf[js.Any], yAxisID = yAxisID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bar")
    __obj.asInstanceOf[typebarBarControllerDatas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typebarBarControllerDatas] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: `false` | AnimationSpecbaronProgres): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[bar]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBarPercentage(value: Double): Self = StObject.set(x, "barPercentage", value.asInstanceOf[js.Any])
    
    inline def setBarThickness(value: Double | flex): Self = StObject.set(x, "barThickness", value.asInstanceOf[js.Any])
    
    inline def setBase(value: ScriptableAndArray[Double, ScriptableContext[bar]]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseFunction2(value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "base", js.Any.fromFunction2(value))
    
    inline def setBaseVarargs(value: Double*): Self = StObject.set(x, "base", js.Array(value*))
    
    inline def setBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "borderColor", js.Array(value*))
    
    inline def setBorderRadius(value: ScriptableAndArray[Double | BorderRadius, ScriptableContext[bar]]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusFunction2(value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[Double | BorderRadius]): Self = StObject.set(x, "borderRadius", js.Any.fromFunction2(value))
    
    inline def setBorderRadiusVarargs(value: (Double | BorderRadius)*): Self = StObject.set(x, "borderRadius", js.Array(value*))
    
    inline def setBorderSkipped(
      value: ScriptableAndArray[
          start | end | left | right | bottom | top | middle | Boolean, 
          ScriptableContext[bar]
        ]
    ): Self = StObject.set(x, "borderSkipped", value.asInstanceOf[js.Any])
    
    inline def setBorderSkippedFunction2(
      value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[start | end | left | right | bottom | top | middle | Boolean]
    ): Self = StObject.set(x, "borderSkipped", js.Any.fromFunction2(value))
    
    inline def setBorderSkippedVarargs(value: (start | end | left | right | bottom | top | middle | Boolean)*): Self = StObject.set(x, "borderSkipped", js.Array(value*))
    
    inline def setBorderWidth(value: ScriptableAndArray[Double | Right, ScriptableContext[bar]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[Double | Right]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthVarargs(value: (Double | Right)*): Self = StObject.set(x, "borderWidth", js.Array(value*))
    
    inline def setCategoryPercentage(value: Double): Self = StObject.set(x, "categoryPercentage", value.asInstanceOf[js.Any])
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorFunction2(
      value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBackgroundColor", js.Array(value*))
    
    inline def setHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[bar]]): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColorFunction2(
      value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBorderColor", js.Array(value*))
    
    inline def setHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[bar]]): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidthFunction2(value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "hoverBorderWidth", js.Array(value*))
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setInflateAmount(value: ScriptableAndArray[Double | auto, ScriptableContext[bar]]): Self = StObject.set(x, "inflateAmount", value.asInstanceOf[js.Any])
    
    inline def setInflateAmountFunction2(value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[Double | auto]): Self = StObject.set(x, "inflateAmount", js.Any.fromFunction2(value))
    
    inline def setInflateAmountVarargs(value: (Double | auto)*): Self = StObject.set(x, "inflateAmount", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaxBarThickness(value: Double): Self = StObject.set(x, "maxBarThickness", value.asInstanceOf[js.Any])
    
    inline def setMinBarLength(value: Double): Self = StObject.set(x, "minBarLength", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setPointStyle(value: typings.chartJs.mod.PointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: TransitionsSpec[bar]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setType(value: bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxisID(value: String): Self = StObject.set(x, "xAxisID", value.asInstanceOf[js.Any])
    
    inline def setYAxisID(value: String): Self = StObject.set(x, "yAxisID", value.asInstanceOf[js.Any])
  }
}
