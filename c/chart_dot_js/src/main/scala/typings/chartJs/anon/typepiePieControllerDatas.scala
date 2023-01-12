package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.doughnut
import typings.chartJs.chartJsStrings.inner
import typings.chartJs.chartJsStrings.pie
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.AnimationsSpec
import typings.chartJs.mod.ArcBorderRadius
import typings.chartJs.mod.ScriptableAndArray
import typings.chartJs.mod.ScriptableContext
import typings.chartJs.mod.TransitionsSpec
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesGeometricMod.ChartArea
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'pie'} & chart.js.chart.js.PieControllerDatasetOptions */
trait typepiePieControllerDatas extends StObject {
  
  var animation: `false` | AnimationSpecdoughnutonPr
  
  var animations: AnimationsSpec[doughnut]
  
  var backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]
  
  var borderAlign: ScriptableAndArray[center | inner, ScriptableContext[doughnut]]
  
  var borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]
  
  var borderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[doughnut]]
  
  var borderRadius: ScriptableAndArray[Double | ArcBorderRadius, ScriptableContext[doughnut]]
  
  var borderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]]
  
  var circular: ScriptableAndArray[Boolean, ScriptableContext[doughnut]]
  
  /**
    * Sweep to allow arcs to cover.
    * @default 360
    */
  var circumference: Double
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  /**
    * Configures the visibility state of the dataset. Set it to true, to hide the dataset from the chart.
    * @default false
    */
  var hidden: Boolean
  
  var hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]
  
  var hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]
  
  var hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]]
  
  var hoverOffset: ScriptableAndArray[Double, ScriptableContext[doughnut]]
  
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
    * Arc offset (in pixels).
    */
  var offset: Double
  
  /**
    * The drawing order of dataset. Also affects order for stacking, tooltip and legend.
    */
  var order: Double
  
  /**
    * How to parse the dataset. The parsing can be disabled by specifying parsing: false at chart options or dataset. If parsing is disabled, data must be sorted and in the formats the associated chart type and scales use internally.
    */
  var parsing: StringDictionary[String] | `false`
  
  /**
    * Starting angle to draw this dataset from.
    * @default 0
    */
  var rotation: Double
  
  /**
    * Similar to the `offset` option, but applies to all arcs. This can be used to to add spaces
    * between arcs
    * @default 0
    */
  var spacing: Double
  
  /**
    * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack).
    */
  var stack: String
  
  var transitions: TransitionsSpec[doughnut]
  
  var `type`: pie
  
  /**
    * The relative thickness of the dataset. Providing a value for weight will cause the pie or doughnut dataset to be drawn with a thickness relative to the sum of all the dataset weight values.
    * @default 1
    */
  var weight: Double
}
object typepiePieControllerDatas {
  
  inline def apply(
    animation: `false` | AnimationSpecdoughnutonPr,
    animations: AnimationsSpec[doughnut],
    backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]],
    borderAlign: ScriptableAndArray[center | inner, ScriptableContext[doughnut]],
    borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]],
    borderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[doughnut]],
    borderRadius: ScriptableAndArray[Double | ArcBorderRadius, ScriptableContext[doughnut]],
    borderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    circular: ScriptableAndArray[Boolean, ScriptableContext[doughnut]],
    circumference: Double,
    clip: Double | ChartArea | `false`,
    hidden: Boolean,
    hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]],
    hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    hoverOffset: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    offset: Double,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    rotation: Double,
    spacing: Double,
    stack: String,
    transitions: TransitionsSpec[doughnut],
    weight: Double
  ): typepiePieControllerDatas = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], circumference = circumference.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverOffset = hoverOffset.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pie")
    __obj.asInstanceOf[typepiePieControllerDatas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typepiePieControllerDatas] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: `false` | AnimationSpecdoughnutonPr): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[doughnut]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBorderAlign(value: ScriptableAndArray[center | inner, ScriptableContext[doughnut]]): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    inline def setBorderAlignFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[center | inner]): Self = StObject.set(x, "borderAlign", js.Any.fromFunction2(value))
    
    inline def setBorderAlignVarargs(value: (center | inner)*): Self = StObject.set(x, "borderAlign", js.Array(value*))
    
    inline def setBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "borderColor", js.Array(value*))
    
    inline def setBorderJoinStyle(value: ScriptableAndArray[CanvasLineJoin, ScriptableContext[doughnut]]): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderJoinStyleFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[CanvasLineJoin]): Self = StObject.set(x, "borderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setBorderJoinStyleVarargs(value: CanvasLineJoin*): Self = StObject.set(x, "borderJoinStyle", js.Array(value*))
    
    inline def setBorderRadius(value: ScriptableAndArray[Double | ArcBorderRadius, ScriptableContext[doughnut]]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusFunction2(
      value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Double | ArcBorderRadius]
    ): Self = StObject.set(x, "borderRadius", js.Any.fromFunction2(value))
    
    inline def setBorderRadiusVarargs(value: (Double | ArcBorderRadius)*): Self = StObject.set(x, "borderRadius", js.Array(value*))
    
    inline def setBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[doughnut]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthVarargs(value: Double*): Self = StObject.set(x, "borderWidth", js.Array(value*))
    
    inline def setCircular(value: ScriptableAndArray[Boolean, ScriptableContext[doughnut]]): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    inline def setCircularFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "circular", js.Any.fromFunction2(value))
    
    inline def setCircularVarargs(value: Boolean*): Self = StObject.set(x, "circular", js.Array(value*))
    
    inline def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorFunction2(
      value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBackgroundColor", js.Array(value*))
    
    inline def setHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[doughnut]]): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColorFunction2(
      value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBorderColor", js.Array(value*))
    
    inline def setHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[doughnut]]): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidthFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "hoverBorderWidth", js.Array(value*))
    
    inline def setHoverOffset(value: ScriptableAndArray[Double, ScriptableContext[doughnut]]): Self = StObject.set(x, "hoverOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverOffsetFunction2(value: (ScriptableContext[doughnut], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverOffset", js.Any.fromFunction2(value))
    
    inline def setHoverOffsetVarargs(value: Double*): Self = StObject.set(x, "hoverOffset", js.Array(value*))
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: TransitionsSpec[doughnut]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setType(value: pie): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
