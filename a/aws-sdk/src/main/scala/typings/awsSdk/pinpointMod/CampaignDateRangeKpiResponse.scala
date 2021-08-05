package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignDateRangeKpiResponse extends StObject {
  
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the campaign that the metric applies to.
    */
  var CampaignId: string
  
  /**
    * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var EndTime: timestampIso8601
  
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), that the data was retrieved for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: string
  
  /**
    * An array of objects that contains the results of the query. Each object contains the value for the metric and metadata about that value.
    */
  var KpiResult: BaseKpiResult
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null for the Campaign Metrics resource because the resource returns all results in a single page.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var StartTime: timestampIso8601
}
object CampaignDateRangeKpiResponse {
  
  inline def apply(
    ApplicationId: string,
    CampaignId: string,
    EndTime: timestampIso8601,
    KpiName: string,
    KpiResult: BaseKpiResult,
    StartTime: timestampIso8601
  ): CampaignDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], KpiName = KpiName.asInstanceOf[js.Any], KpiResult = KpiResult.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignDateRangeKpiResponse]
  }
  
  extension [Self <: CampaignDateRangeKpiResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setCampaignId(value: string): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: timestampIso8601): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setKpiName(value: string): Self = StObject.set(x, "KpiName", value.asInstanceOf[js.Any])
    
    inline def setKpiResult(value: BaseKpiResult): Self = StObject.set(x, "KpiResult", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: timestampIso8601): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
