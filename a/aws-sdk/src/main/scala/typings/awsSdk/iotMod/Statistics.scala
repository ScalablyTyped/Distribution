package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statistics extends js.Object {
  
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
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAverage(value: Average): Self = this.set("average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    
    @scala.inline
    def setCount(value: Count): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setMaximum(value: Maximum): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: Minimum): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setStdDeviation(value: StdDeviation): Self = this.set("stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdDeviation: Self = this.set("stdDeviation", js.undefined)
    
    @scala.inline
    def setSum(value: Sum): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    
    @scala.inline
    def setSumOfSquares(value: SumOfSquares): Self = this.set("sumOfSquares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSumOfSquares: Self = this.set("sumOfSquares", js.undefined)
    
    @scala.inline
    def setVariance(value: Variance): Self = this.set("variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
  }
}
