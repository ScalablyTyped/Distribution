package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregates extends StObject {
  
  /**
    * The average (mean) value of the time series over a time interval window.
    */
  var average: js.UndefOr[AggregatedDoubleValue] = js.undefined
  
  /**
    * The count of data points in the time series over a time interval window.
    */
  var count: js.UndefOr[AggregatedDoubleValue] = js.undefined
  
  /**
    * The maximum value of the time series over a time interval window.
    */
  var maximum: js.UndefOr[AggregatedDoubleValue] = js.undefined
  
  /**
    * The minimum value of the time series over a time interval window.
    */
  var minimum: js.UndefOr[AggregatedDoubleValue] = js.undefined
  
  /**
    * The standard deviation of the time series over a time interval window.
    */
  var standardDeviation: js.UndefOr[AggregatedDoubleValue] = js.undefined
  
  /**
    * The sum of the time series over a time interval window.
    */
  var sum: js.UndefOr[AggregatedDoubleValue] = js.undefined
}
object Aggregates {
  
  inline def apply(): Aggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregates]
  }
  
  extension [Self <: Aggregates](x: Self) {
    
    inline def setAverage(value: AggregatedDoubleValue): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setCount(value: AggregatedDoubleValue): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMaximum(value: AggregatedDoubleValue): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: AggregatedDoubleValue): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setStandardDeviation(value: AggregatedDoubleValue): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    inline def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
    
    inline def setSum(value: AggregatedDoubleValue): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
