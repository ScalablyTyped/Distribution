package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSavingsPlansUtilizationResponse extends StObject {
  
  /**
    * The amount of cost/commitment you used your Savings Plans. This allows you to specify date ranges.
    */
  var SavingsPlansUtilizationsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlansUtilizationsByTime] = js.native
  
  /**
    * The total amount of cost/commitment that you used your Savings Plans, regardless of date ranges.
    */
  var Total: SavingsPlansUtilizationAggregates = js.native
}
object GetSavingsPlansUtilizationResponse {
  
  @scala.inline
  def apply(Total: SavingsPlansUtilizationAggregates): GetSavingsPlansUtilizationResponse = {
    val __obj = js.Dynamic.literal(Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationResponse]
  }
  
  @scala.inline
  implicit class GetSavingsPlansUtilizationResponseMutableBuilder[Self <: GetSavingsPlansUtilizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSavingsPlansUtilizationsByTime(value: SavingsPlansUtilizationsByTime): Self = StObject.set(x, "SavingsPlansUtilizationsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansUtilizationsByTimeUndefined: Self = StObject.set(x, "SavingsPlansUtilizationsByTime", js.undefined)
    
    @scala.inline
    def setSavingsPlansUtilizationsByTimeVarargs(value: SavingsPlansUtilizationByTime*): Self = StObject.set(x, "SavingsPlansUtilizationsByTime", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: SavingsPlansUtilizationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
  }
}
