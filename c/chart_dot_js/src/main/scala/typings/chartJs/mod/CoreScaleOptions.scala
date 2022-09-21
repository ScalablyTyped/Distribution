package typings.chartJs.mod

import typings.chartJs.chartJsStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreScaleOptions extends StObject {
  
  /**
    * Callback that runs after ticks are created. Useful for filtering ticks.
    */
  def afterBuildTicks(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after tick rotation is determined.
    */
  def afterCalculateLabelRotation(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after data limits are determined.
    */
  def afterDataLimits(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after the scale fits to the canvas.
    */
  def afterFit(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after dimensions are set.
    */
  def afterSetDimensions(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs after ticks are converted into strings.
    */
  def afterTickToLabelConversion(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs at the end of the update process.
    */
  def afterUpdate(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Align pixel values to device pixels
    */
  var alignToPixels: Boolean
  
  /**
    * Callback that runs before ticks are created.
    */
  def beforeBuildTicks(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before tick rotation is determined.
    */
  def beforeCalculateLabelRotation(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before data limits are determined.
    */
  def beforeDataLimits(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before the scale fits to the canvas.
    */
  def beforeFit(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before dimensions are set.
    */
  def beforeSetDimensions(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback that runs before ticks are converted into strings.
    */
  def beforeTickToLabelConversion(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Callback called before the update process starts.
    */
  def beforeUpdate(axis: Scale[CoreScaleOptions]): Unit
  
  /**
    * Controls the axis global visibility (visible when true, hidden when false). When display: 'auto', the axis is visible only if at least one associated dataset is visible.
    * @default true
    */
  var display: Boolean | auto
  
  /**
    * Reverse the scale.
    * @default false
    */
  var reverse: Boolean
  
  /**
    * The weight used to sort the axis. Higher weights are further away from the chart area.
    * @default true
    */
  var weight: Double
}
object CoreScaleOptions {
  
  inline def apply(
    afterBuildTicks: Scale[CoreScaleOptions] => Unit,
    afterCalculateLabelRotation: Scale[CoreScaleOptions] => Unit,
    afterDataLimits: Scale[CoreScaleOptions] => Unit,
    afterFit: Scale[CoreScaleOptions] => Unit,
    afterSetDimensions: Scale[CoreScaleOptions] => Unit,
    afterTickToLabelConversion: Scale[CoreScaleOptions] => Unit,
    afterUpdate: Scale[CoreScaleOptions] => Unit,
    alignToPixels: Boolean,
    beforeBuildTicks: Scale[CoreScaleOptions] => Unit,
    beforeCalculateLabelRotation: Scale[CoreScaleOptions] => Unit,
    beforeDataLimits: Scale[CoreScaleOptions] => Unit,
    beforeFit: Scale[CoreScaleOptions] => Unit,
    beforeSetDimensions: Scale[CoreScaleOptions] => Unit,
    beforeTickToLabelConversion: Scale[CoreScaleOptions] => Unit,
    beforeUpdate: Scale[CoreScaleOptions] => Unit,
    display: Boolean | auto,
    reverse: Boolean,
    weight: Double
  ): CoreScaleOptions = {
    val __obj = js.Dynamic.literal(afterBuildTicks = js.Any.fromFunction1(afterBuildTicks), afterCalculateLabelRotation = js.Any.fromFunction1(afterCalculateLabelRotation), afterDataLimits = js.Any.fromFunction1(afterDataLimits), afterFit = js.Any.fromFunction1(afterFit), afterSetDimensions = js.Any.fromFunction1(afterSetDimensions), afterTickToLabelConversion = js.Any.fromFunction1(afterTickToLabelConversion), afterUpdate = js.Any.fromFunction1(afterUpdate), alignToPixels = alignToPixels.asInstanceOf[js.Any], beforeBuildTicks = js.Any.fromFunction1(beforeBuildTicks), beforeCalculateLabelRotation = js.Any.fromFunction1(beforeCalculateLabelRotation), beforeDataLimits = js.Any.fromFunction1(beforeDataLimits), beforeFit = js.Any.fromFunction1(beforeFit), beforeSetDimensions = js.Any.fromFunction1(beforeSetDimensions), beforeTickToLabelConversion = js.Any.fromFunction1(beforeTickToLabelConversion), beforeUpdate = js.Any.fromFunction1(beforeUpdate), display = display.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreScaleOptions]
  }
  
  extension [Self <: CoreScaleOptions](x: Self) {
    
    inline def setAfterBuildTicks(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction1(value))
    
    inline def setAfterCalculateLabelRotation(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setAfterDataLimits(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1(value))
    
    inline def setAfterFit(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterFit", js.Any.fromFunction1(value))
    
    inline def setAfterSetDimensions(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterSetDimensions", js.Any.fromFunction1(value))
    
    inline def setAfterTickToLabelConversion(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setAfterUpdate(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setAlignToPixels(value: Boolean): Self = StObject.set(x, "alignToPixels", value.asInstanceOf[js.Any])
    
    inline def setBeforeBuildTicks(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1(value))
    
    inline def setBeforeCalculateLabelRotation(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeCalculateLabelRotation", js.Any.fromFunction1(value))
    
    inline def setBeforeDataLimits(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1(value))
    
    inline def setBeforeFit(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1(value))
    
    inline def setBeforeSetDimensions(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeSetDimensions", js.Any.fromFunction1(value))
    
    inline def setBeforeTickToLabelConversion(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdate(value: Scale[CoreScaleOptions] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    inline def setDisplay(value: Boolean | auto): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
