package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.after
import typings.chartJs.chartJsStrings.before
import typings.chartJs.chartJsStrings.default
import typings.chartJs.chartJsStrings.line
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.chartJsStrings.monotone
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.AnimationsSpec
import typings.chartJs.mod.ComplexFillTarget
import typings.chartJs.mod.FillTarget
import typings.chartJs.mod.Scriptable
import typings.chartJs.mod.ScriptableAndArray
import typings.chartJs.mod.ScriptableContext
import typings.chartJs.mod.TransitionsSpec
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesGeometricMod.ChartArea
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'line'} & chart.js.chart.js.LineControllerDatasetOptions & chart.js.chart.js.FillerControllerDatasetOptions */
trait typelineLineControllerDat extends StObject {
  
  var animation: `false` | AnimationSpeclineonProgre
  
  var animations: AnimationsSpec[line]
  
  var backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var borderCapStyle: Scriptable[CanvasLineCap, ScriptableContext[line]]
  
  var borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var borderDash: Scriptable[js.Array[Double], ScriptableContext[line]]
  
  var borderDashOffset: Scriptable[Double, ScriptableContext[line]]
  
  var borderJoinStyle: Scriptable[CanvasLineJoin, ScriptableContext[line]]
  
  var borderWidth: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var capBezierPoints: Scriptable[Boolean, ScriptableContext[line]]
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  var cubicInterpolationMode: Scriptable[default | monotone, ScriptableContext[line]]
  
  /**
    * Both line and radar charts support a fill option on the dataset object which can be used to create area between two datasets or a dataset and a boundary, i.e. the scale origin, start or end
    */
  var fill: Scriptable[FillTarget | ComplexFillTarget, ScriptableContext[line]]
  
  /**
    * Configures the visibility state of the dataset. Set it to true, to hide the dataset from the chart.
    * @default false
    */
  var hidden: Boolean
  
  var hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var hoverBorderCapStyle: Scriptable[CanvasLineCap, ScriptableContext[line]]
  
  var hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var hoverBorderDash: Scriptable[js.Array[Double], ScriptableContext[line]]
  
  var hoverBorderDashOffset: Scriptable[Double, ScriptableContext[line]]
  
  var hoverBorderJoinStyle: Scriptable[CanvasLineJoin, ScriptableContext[line]]
  
  var hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[line]]
  
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
  
  var pointBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var pointBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var pointBorderWidth: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var pointHitRadius: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var pointHoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var pointHoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]
  
  var pointHoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var pointHoverRadius: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var pointRadius: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var pointRotation: ScriptableAndArray[Double, ScriptableContext[line]]
  
  var pointStyle: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[line]]
  
  var segment: Scriptable[BackgroundColor, ScriptableContext[line]]
  
  var showLine: Boolean
  
  /**
    * If true, lines will be drawn between points with no or null data. If false, points with NaN data will create a break in the line. Can also be a number specifying the maximum gap length to span. The unit of the value depends on the scale used.
    * @default false
    */
  var spanGaps: Boolean | Double
  
  /**
    * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack).
    */
  var stack: String
  
  var stepped: Scriptable[before | after | middle | Boolean, ScriptableContext[line]]
  
  var tension: Scriptable[Double, ScriptableContext[line]]
  
  var transitions: TransitionsSpec[line]
  
  var `type`: line
  
  /**
    * The ID of the x axis to plot this dataset on.
    */
  var xAxisID: String
  
  /**
    * The ID of the y axis to plot this dataset on.
    */
  var yAxisID: String
}
object typelineLineControllerDat {
  
