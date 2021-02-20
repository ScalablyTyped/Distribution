package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMonitoringSchedulesResponse extends StObject {
  
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
  implicit class ListMonitoringSchedulesResponseMutableBuilder[Self <: ListMonitoringSchedulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleSummaries(value: MonitoringScheduleSummaryList): Self = StObject.set(x, "MonitoringScheduleSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleSummariesVarargs(value: MonitoringScheduleSummary*): Self = StObject.set(x, "MonitoringScheduleSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
