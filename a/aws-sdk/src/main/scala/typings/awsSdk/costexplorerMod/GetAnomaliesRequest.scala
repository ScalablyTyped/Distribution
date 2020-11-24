package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomaliesRequest extends js.Object {
  
  /**
    * Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an AnomalyEndDate in the specified time range. 
    */
  var DateInterval: AnomalyDateInterval = js.native
  
  /**
    * Filters anomaly results by the feedback field on the anomaly object. 
    */
  var Feedback: js.UndefOr[AnomalyFeedbackType] = js.native
  
  /**
    *  The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name (ARN). 
    */
  var MonitorArn: js.UndefOr[GenericString] = js.native
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * Filters anomaly results by the total impact field on the anomaly object. For example, you can filter anomalies GREATER_THAN 200.00 to retrieve anomalies, with an estimated dollar impact greater than 200. 
    */
  var TotalImpact: js.UndefOr[TotalImpactFilter] = js.native
}
object GetAnomaliesRequest {
  
  @scala.inline
  def apply(DateInterval: AnomalyDateInterval): GetAnomaliesRequest = {
    val __obj = js.Dynamic.literal(DateInterval = DateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomaliesRequest]
  }
  
  @scala.inline
  implicit class GetAnomaliesRequestOps[Self <: GetAnomaliesRequest] (val x: Self) extends AnyVal {
    
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
    def setDateInterval(value: AnomalyDateInterval): Self = this.set("DateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedback(value: AnomalyFeedbackType): Self = this.set("Feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedback: Self = this.set("Feedback", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = this.set("MonitorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorArn: Self = this.set("MonitorArn", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setTotalImpact(value: TotalImpactFilter): Self = this.set("TotalImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalImpact: Self = this.set("TotalImpact", js.undefined)
  }
}
