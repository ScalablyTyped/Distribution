package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMonitoringExecutionsRequest extends js.Object {
  /**
    * A filter that returns only jobs created after a specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only jobs created before a specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * Name of a specific endpoint to fetch jobs for.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.native
  /**
    * A filter that returns only jobs modified before a specified time.
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only jobs modified after a specified time.
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of jobs to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * Name of a specific schedule to fetch jobs for.
    */
  var MonitoringScheduleName: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringScheduleName] = js.native
  /**
    * The token returned if the response is truncated. To retrieve the next set of job executions, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * Filter for jobs scheduled after a specified time.
    */
  var ScheduledTimeAfter: js.UndefOr[Timestamp] = js.native
  /**
    * Filter for jobs scheduled before a specified time.
    */
  var ScheduledTimeBefore: js.UndefOr[Timestamp] = js.native
  /**
    * Whether to sort results by Status, CreationTime, ScheduledTime field. The default is CreationTime.
    */
  var SortBy: js.UndefOr[MonitoringExecutionSortKey] = js.native
  /**
    * Whether to sort the results in Ascending or Descending order. The default is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that retrieves only jobs with a specific status.
    */
  var StatusEquals: js.UndefOr[ExecutionStatus] = js.native
}

object ListMonitoringExecutionsRequest {
  @scala.inline
  def apply(): ListMonitoringExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoringExecutionsRequest]
  }
  @scala.inline
  implicit class ListMonitoringExecutionsRequestOps[Self <: ListMonitoringExecutionsRequest] (val x: Self) extends AnyVal {
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
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = this.set("MonitoringScheduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringScheduleName: Self = this.set("MonitoringScheduleName", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScheduledTimeAfter(value: Timestamp): Self = this.set("ScheduledTimeAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledTimeAfter: Self = this.set("ScheduledTimeAfter", js.undefined)
    @scala.inline
    def setScheduledTimeBefore(value: Timestamp): Self = this.set("ScheduledTimeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledTimeBefore: Self = this.set("ScheduledTimeBefore", js.undefined)
    @scala.inline
    def setSortBy(value: MonitoringExecutionSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
    @scala.inline
    def setStatusEquals(value: ExecutionStatus): Self = this.set("StatusEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusEquals: Self = this.set("StatusEquals", js.undefined)
  }
  
}

