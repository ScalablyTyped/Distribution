package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansUtilizationRequest extends StObject {
  
  /**
    * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the following dimensions:    LINKED_ACCOUNT     SAVINGS_PLAN_ARN     SAVINGS_PLANS_TYPE     REGION     PAYMENT_OPTION     INSTANCE_TYPE_FAMILY     GetSavingsPlansUtilization uses the same Expression object as the other operations, but only AND is supported among each dimension.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * The granularity of the Amazon Web Services utillization data for your Savings Plans. The GetSavingsPlansUtilization operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typings.awsSdk.costexplorerMod.Granularity] = js.undefined
  
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval
}
object GetSavingsPlansUtilizationRequest {
  
  @scala.inline
  def apply(TimePeriod: DateInterval): GetSavingsPlansUtilizationRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationRequest]
  }
  
  @scala.inline
  implicit class GetSavingsPlansUtilizationRequestMutableBuilder[Self <: GetSavingsPlansUtilizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setGranularity(value: Granularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "Granularity", js.undefined)
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
