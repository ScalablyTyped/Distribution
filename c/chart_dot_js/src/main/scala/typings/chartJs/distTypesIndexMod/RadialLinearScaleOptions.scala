package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.BackdropColor
import typings.chartJs.anon.BorderDash
import typings.chartJs.anon.PartialGridLineOptions
import typings.chartJs.chartJsStrings.auto
import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialLinearScaleOptions
  extends StObject
     with CoreScaleOptions {
  
  var angleLines: BorderDash
  
  var animate: Boolean
  
  var backgroundColor: Color
  
  /**
    * if true, scale will include 0 if it is not already included.
    * @default false
    */
  var beginAtZero: Boolean
  
  var grid: PartialGridLineOptions
  
  /**
    * User defined maximum number for the scale, overrides maximum value from data.
    */
  var max: Double
  
  /**
    * User defined minimum number for the scale, overrides minimum value from data.
    */
  var min: Double
  
  var pointLabels: BackdropColor
  
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
}
object RadialLinearScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: Scale[CoreScaleOptions] => Unit,
    afterDataLimits: Scale[CoreScaleOptions] => Unit,
    afterFit: Scale[CoreScaleOptions] => Unit,
    afterSetDimensions: Scale[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: Scale[CoreScaleOptions] => Unit,
    afterUpdate: Scale[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    angleLines: BorderDash,
    animate: Boolean,
    backgroundColor: Color,
    beforeBuildTicks: Scale[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: Scale[CoreScaleOptions] => Unit,
    beforeDataLimits: Scale[CoreScaleOptions] => Unit,
    beforeFit: Scale[CoreScaleOptions] => Unit,
    beforeSetDimensions: Scale[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: Scale[CoreScaleOptions] => Unit,
    beforeUpdate: Scale[CoreScaleOptions] => Unit,
    beginAtZero: Boolean,
    display: Boolean | auto,
    grid: PartialGridLineOptions,
    max: Double,
    min: Double,
    pointLabels: BackdropColor,
    reverse: Boolean,
    startAngle: Double,
    suggestedMax: Double,
    suggestedMin: Double,
    ticks: RadialTickOptions,
    weight: Double
  ): RadialLinearScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], angleLines = angleLines.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), beginAtZero = beginAtZero.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pointLabels = pointLabels.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], suggestedMax = suggestedMax.asInstanceOf[js.Any], suggestedMin = suggestedMin.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialLinearScaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadialLinearScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setAngleLines(value: BorderDash): Self = StObject.set(x, "angleLines", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: PartialGridLineOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPointLabels(value: BackdropColor): Self = StObject.set(x, "pointLabels", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: RadialTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
