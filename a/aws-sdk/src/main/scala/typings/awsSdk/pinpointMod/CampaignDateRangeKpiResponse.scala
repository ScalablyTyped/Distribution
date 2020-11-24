package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignDateRangeKpiResponse extends js.Object {
  
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string = js.native
  
  /**
    * The unique identifier for the campaign that the metric applies to.
    */
  var CampaignId: string = js.native
  
  /**
    * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var EndTime: timestampIso8601 = js.native
  
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), that the data was retrieved for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: string = js.native
  
  /**
    * An array of objects that contains the results of the query. Each object contains the value for the metric and metadata about that value.
    */
  var KpiResult: BaseKpiResult = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null for the Campaign Metrics resource because the resource returns all results in a single page.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var StartTime: timestampIso8601 = js.native
}
object CampaignDateRangeKpiResponse {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CampaignDateRangeKpiResponseOps[Self <: CampaignDateRangeKpiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignId(value: string): Self = this.set("CampaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: timestampIso8601): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKpiName(value: string): Self = this.set("KpiName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKpiResult(value: BaseKpiResult): Self = this.set("KpiResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: timestampIso8601): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
