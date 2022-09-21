package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.custom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ohlc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartSeriesTypesStockSeriesAggregation
  extends StObject
     with dxChartSeriesTypesCommonSeriesAggregation {
  
  /**
    * Specifies how to aggregate series points.
    */
  @JSName("method")
  var method_dxChartSeriesTypesStockSeriesAggregation: js.UndefOr[ohlc | custom] = js.undefined
}
object dxChartSeriesTypesStockSeriesAggregation {
  
  inline def apply(): dxChartSeriesTypesStockSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStockSeriesAggregation]
  }
  
  extension [Self <: dxChartSeriesTypesStockSeriesAggregation](x: Self) {
    
    inline def setMethod(value: ohlc | custom): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
