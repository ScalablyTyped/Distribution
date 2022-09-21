package typings.chartJs.anon

import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.radialLinear
import typings.chartJs.mod.CoreScaleOptions
import typings.chartJs.mod.GridLineOptions
import typings.chartJs.mod.RadialTickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'radialLinear'} & chart.js.chart.js.RadialLinearScaleOptions */
trait typeradialLinearRadialLin extends StObject {
  
  /**
    * Callback that runs after ticks are created. Useful for filtering ticks.
    */
  def afterBuildTicks(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after tick rotation is determined.
    */
  def afterCalculateLabelRotation(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after data limits are determined.
    */
  def afterDataLimits(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after the scale fits to the canvas.
    */
  def afterFit(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after dimensions are set.
    */
  def afterSetDimensions(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after ticks are converted into strings.
    */
  def afterTickToLabelConversion(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs at the end of the update process.
    */
  def afterUpdate(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Align pixel values to device pixels
    */
  var alignToPixels: Boolean
  
  var angleLines: BorderDash
  
  var animate: Boolean
  
  /**
    * Callback that runs before ticks are created.
    */
  def beforeBuildTicks(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before tick rotation is determined.
    */
  def beforeCalculateLabelRotation(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before data limits are determined.
    */
  def beforeDataLimits(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before the scale fits to the canvas.
    */
  def beforeFit(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before dimensions are set.
    */
  def beforeSetDimensions(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before ticks are converted into strings.
    */
  def beforeTickToLabelConversion(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback called before the update process starts.
    */
  def beforeUpdate(axis: typings.chartJs.mod.Scale[CoreScaleOptions]): Unit
  
  /**
    * if true, scale will include 0 if it is not already included.
    * @default false
    */
  var beginAtZero: Boolean
  
  /**
    * Controls the axis global visibility (visible when true, hidden when false). When display: 'auto', the axis is visible only if at least one associated dataset is visible.
    * @default true
    */
  var display: Boolean | auto
  
  var grid: GridLineOptions
  
  /**
    * User defined maximum number for the scale, overrides maximum value from data.
    */
  var max: Double
  
  /**
    * User defined minimum number for the scale, overrides minimum value from data.
    */
  var min: Double
  
  var pointLabels: BackdropPadding
  
  /**
    * Reverse the scale.
    * @default false
    */
  var reverse: Boolean
  
  var startAngle: Double
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMax: Double
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMin: Double
  
  var ticks: RadialTickOptions
  
  var `type`: radialLinear
  
  /**
    * The weight used to sort the axis. Higher weights are further away from the chart area.
    * @default true
    */
  var weight: Double
}
object typeradialLinearRadialLin {
  
  inline def apply(
    afterBuildTicks: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterDataLimits: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterFit: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterSetDimensions: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    afterUpdate: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    angleLines: BorderDash,
    animate: Boolean,
    beforeBuildTicks: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeDataLimits: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeFit: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeSetDimensions: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beforeUpdate: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit,
    beginAtZero: Boolean,
    display: Boolean | auto,
    grid: GridLineOptions,
    max: Double,
    min: Double,
    pointLabels: BackdropPadding,
    reverse: Boolean,
    startAngle: Double,
    suggestedMax: Double,
    suggestedMin: Double,
    ticks: RadialTickOptions,
    weight: Double
  ): typeradialLinearRadialLin = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], angleLines = angleLines.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), beginAtZero = beginAtZero.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pointLabels = pointLabels.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], suggestedMax = suggestedMax.asInstanceOf[js.Any], suggestedMin = suggestedMin.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radialLinear")
    __obj.asInstanceOf[typeradialLinearRadialLin]
  }
  
  extension [Self <: typeradialLinearRadialLin](x: Self) {
    
    inline def setAfterBuildTicks(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1(value))
    
    inline def setAfterCalculateLabelRotation(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setAfterDataLimits(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1(value))
    
    inline def setAfterFit(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterFit", js.Any.fromFunction1(value))
    
    inline def setAfterSetDimensions(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1(value))
    
    inline def setAfterTickToLabelConversion(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setAfterUpdate(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setAngleLines(value: BorderDash): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1(value))
    
    inline def setBeforeCalculateLabelRotation(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setBeforeDataLimits(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1(value))
    
    inline def setBeforeFit(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1(value))
    
    inline def setBeforeSetDimensions(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1(value))
    
    inline def setBeforeTickToLabelConversion(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdate(value: typings.chartJs.mod.Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: GridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPointLabels(value: BackdropPadding): Self = StObject.set(x, "pointLabels", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: RadialTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setType(value: radialLinear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
