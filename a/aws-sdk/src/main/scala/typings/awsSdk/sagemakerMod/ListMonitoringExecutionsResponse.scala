package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoringExecutionsResponse extends StObject {
  
  /**
    * A JSON array in which each element is a summary for a monitoring execution.
    */
  var MonitoringExecutionSummaries: MonitoringExecutionSummaryList
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in the subsequent reques
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListMonitoringExecutionsResponse {
  
  @scala.inline
  def apply(MonitoringExecutionSummaries: MonitoringExecutionSummaryList): ListMonitoringExecutionsResponse = {
    val __obj = js.Dynamic.literal(MonitoringExecutionSummaries = MonitoringExecutionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMonitoringExecutionsResponse]
  }
  
  @scala.inline
  implicit class ListMonitoringExecutionsResponseMutableBuilder[Self <: ListMonitoringExecutionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringExecutionSummaries(value: MonitoringExecutionSummaryList): Self = StObject.set(x, "MonitoringExecutionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringExecutionSummariesVarargs(value: MonitoringExecutionSummary*): Self = StObject.set(x, "MonitoringExecutionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
