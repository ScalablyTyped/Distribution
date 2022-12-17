package typings.chartJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.after
import typings.chartJs.chartJsStrings.before
import typings.chartJs.chartJsStrings.default
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.chartJsStrings.monotone
import typings.chartJs.chartJsStrings.radar
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.mod.AnimationsSpec
import typings.chartJs.mod.ComplexFillTarget
import typings.chartJs.mod.FillTarget
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

/* Inlined {  type :'radar'} & chart.js.chart.js.RadarControllerDatasetOptions & chart.js.chart.js.FillerControllerDatasetOptions */
trait typeradarRadarControllerD extends StObject {
  
  var animation: `false` | AnimationSpecradaronProgr
  
  var animations: AnimationsSpec[radar]
  
  var backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var borderCapStyle: ScriptableAndArray[CanvasLineCap, ScriptableContext[radar]]
  
  var borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var borderDash: ScriptableAndArray[js.Array[Double], ScriptableContext[radar]]
  
  var borderDashOffset: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var borderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[radar]]
  
  var borderWidth: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var capBezierPoints: ScriptableAndArray[Boolean, ScriptableContext[radar]]
  
  /**
    * How to clip relative to chartArea. Positive value allows overflow, negative value clips that many pixels inside chartArea. 0 = clip at chartArea. Clipping can also be configured per side: clip: {left: 5, top: false, right: -2, bottom: 0}
    */
  var clip: Double | ChartArea | `false`
  
  var cubicInterpolationMode: ScriptableAndArray[default | monotone, ScriptableContext[radar]]
  
  var drawActiveElementsOnTop: ScriptableAndArray[Boolean, ScriptableContext[radar]]
  
  /**
    * Both line and radar charts support a fill option on the dataset object which can be used to create area between two datasets or a dataset and a boundary, i.e. the scale origin, start or end
    */
  var fill: ScriptableAndArray[FillTarget | ComplexFillTarget, ScriptableContext[radar]]
  
  /**
    * Configures the visibility state of the dataset. Set it to true, to hide the dataset from the chart.
    * @default false
    */
  var hidden: Boolean
  
  var hitRadius: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var hoverBorderCapStyle: ScriptableAndArray[CanvasLineCap, ScriptableContext[radar]]
  
  var hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var hoverBorderDash: ScriptableAndArray[js.Array[Double], ScriptableContext[radar]]
  
  var hoverBorderDashOffset: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var hoverBorderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[radar]]
  
  var hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var hoverRadius: ScriptableAndArray[Double, ScriptableContext[radar]]
  
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
  
  var pointBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var pointBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var pointBorderWidth: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var pointHitRadius: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var pointHoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var pointHoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]
  
  var pointHoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var pointHoverRadius: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var pointRadius: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var pointRotation: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var pointStyle: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[radar]]
  
  var radius: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var rotation: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var segment: ScriptableAndArray[BackgroundColor, ScriptableContext[radar]]
  
  /**
    * If false, the line is not drawn for this dataset.
    */
  var showLine: Boolean
  
  /**
    * If true, lines will be drawn between points with no or null data. If false, points with NaN data will create a break in the line. Can also be a number specifying the maximum gap length to span. The unit of the value depends on the scale used.
    */
  var spanGaps: Boolean | Double
  
  /**
    * The ID of the group to which this dataset belongs to (when stacked, each group will be a separate stack).
    */
  var stack: String
  
  var stepped: ScriptableAndArray[before | after | middle | Boolean, ScriptableContext[radar]]
  
  var tension: ScriptableAndArray[Double, ScriptableContext[radar]]
  
  var transitions: TransitionsSpec[radar]
  
  var `type`: radar
  
  /**
    * The ID of the x axis to plot this dataset on.
    */
  var xAxisID: String
  
  /**
    * The ID of the y axis to plot this dataset on.
    */
  var yAxisID: String
}
object typeradarRadarControllerD {
  
