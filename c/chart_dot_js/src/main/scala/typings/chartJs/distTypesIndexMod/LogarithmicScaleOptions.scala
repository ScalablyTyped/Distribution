package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.anon.FormatNumberFormatOptions
import typings.chartJs.anon.PartialGridLineOptions
import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.bottom
import typings.chartJs.chartJsStrings.center
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.left
import typings.chartJs.chartJsStrings.r
import typings.chartJs.chartJsStrings.right
import typings.chartJs.chartJsStrings.ticks
import typings.chartJs.chartJsStrings.top
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogarithmicScaleOptions
  extends StObject
     with CartesianScaleOptions {
  
  /**
    * Adjustment used when calculating the minimum data value.
    */
  var suggestedMax: js.UndefOr[Double] = js.undefined
  
  /**
    * Adjustment used when calculating the maximum data value.
    */
  var suggestedMin: js.UndefOr[Double] = js.undefined
  
  @JSName("ticks")
  var ticks_LogarithmicScaleOptions: FormatNumberFormatOptions
}
object LogarithmicScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: Scale[CoreScaleOptions] => Unit,
    afterDataLimits: Scale[CoreScaleOptions] => Unit,
    afterFit: Scale[CoreScaleOptions] => Unit,
    afterSetDimensions: Scale[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: Scale[CoreScaleOptions] => Unit,
    afterUpdate: Scale[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    axis: x | y | r,
    beforeBuildTicks: Scale[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: Scale[CoreScaleOptions] => Unit,
    beforeDataLimits: Scale[CoreScaleOptions] => Unit,
    beforeFit: Scale[CoreScaleOptions] => Unit,
    beforeSetDimensions: Scale[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: Scale[CoreScaleOptions] => Unit,
    beforeUpdate: Scale[CoreScaleOptions] => Unit,
    border: BorderOptions,
    bounds: ticks | data,
    display: Boolean | auto,
    grid: PartialGridLineOptions,
    max: Double,
    min: Double,
    offset: Boolean,
    position: left | top | right | bottom | center | StringDictionary[Double],
    reverse: Boolean,
    ticks: FormatNumberFormatOptions,
    title: typings.chartJs.anon.Align,
    weight: Double
  ): LogarithmicScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), border = border.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogarithmicScaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogarithmicScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMaxUndefined: Self = StObject.set(x, "suggestedMax", js.undefined)
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMinUndefined: Self = StObject.set(x, "suggestedMin", js.undefined)
    
    inline def setTicks(value: FormatNumberFormatOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