  inline def apply(
    animation: `false` | AnimationSpeclineonProgre,
    animations: AnimationsSpec[line],
    backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    borderCapStyle: Scriptable[CanvasLineCap, ScriptableContext[line]],
    borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    borderDash: Scriptable[js.Array[Double], ScriptableContext[line]],
    borderDashOffset: Scriptable[Double, ScriptableContext[line]],
    borderJoinStyle: Scriptable[CanvasLineJoin, ScriptableContext[line]],
    borderWidth: ScriptableAndArray[Double, ScriptableContext[line]],
    capBezierPoints: Scriptable[Boolean, ScriptableContext[line]],
    clip: Double | ChartArea | `false`,
    cubicInterpolationMode: Scriptable[default | monotone, ScriptableContext[line]],
    fill: Scriptable[FillTarget | ComplexFillTarget, ScriptableContext[line]],
    hidden: Boolean,
    hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    hoverBorderCapStyle: Scriptable[CanvasLineCap, ScriptableContext[line]],
    hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    hoverBorderDash: Scriptable[js.Array[Double], ScriptableContext[line]],
    hoverBorderDashOffset: Scriptable[Double, ScriptableContext[line]],
    hoverBorderJoinStyle: Scriptable[CanvasLineJoin, ScriptableContext[line]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[line]],
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    pointBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    pointBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    pointBorderWidth: ScriptableAndArray[Double, ScriptableContext[line]],
    pointHitRadius: ScriptableAndArray[Double, ScriptableContext[line]],
    pointHoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    pointHoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]],
    pointHoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[line]],
    pointHoverRadius: ScriptableAndArray[Double, ScriptableContext[line]],
    pointRadius: ScriptableAndArray[Double, ScriptableContext[line]],
    pointRotation: ScriptableAndArray[Double, ScriptableContext[line]],
    pointStyle: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[line]],
    segment: Scriptable[BackgroundColor, ScriptableContext[line]],
    showLine: Boolean,
    spanGaps: Boolean | Double,
    stack: String,
    stepped: Scriptable[before | after | middle | Boolean, ScriptableContext[line]],
    tension: Scriptable[Double, ScriptableContext[line]],
    transitions: TransitionsSpec[line],
    xAxisID: String,
    yAxisID: String
  ): typelineLineControllerDat = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderCapStyle = borderCapStyle.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], capBezierPoints = capBezierPoints.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], cubicInterpolationMode = cubicInterpolationMode.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderCapStyle = hoverBorderCapStyle.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderDash = hoverBorderDash.asInstanceOf[js.Any], hoverBorderDashOffset = hoverBorderDashOffset.asInstanceOf[js.Any], hoverBorderJoinStyle = hoverBorderJoinStyle.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], pointBackgroundColor = pointBackgroundColor.asInstanceOf[js.Any], pointBorderColor = pointBorderColor.asInstanceOf[js.Any], pointBorderWidth = pointBorderWidth.asInstanceOf[js.Any], pointHitRadius = pointHitRadius.asInstanceOf[js.Any], pointHoverBackgroundColor = pointHoverBackgroundColor.asInstanceOf[js.Any], pointHoverBorderColor = pointHoverBorderColor.asInstanceOf[js.Any], pointHoverBorderWidth = pointHoverBorderWidth.asInstanceOf[js.Any], pointHoverRadius = pointHoverRadius.asInstanceOf[js.Any], pointRadius = pointRadius.asInstanceOf[js.Any], pointRotation = pointRotation.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], showLine = showLine.asInstanceOf[js.Any], spanGaps = spanGaps.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stepped = stepped.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], xAxisID = xAxisID.asInstanceOf[js.Any], yAxisID = yAxisID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typelineLineControllerDat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typelineLineControllerDat] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: `false` | AnimationSpeclineonProgre): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[line]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBorderCapStyle(value: Scriptable[CanvasLineCap, ScriptableContext[line]]): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderCapStyleFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[CanvasLineCap]): Self = StObject.set(x, "borderCapStyle", js.Any.fromFunction2(value))
    
    inline def setBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "borderColor", js.Array(value*))
    
    inline def setBorderDash(value: Scriptable[js.Array[Double], ScriptableContext[line]]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(value: Scriptable[Double, ScriptableContext[line]]): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(value: Scriptable[CanvasLineJoin, ScriptableContext[line]]): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderJoinStyleFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[CanvasLineJoin]): Self = StObject.set(x, "borderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthVarargs(value: Double*): Self = StObject.set(x, "borderWidth", js.Array(value*))
    
    inline def setCapBezierPoints(value: Scriptable[Boolean, ScriptableContext[line]]): Self = StObject.set(x, "capBezierPoints", value.asInstanceOf[js.Any])
    
    inline def setCapBezierPointsFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "capBezierPoints", js.Any.fromFunction2(value))
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setCubicInterpolationMode(value: Scriptable[default | monotone, ScriptableContext[line]]): Self = StObject.set(x, "cubicInterpolationMode", value.asInstanceOf[js.Any])
    
    inline def setCubicInterpolationModeFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[default | monotone]): Self = StObject.set(x, "cubicInterpolationMode", js.Any.fromFunction2(value))
    
    inline def setFill(value: Scriptable[FillTarget | ComplexFillTarget, ScriptableContext[line]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[FillTarget | ComplexFillTarget]
    ): Self = StObject.set(x, "fill", js.Any.fromFunction2(value))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBackgroundColor", js.Array(value*))
    
    inline def setHoverBorderCapStyle(value: Scriptable[CanvasLineCap, ScriptableContext[line]]): Self = StObject.set(x, "hoverBorderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderCapStyleFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[CanvasLineCap]): Self = StObject.set(x, "hoverBorderCapStyle", js.Any.fromFunction2(value))
    
    inline def setHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBorderColor", js.Array(value*))
    
    inline def setHoverBorderDash(value: Scriptable[js.Array[Double], ScriptableContext[line]]): Self = StObject.set(x, "hoverBorderDash", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "hoverBorderDash", js.Any.fromFunction2(value))
    
    inline def setHoverBorderDashOffset(value: Scriptable[Double, ScriptableContext[line]]): Self = StObject.set(x, "hoverBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashOffsetFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderDashOffset", js.Any.fromFunction2(value))
    
    inline def setHoverBorderDashVarargs(value: Double*): Self = StObject.set(x, "hoverBorderDash", js.Array(value*))
    
    inline def setHoverBorderJoinStyle(value: Scriptable[CanvasLineJoin, ScriptableContext[line]]): Self = StObject.set(x, "hoverBorderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderJoinStyleFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[CanvasLineJoin]): Self = StObject.set(x, "hoverBorderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidthFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "hoverBorderWidth", js.Array(value*))
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setPointBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "pointBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setPointBackgroundColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setPointBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointBackgroundColor", js.Array(value*))
    
    inline def setPointBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "pointBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointBorderColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointBorderColor", js.Any.fromFunction2(value))
    
    inline def setPointBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointBorderColor", js.Array(value*))
    
    inline def setPointBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "pointBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointBorderWidthFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointBorderWidth", js.Any.fromFunction2(value))
    
    inline def setPointBorderWidthVarargs(value: Double*): Self = StObject.set(x, "pointBorderWidth", js.Array(value*))
    
    inline def setPointHitRadius(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "pointHitRadius", value.asInstanceOf[js.Any])
    
    inline def setPointHitRadiusFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointHitRadius", js.Any.fromFunction2(value))
    
    inline def setPointHitRadiusVarargs(value: Double*): Self = StObject.set(x, "pointHitRadius", js.Array(value*))
    
    inline def setPointHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBackgroundColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointHoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setPointHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointHoverBackgroundColor", js.Array(value*))
    
    inline def setPointHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[line]]): Self = StObject.set(x, "pointHoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBorderColorFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointHoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setPointHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointHoverBorderColor", js.Array(value*))
    
    inline def setPointHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "pointHoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBorderWidthFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointHoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setPointHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "pointHoverBorderWidth", js.Array(value*))
    
    inline def setPointHoverRadius(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "pointHoverRadius", value.asInstanceOf[js.Any])
    
    inline def setPointHoverRadiusFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointHoverRadius", js.Any.fromFunction2(value))
    
    inline def setPointHoverRadiusVarargs(value: Double*): Self = StObject.set(x, "pointHoverRadius", js.Array(value*))
    
    inline def setPointRadius(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
    
    inline def setPointRadiusFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointRadius", js.Any.fromFunction2(value))
    
    inline def setPointRadiusVarargs(value: Double*): Self = StObject.set(x, "pointRadius", js.Array(value*))
    
    inline def setPointRotation(value: ScriptableAndArray[Double, ScriptableContext[line]]): Self = StObject.set(x, "pointRotation", value.asInstanceOf[js.Any])
    
    inline def setPointRotationFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointRotation", js.Any.fromFunction2(value))
    
    inline def setPointRotationVarargs(value: Double*): Self = StObject.set(x, "pointRotation", js.Array(value*))
    
    inline def setPointStyle(value: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[line]]): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[typings.chartJs.mod.PointStyle]
    ): Self = StObject.set(x, "pointStyle", js.Any.fromFunction2(value))
    
    inline def setPointStyleVarargs(value: typings.chartJs.mod.PointStyle*): Self = StObject.set(x, "pointStyle", js.Array(value*))
    
    inline def setSegment(value: Scriptable[BackgroundColor, ScriptableContext[line]]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[BackgroundColor]): Self = StObject.set(x, "segment", js.Any.fromFunction2(value))
    
    inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setSpanGaps(value: Boolean | Double): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStepped(value: Scriptable[before | after | middle | Boolean, ScriptableContext[line]]): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
    
    inline def setSteppedFunction2(
      value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[before | after | middle | Boolean]
    ): Self = StObject.set(x, "stepped", js.Any.fromFunction2(value))
    
    inline def setTension(value: Scriptable[Double, ScriptableContext[line]]): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionFunction2(value: (ScriptableContext[line], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "tension", js.Any.fromFunction2(value))
    
    inline def setTransitions(value: TransitionsSpec[line]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxisID(value: String): Self = StObject.set(x, "xAxisID", value.asInstanceOf[js.Any])
    
    inline def setYAxisID(value: String): Self = StObject.set(x, "yAxisID", value.asInstanceOf[js.Any])
  }
}
