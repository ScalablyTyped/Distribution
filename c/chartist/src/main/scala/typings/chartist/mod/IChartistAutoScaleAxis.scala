package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistAutoScaleAxis
  extends StObject
     with ILineChartAxis {
  
  var high: js.UndefOr[Double] = js.undefined
  
  var low: js.UndefOr[Double] = js.undefined
  
  var onlyInteger: js.UndefOr[Boolean] = js.undefined
  
  var referenceValue: js.UndefOr[Double] = js.undefined
  
  var scaleMinSpace: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[IAutoScaleAxisStatic] = js.undefined
}
object IChartistAutoScaleAxis {
  
  inline def apply(): IChartistAutoScaleAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistAutoScaleAxis]
  }
  
  extension [Self <: IChartistAutoScaleAxis](x: Self) {
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setOnlyInteger(value: Boolean): Self = StObject.set(x, "onlyInteger", value.asInstanceOf[js.Any])
    
    inline def setOnlyIntegerUndefined: Self = StObject.set(x, "onlyInteger", js.undefined)
    
    inline def setReferenceValue(value: Double): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setScaleMinSpace(value: Double): Self = StObject.set(x, "scaleMinSpace", value.asInstanceOf[js.Any])
    
    inline def setScaleMinSpaceUndefined: Self = StObject.set(x, "scaleMinSpace", js.undefined)
    
    inline def setType(value: IAutoScaleAxisStatic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
