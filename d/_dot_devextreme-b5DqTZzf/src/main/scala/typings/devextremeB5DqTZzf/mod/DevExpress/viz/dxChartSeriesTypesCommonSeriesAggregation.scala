package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.avg
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.count
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.max
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.min
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ohlc
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.range
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesCommonSeriesAggregation extends StObject {
  
  /**
    * Specifies a custom aggregate function. Applies only if the aggregation method is &apos;custom&apos;.
    */
  var calculate: js.UndefOr[
    js.Function2[
      /* aggregationInfo */ chartPointAggregationInfoObject, 
      /* series */ chartSeriesObject, 
      Any | js.Array[Any]
    ]
  ] = js.undefined
  
  /**
    * Enables data aggregation for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to aggregate series points.
    */
  var method: js.UndefOr[avg | count | max | min | ohlc | range | sum | custom] = js.undefined
}
object dxChartSeriesTypesCommonSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesCommonSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesCommonSeriesAggregation](x: Self) {
    
    inline def setCalculate(
      value: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => Any | js.Array[Any]
    ): Self = StObject.set(x, "calculate", js.Any.fromFunction2(value))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMethod(value: avg | count | max | min | ohlc | range | sum | custom): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