  inline def apply(
    animation: `false` | AnimationSpecradaronProgr,
    animations: AnimationsSpec[radar],
    backgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    borderCapStyle: ScriptableAndArray[CanvasLineCap, ScriptableContext[radar]],
    borderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    borderDash: ScriptableAndArray[js.Array[Double], ScriptableContext[radar]],
    borderDashOffset: ScriptableAndArray[Double, ScriptableContext[radar]],
    borderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[radar]],
    borderWidth: ScriptableAndArray[Double, ScriptableContext[radar]],
    capBezierPoints: ScriptableAndArray[Boolean, ScriptableContext[radar]],
    clip: Double | ChartArea | `false`,
    cubicInterpolationMode: ScriptableAndArray[default | monotone, ScriptableContext[radar]],
    drawActiveElementsOnTop: ScriptableAndArray[Boolean, ScriptableContext[radar]],
    fill: ScriptableAndArray[FillTarget | ComplexFillTarget, ScriptableContext[radar]],
    hidden: Boolean,
    hitRadius: ScriptableAndArray[Double, ScriptableContext[radar]],
    hoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    hoverBorderCapStyle: ScriptableAndArray[CanvasLineCap, ScriptableContext[radar]],
    hoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    hoverBorderDash: ScriptableAndArray[js.Array[Double], ScriptableContext[radar]],
    hoverBorderDashOffset: ScriptableAndArray[Double, ScriptableContext[radar]],
    hoverBorderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[radar]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[radar]],
    hoverRadius: ScriptableAndArray[Double, ScriptableContext[radar]],
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    pointBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    pointBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    pointBorderWidth: ScriptableAndArray[Double, ScriptableContext[radar]],
    pointHitRadius: ScriptableAndArray[Double, ScriptableContext[radar]],
    pointHoverBackgroundColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    pointHoverBorderColor: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]],
    pointHoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[radar]],
    pointHoverRadius: ScriptableAndArray[Double, ScriptableContext[radar]],
    pointRadius: ScriptableAndArray[Double, ScriptableContext[radar]],
    pointRotation: ScriptableAndArray[Double, ScriptableContext[radar]],
    pointStyle: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[radar]],
    radius: ScriptableAndArray[Double, ScriptableContext[radar]],
    rotation: ScriptableAndArray[Double, ScriptableContext[radar]],
    segment: ScriptableAndArray[BackgroundColor, ScriptableContext[radar]],
    showLine: Boolean,
    spanGaps: Boolean | Double,
    stack: String,
    stepped: ScriptableAndArray[before | after | middle | Boolean, ScriptableContext[radar]],
    tension: ScriptableAndArray[Double, ScriptableContext[radar]],
    transitions: TransitionsSpec[radar],
    xAxisID: String,
    yAxisID: String
  ): typeradarRadarControllerD = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderCapStyle = borderCapStyle.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderDash = borderDash.asInstanceOf[js.Any], borderDashOffset = borderDashOffset.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], capBezierPoints = capBezierPoints.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], cubicInterpolationMode = cubicInterpolationMode.asInstanceOf[js.Any], drawActiveElementsOnTop = drawActiveElementsOnTop.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderCapStyle = hoverBorderCapStyle.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderDash = hoverBorderDash.asInstanceOf[js.Any], hoverBorderDashOffset = hoverBorderDashOffset.asInstanceOf[js.Any], hoverBorderJoinStyle = hoverBorderJoinStyle.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverRadius = hoverRadius.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], pointBackgroundColor = pointBackgroundColor.asInstanceOf[js.Any], pointBorderColor = pointBorderColor.asInstanceOf[js.Any], pointBorderWidth = pointBorderWidth.asInstanceOf[js.Any], pointHitRadius = pointHitRadius.asInstanceOf[js.Any], pointHoverBackgroundColor = pointHoverBackgroundColor.asInstanceOf[js.Any], pointHoverBorderColor = pointHoverBorderColor.asInstanceOf[js.Any], pointHoverBorderWidth = pointHoverBorderWidth.asInstanceOf[js.Any], pointHoverRadius = pointHoverRadius.asInstanceOf[js.Any], pointRadius = pointRadius.asInstanceOf[js.Any], pointRotation = pointRotation.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], showLine = showLine.asInstanceOf[js.Any], spanGaps = spanGaps.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stepped = stepped.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], xAxisID = xAxisID.asInstanceOf[js.Any], yAxisID = yAxisID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radar")
    __obj.asInstanceOf[typeradarRadarControllerD]
  }
  
  extension [Self <: typeradarRadarControllerD](x: Self) {
    
    inline def setAnimation(value: `false` | AnimationSpecradaronProgr): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[radar]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setBorderCapStyle(value: ScriptableAndArray[CanvasLineCap, ScriptableContext[radar]]): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderCapStyleFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[CanvasLineCap]): Self = StObject.set(x, "borderCapStyle", js.Any.fromFunction2(value))
    
    inline def setBorderCapStyleVarargs(value: CanvasLineCap*): Self = StObject.set(x, "borderCapStyle", js.Array(value*))
    
    inline def setBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "borderColor", js.Array(value*))
    
    inline def setBorderDash(value: ScriptableAndArray[js.Array[Double], ScriptableContext[radar]]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "borderDash", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffset(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderDashOffset", js.Any.fromFunction2(value))
    
    inline def setBorderDashOffsetVarargs(value: Double*): Self = StObject.set(x, "borderDashOffset", js.Array(value*))
    
    inline def setBorderDashVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "borderDash", js.Array(value*))
    
    inline def setBorderJoinStyle(value: ScriptableAndArray[CanvasLineJoin, ScriptableContext[radar]]): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderJoinStyleFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[CanvasLineJoin]): Self = StObject.set(x, "borderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setBorderJoinStyleVarargs(value: CanvasLineJoin*): Self = StObject.set(x, "borderJoinStyle", js.Array(value*))
    
    inline def setBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBorderWidthVarargs(value: Double*): Self = StObject.set(x, "borderWidth", js.Array(value*))
    
    inline def setCapBezierPoints(value: ScriptableAndArray[Boolean, ScriptableContext[radar]]): Self = StObject.set(x, "capBezierPoints", value.asInstanceOf[js.Any])
    
    inline def setCapBezierPointsFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "capBezierPoints", js.Any.fromFunction2(value))
    
    inline def setCapBezierPointsVarargs(value: Boolean*): Self = StObject.set(x, "capBezierPoints", js.Array(value*))
    
    inline def setClip(value: Double | ChartArea | `false`): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setCubicInterpolationMode(value: ScriptableAndArray[default | monotone, ScriptableContext[radar]]): Self = StObject.set(x, "cubicInterpolationMode", value.asInstanceOf[js.Any])
    
    inline def setCubicInterpolationModeFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[default | monotone]): Self = StObject.set(x, "cubicInterpolationMode", js.Any.fromFunction2(value))
    
    inline def setCubicInterpolationModeVarargs(value: (default | monotone)*): Self = StObject.set(x, "cubicInterpolationMode", js.Array(value*))
    
    inline def setDrawActiveElementsOnTop(value: ScriptableAndArray[Boolean, ScriptableContext[radar]]): Self = StObject.set(x, "drawActiveElementsOnTop", value.asInstanceOf[js.Any])
    
    inline def setDrawActiveElementsOnTopFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "drawActiveElementsOnTop", js.Any.fromFunction2(value))
    
    inline def setDrawActiveElementsOnTopVarargs(value: Boolean*): Self = StObject.set(x, "drawActiveElementsOnTop", js.Array(value*))
    
    inline def setFill(value: ScriptableAndArray[FillTarget | ComplexFillTarget, ScriptableContext[radar]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[FillTarget | ComplexFillTarget]
    ): Self = StObject.set(x, "fill", js.Any.fromFunction2(value))
    
    inline def setFillVarargs(value: (FillTarget | ComplexFillTarget)*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHitRadius(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    inline def setHitRadiusFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hitRadius", js.Any.fromFunction2(value))
    
    inline def setHitRadiusVarargs(value: Double*): Self = StObject.set(x, "hitRadius", js.Array(value*))
    
    inline def setHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBackgroundColor", js.Array(value*))
    
    inline def setHoverBorderCapStyle(value: ScriptableAndArray[CanvasLineCap, ScriptableContext[radar]]): Self = StObject.set(x, "hoverBorderCapStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderCapStyleFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[CanvasLineCap]): Self = StObject.set(x, "hoverBorderCapStyle", js.Any.fromFunction2(value))
    
    inline def setHoverBorderCapStyleVarargs(value: CanvasLineCap*): Self = StObject.set(x, "hoverBorderCapStyle", js.Array(value*))
    
    inline def setHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "hoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "hoverBorderColor", js.Array(value*))
    
    inline def setHoverBorderDash(value: ScriptableAndArray[js.Array[Double], ScriptableContext[radar]]): Self = StObject.set(x, "hoverBorderDash", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[js.Array[Double]]): Self = StObject.set(x, "hoverBorderDash", js.Any.fromFunction2(value))
    
    inline def setHoverBorderDashOffset(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "hoverBorderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderDashOffsetFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderDashOffset", js.Any.fromFunction2(value))
    
    inline def setHoverBorderDashOffsetVarargs(value: Double*): Self = StObject.set(x, "hoverBorderDashOffset", js.Array(value*))
    
    inline def setHoverBorderDashVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "hoverBorderDash", js.Array(value*))
    
    inline def setHoverBorderJoinStyle(value: ScriptableAndArray[CanvasLineJoin, ScriptableContext[radar]]): Self = StObject.set(x, "hoverBorderJoinStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderJoinStyleFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[CanvasLineJoin]): Self = StObject.set(x, "hoverBorderJoinStyle", js.Any.fromFunction2(value))
    
    inline def setHoverBorderJoinStyleVarargs(value: CanvasLineJoin*): Self = StObject.set(x, "hoverBorderJoinStyle", js.Array(value*))
    
    inline def setHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverBorderWidthFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "hoverBorderWidth", js.Array(value*))
    
    inline def setHoverRadius(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
    
    inline def setHoverRadiusFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "hoverRadius", js.Any.fromFunction2(value))
    
    inline def setHoverRadiusVarargs(value: Double*): Self = StObject.set(x, "hoverRadius", js.Array(value*))
    
    inline def setIndexAxis(value: typings.chartJs.chartJsStrings.x | y): Self = StObject.set(x, "indexAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
    
    inline def setPointBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "pointBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setPointBackgroundColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setPointBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointBackgroundColor", js.Array(value*))
    
    inline def setPointBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "pointBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointBorderColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointBorderColor", js.Any.fromFunction2(value))
    
    inline def setPointBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointBorderColor", js.Array(value*))
    
    inline def setPointBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "pointBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointBorderWidthFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointBorderWidth", js.Any.fromFunction2(value))
    
    inline def setPointBorderWidthVarargs(value: Double*): Self = StObject.set(x, "pointBorderWidth", js.Array(value*))
    
    inline def setPointHitRadius(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "pointHitRadius", value.asInstanceOf[js.Any])
    
    inline def setPointHitRadiusFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointHitRadius", js.Any.fromFunction2(value))
    
    inline def setPointHitRadiusVarargs(value: Double*): Self = StObject.set(x, "pointHitRadius", js.Array(value*))
    
    inline def setPointHoverBackgroundColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBackgroundColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointHoverBackgroundColor", js.Any.fromFunction2(value))
    
    inline def setPointHoverBackgroundColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointHoverBackgroundColor", js.Array(value*))
    
    inline def setPointHoverBorderColor(value: ScriptableAndArray[typings.chartJs.typesColorMod.Color, ScriptableContext[radar]]): Self = StObject.set(x, "pointHoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBorderColorFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.typesColorMod.Color]
    ): Self = StObject.set(x, "pointHoverBorderColor", js.Any.fromFunction2(value))
    
    inline def setPointHoverBorderColorVarargs(value: typings.chartJs.typesColorMod.Color*): Self = StObject.set(x, "pointHoverBorderColor", js.Array(value*))
    
    inline def setPointHoverBorderWidth(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "pointHoverBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointHoverBorderWidthFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointHoverBorderWidth", js.Any.fromFunction2(value))
    
    inline def setPointHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "pointHoverBorderWidth", js.Array(value*))
    
    inline def setPointHoverRadius(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "pointHoverRadius", value.asInstanceOf[js.Any])
    
    inline def setPointHoverRadiusFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointHoverRadius", js.Any.fromFunction2(value))
    
    inline def setPointHoverRadiusVarargs(value: Double*): Self = StObject.set(x, "pointHoverRadius", js.Array(value*))
    
    inline def setPointRadius(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
    
    inline def setPointRadiusFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointRadius", js.Any.fromFunction2(value))
    
    inline def setPointRadiusVarargs(value: Double*): Self = StObject.set(x, "pointRadius", js.Array(value*))
    
    inline def setPointRotation(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "pointRotation", value.asInstanceOf[js.Any])
    
    inline def setPointRotationFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "pointRotation", js.Any.fromFunction2(value))
    
    inline def setPointRotationVarargs(value: Double*): Self = StObject.set(x, "pointRotation", js.Array(value*))
    
    inline def setPointStyle(value: ScriptableAndArray[typings.chartJs.mod.PointStyle, ScriptableContext[radar]]): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[typings.chartJs.mod.PointStyle]
    ): Self = StObject.set(x, "pointStyle", js.Any.fromFunction2(value))
    
    inline def setPointStyleVarargs(value: typings.chartJs.mod.PointStyle*): Self = StObject.set(x, "pointStyle", js.Array(value*))
    
    inline def setRadius(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "radius", js.Any.fromFunction2(value))
    
    inline def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value*))
    
    inline def setRotation(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "rotation", js.Any.fromFunction2(value))
    
    inline def setRotationVarargs(value: Double*): Self = StObject.set(x, "rotation", js.Array(value*))
    
    inline def setSegment(value: ScriptableAndArray[BackgroundColor, ScriptableContext[radar]]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[BackgroundColor]): Self = StObject.set(x, "segment", js.Any.fromFunction2(value))
    
    inline def setSegmentVarargs(value: BackgroundColor*): Self = StObject.set(x, "segment", js.Array(value*))
    
    inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setSpanGaps(value: Boolean | Double): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStepped(value: ScriptableAndArray[before | after | middle | Boolean, ScriptableContext[radar]]): Self = StObject.set(x, "stepped", value.asInstanceOf[js.Any])
    
    inline def setSteppedFunction2(
      value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[before | after | middle | Boolean]
    ): Self = StObject.set(x, "stepped", js.Any.fromFunction2(value))
    
    inline def setSteppedVarargs(value: (before | after | middle | Boolean)*): Self = StObject.set(x, "stepped", js.Array(value*))
    
    inline def setTension(value: ScriptableAndArray[Double, ScriptableContext[radar]]): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "tension", js.Any.fromFunction2(value))
    
    inline def setTensionVarargs(value: Double*): Self = StObject.set(x, "tension", js.Array(value*))
    
    inline def setTransitions(value: TransitionsSpec[radar]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setType(value: radar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXAxisID(value: String): Self = StObject.set(x, "xAxisID", value.asInstanceOf[js.Any])
    
    inline def setYAxisID(value: String): Self = StObject.set(x, "yAxisID", value.asInstanceOf[js.Any])
  }
}
