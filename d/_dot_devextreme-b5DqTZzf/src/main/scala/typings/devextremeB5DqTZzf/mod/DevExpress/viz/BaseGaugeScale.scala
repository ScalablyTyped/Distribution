package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeScale extends StObject {
  
  /**
    * Specifies whether to allow decimal values on the scale. When false, the scale contains integer values only.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies an array of custom minor ticks.
    */
  var customMinorTicks: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies an array of custom major ticks.
    */
  var customTicks: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies the end value for the scale of the gauge.
    */
  var endValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies common properties for scale labels.
    */
  var label: js.UndefOr[BaseGaugeScaleLabel] = js.undefined
  
  /**
    * Specifies properties of the gauge&apos;s minor ticks.
    */
  var minorTick: js.UndefOr[Length] = js.undefined
  
  /**
    * Specifies an interval between minor ticks.
    */
  var minorTickInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum distance between two neighboring major ticks in pixels.
    */
  var scaleDivisionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the start value for the scale of the gauge.
    */
  var startValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies properties of the gauge&apos;s major ticks.
    */
  var tick: js.UndefOr[Length] = js.undefined
  
  /**
    * Specifies an interval between major ticks.
    */
  var tickInterval: js.UndefOr[Double] = js.undefined
}
object BaseGaugeScale {
  
  inline def apply(): BaseGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeScale]
  }
  
  extension [Self <: BaseGaugeScale](x: Self) {
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setCustomMinorTicks(value: js.Array[Double]): Self = StObject.set(x, "customMinorTicks", value.asInstanceOf[js.Any])
    
    inline def setCustomMinorTicksUndefined: Self = StObject.set(x, "customMinorTicks", js.undefined)
    
    inline def setCustomMinorTicksVarargs(value: Double*): Self = StObject.set(x, "customMinorTicks", js.Array(value*))
    
    inline def setCustomTicks(value: js.Array[Double]): Self = StObject.set(x, "customTicks", value.asInstanceOf[js.Any])
    
    inline def setCustomTicksUndefined: Self = StObject.set(x, "customTicks", js.undefined)
    
    inline def setCustomTicksVarargs(value: Double*): Self = StObject.set(x, "customTicks", js.Array(value*))
    
    inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLabel(value: BaseGaugeScaleLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMinorTick(value: Length): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickInterval(value: Double): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setScaleDivisionFactor(value: Double): Self = StObject.set(x, "scaleDivisionFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleDivisionFactorUndefined: Self = StObject.set(x, "scaleDivisionFactor", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setTick(value: Length): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
