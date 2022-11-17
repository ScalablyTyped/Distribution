package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.Count
import typings.chartJs.anon.PartialGridLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearScaleOptions
  extends StObject
     with CartesianScaleOptions {
  
  /**
    *  if true, scale will include 0 if it is not already included.
    * @default true
    */
  var beginAtZero: Boolean
  
  /**
    * Percentage (string ending with %) or amount (number) for added room in the scale range above and below data.
    */
  var grace: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMin: js.UndefOr[Double] = js.undefined
  
  @JSName("ticks")
  var ticks_LinearScaleOptions: Count
}
object LinearScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale2[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: Scale2[CoreScaleOptions] => Unit,
    afterDataLimits: Scale2[CoreScaleOptions] => Unit,
    afterFit: Scale2[CoreScaleOptions] => Unit,
    afterSetDimensions: Scale2[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: Scale2[CoreScaleOptions] => Unit,
    afterUpdate: Scale2[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    axis: "x" | "y" | "r",
    beforeBuildTicks: Scale2[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: Scale2[CoreScaleOptions] => Unit,
    beforeDataLimits: Scale2[CoreScaleOptions] => Unit,
    beforeFit: Scale2[CoreScaleOptions] => Unit,
    beforeSetDimensions: Scale2[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: Scale2[CoreScaleOptions] => Unit,
    beforeUpdate: Scale2[CoreScaleOptions] => Unit,
    beginAtZero: Boolean,
    border: BorderOptions,
    bounds: "ticks" | "data",
    display: Boolean | "auto",
    grid: PartialGridLineOptions,
    max: Double,
    min: Double,
    offset: Boolean,
    position: "left" | "top" | "right" | "bottom" | "center" | StringDictionary[Double],
    reverse: Boolean,
    ticks: Count,
    title: typings.chartJs.anon.Align,
    weight: Double
  ): LinearScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), beginAtZero = beginAtZero.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearScaleOptions]
  }
  
  extension [Self <: LinearScaleOptions](x: Self) {
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setGrace(value: String | Double): Self = StObject.set(x, "grace", value.asInstanceOf[js.Any])
    
    inline def setGraceUndefined: Self = StObject.set(x, "grace", js.undefined)
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMaxUndefined: Self = StObject.set(x, "suggestedMax", js.undefined)
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMinUndefined: Self = StObject.set(x, "suggestedMin", js.undefined)
    
    inline def setTicks(value: Count): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
