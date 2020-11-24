package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMonitoringSchedulesRequest extends js.Object {
  
  /**
    * A filter that returns only monitoring schedules created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only monitoring schedules created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * Name of a specific endpoint to fetch schedules for.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.native
  
  /**
    * A filter that returns only monitoring schedules modified after a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only monitoring schedules modified before a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * The maximum number of jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * Filter for monitoring schedules whose name contains a specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.sagemakerMod.NameContains] = js.native
  
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * Whether to sort results by Status, CreationTime, ScheduledTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringScheduleSortKey] = js.native
  
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  
  /**
    * A filter that returns only monitoring schedules modified before a specified time.
    */
  var StatusEquals: js.UndefOr[ScheduleStatus] = js.native
}
object ListMonitoringSchedulesRequest {
  
  @scala.inline
  def apply(): ListMonitoringSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringSchedulesRequest]
  }
  
  @scala.inline
  implicit class ListMonitoringSchedulesRequestOps[Self <: ListMonitoringSchedulesRequest] (val x: Self) extends AnyVal {
    
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
    def setCreationTimeAfter(value: Timestamp): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointName: Self = this.set("EndpointName", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeAfter(value: Timestamp): Self = this.set("LastModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTimeAfter: Self = this.set("LastModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedTimeBefore(value: Timestamp): Self = this.set("LastModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTimeBefore: Self = this.set("LastModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: NameContains): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: MonitoringScheduleSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    
    @scala.inline
    def setStatusEquals(value: ScheduleStatus): Self = this.set("StatusEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusEquals: Self = this.set("StatusEquals", js.undefined)
  }
}
