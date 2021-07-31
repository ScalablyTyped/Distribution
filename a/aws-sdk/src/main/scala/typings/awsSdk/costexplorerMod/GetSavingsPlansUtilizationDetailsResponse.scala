package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansUtilizationDetailsResponse extends StObject {
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
  
  /**
    * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
    */
  var SavingsPlansUtilizationDetails: typings.awsSdk.costexplorerMod.SavingsPlansUtilizationDetails
  
  var TimePeriod: DateInterval
  
  /**
    * The total Savings Plans utilization, regardless of time period.
    */
  var Total: js.UndefOr[SavingsPlansUtilizationAggregates] = js.undefined
}
object GetSavingsPlansUtilizationDetailsResponse {
  
  @scala.inline
  def apply(SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails, TimePeriod: DateInterval): GetSavingsPlansUtilizationDetailsResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansUtilizationDetails = SavingsPlansUtilizationDetails.asInstanceOf[js.Any], TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationDetailsResponse]
  }
  
  @scala.inline
  implicit class GetSavingsPlansUtilizationDetailsResponseMutableBuilder[Self <: GetSavingsPlansUtilizationDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlansUtilizationDetails(value: SavingsPlansUtilizationDetails): Self = StObject.set(x, "SavingsPlansUtilizationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansUtilizationDetailsVarargs(value: SavingsPlansUtilizationDetail*): Self = StObject.set(x, "SavingsPlansUtilizationDetails", js.Array(value :_*))
    
    @scala.inline
    def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: SavingsPlansUtilizationAggregates): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
