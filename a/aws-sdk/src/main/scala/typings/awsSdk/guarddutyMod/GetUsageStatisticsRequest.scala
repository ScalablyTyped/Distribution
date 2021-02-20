package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUsageStatisticsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.guarddutyMod.MaxResults] = js.native
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The currency unit you would like to view your usage statistics in. Current valid values are USD.
    */
  var Unit: js.UndefOr[String] = js.native
  
  /**
    * Represents the criteria used for querying usage.
    */
  var UsageCriteria: typings.awsSdk.guarddutyMod.UsageCriteria = js.native
  
  /**
    * The type of usage statistics to retrieve.
    */
  var UsageStatisticType: typings.awsSdk.guarddutyMod.UsageStatisticType = js.native
}
object GetUsageStatisticsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, UsageCriteria: UsageCriteria, UsageStatisticType: UsageStatisticType): GetUsageStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], UsageCriteria = UsageCriteria.asInstanceOf[js.Any], UsageStatisticType = UsageStatisticType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageStatisticsRequest]
  }
  
  @scala.inline
  implicit class GetUsageStatisticsRequestMutableBuilder[Self <: GetUsageStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    @scala.inline
    def setUsageCriteria(value: UsageCriteria): Self = StObject.set(x, "UsageCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageStatisticType(value: UsageStatisticType): Self = StObject.set(x, "UsageStatisticType", value.asInstanceOf[js.Any])
  }
}
