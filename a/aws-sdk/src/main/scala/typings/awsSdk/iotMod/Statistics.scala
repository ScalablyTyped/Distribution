package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statistics extends StObject {
  
  /**
    * The average of the aggregated field values.
    */
  var average: js.UndefOr[Average] = js.native
  
  /**
    * The count of things that match the query.
    */
  var count: js.UndefOr[Count] = js.native
  
  /**
    * The maximum aggregated field value.
    */
  var maximum: js.UndefOr[Maximum] = js.native
  
  /**
    * The minimum aggregated field value.
    */
  var minimum: js.UndefOr[Minimum] = js.native
  
  /**
    * The standard deviation of the aggregated field values.
    */
  var stdDeviation: js.UndefOr[StdDeviation] = js.native
  
  /**
    * The sum of the aggregated field values.
    */
  var sum: js.UndefOr[Sum] = js.native
  
  /**
    * The sum of the squares of the aggregated field values.
    */
  var sumOfSquares: js.UndefOr[SumOfSquares] = js.native
  
  /**
    * The variance of the aggregated field values.
    */
  var variance: js.UndefOr[Variance] = js.native
}
object Statistics {
  
  @scala.inline
  def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsMutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: Average): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    @scala.inline
    def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMaximum(value: Maximum): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Minimum): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setStdDeviation(value: StdDeviation): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
    
    @scala.inline
    def setSum(value: Sum): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumOfSquares(value: SumOfSquares): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumOfSquaresUndefined: Self = StObject.set(x, "sumOfSquares", js.undefined)
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    @scala.inline
    def setVariance(value: Variance): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
