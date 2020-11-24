package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMonitoringSchedulesResponse extends js.Object {
  
  /**
    * A JSON array in which each element is a summary for a monitoring schedule.
    */
  var MonitoringScheduleSummaries: MonitoringScheduleSummaryList = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListMonitoringSchedulesResponse {
  
  @scala.inline
  def apply(MonitoringScheduleSummaries: MonitoringScheduleSummaryList): ListMonitoringSchedulesResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleSummaries = MonitoringScheduleSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringSchedulesResponse]
  }
  
  @scala.inline
  implicit class ListMonitoringSchedulesResponseOps[Self <: ListMonitoringSchedulesResponse] (val x: Self) extends AnyVal {
    
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
    def setMonitoringScheduleSummariesVarargs(value: MonitoringScheduleSummary*): Self = this.set("MonitoringScheduleSummaries", js.Array(value :_*))
    
    @scala.inline
    def setMonitoringScheduleSummaries(value: MonitoringScheduleSummaryList): Self = this.set("MonitoringScheduleSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
