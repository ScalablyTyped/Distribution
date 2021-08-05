package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistFixedScaleAxis
  extends StObject
     with ILineChartAxis {
  
  var divisor: js.UndefOr[Double] = js.undefined
  
  var high: js.UndefOr[Double] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var ticks: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  var `type`: js.UndefOr[IFixedScaleAxisStatic] = js.undefined
}
object IChartistFixedScaleAxis {
  
  inline def apply(): IChartistFixedScaleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistFixedScaleAxis]
  }
  
  extension [Self <: IChartistFixedScaleAxis](x: Self) {
    
    inline def setDivisor(value: Double): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    inline def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setTicks(value: js.Array[Double | String]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: (Double | String)*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    inline def setType(value: IFixedScaleAxisStatic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
