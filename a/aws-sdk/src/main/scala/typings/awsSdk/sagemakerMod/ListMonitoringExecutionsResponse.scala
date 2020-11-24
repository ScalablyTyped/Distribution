package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMonitoringExecutionsResponse extends js.Object {
  
  /**
    * A JSON array in which each element is a summary for a monitoring execution.
    */
  var MonitoringExecutionSummaries: MonitoringExecutionSummaryList = js.native
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListMonitoringExecutionsResponse {
  
  @scala.inline
  def apply(MonitoringExecutionSummaries: MonitoringExecutionSummaryList): ListMonitoringExecutionsResponse = {
    val __obj = js.Dynamic.literal(MonitoringExecutionSummaries = MonitoringExecutionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringExecutionsResponse]
  }
  
  @scala.inline
  implicit class ListMonitoringExecutionsResponseOps[Self <: ListMonitoringExecutionsResponse] (val x: Self) extends AnyVal {
    
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
    def setMonitoringExecutionSummariesVarargs(value: MonitoringExecutionSummary*): Self = this.set("MonitoringExecutionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setMonitoringExecutionSummaries(value: MonitoringExecutionSummaryList): Self = this.set("MonitoringExecutionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
