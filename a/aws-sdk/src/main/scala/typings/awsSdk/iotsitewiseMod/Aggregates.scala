package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregates extends StObject {
  
  /**
    * The average (mean) value of the time series over a time interval window.
    */
  var average: js.UndefOr[AggregatedDoubleValue] = js.native
  
  /**
    * The count of data points in the time series over a time interval window.
    */
  var count: js.UndefOr[AggregatedDoubleValue] = js.native
  
  /**
    * The maximum value of the time series over a time interval window.
    */
  var maximum: js.UndefOr[AggregatedDoubleValue] = js.native
  
  /**
    * The minimum value of the time series over a time interval window.
    */
  var minimum: js.UndefOr[AggregatedDoubleValue] = js.native
  
  /**
    * The standard deviation of the time series over a time interval window.
    */
  var standardDeviation: js.UndefOr[AggregatedDoubleValue] = js.native
  
  /**
    * The sum of the time series over a time interval window.
    */
  var sum: js.UndefOr[AggregatedDoubleValue] = js.native
}
object Aggregates {
  
  @scala.inline
  def apply(): Aggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregates]
  }
  
  @scala.inline
  implicit class AggregatesMutableBuilder[Self <: Aggregates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: AggregatedDoubleValue): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setCount(value: AggregatedDoubleValue): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMaximum(value: AggregatedDoubleValue): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: AggregatedDoubleValue): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setStandardDeviation(value: AggregatedDoubleValue): Self = StObject.set(x, "standardDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationUndefined: Self = StObject.set(x, "standardDeviation", js.undefined)
    
    @scala.inline
    def setSum(value: AggregatedDoubleValue): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
