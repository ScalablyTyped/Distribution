package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingRegistrationTaskReportsRequest extends StObject {
  
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The type of task report.
    */
  var reportType: ReportType = js.native
  
  /**
    * The id of the task.
    */
  var taskId: TaskId = js.native
}
object ListThingRegistrationTaskReportsRequest {
  
  @scala.inline
  def apply(reportType: ReportType, taskId: TaskId): ListThingRegistrationTaskReportsRequest = {
    val __obj = js.Dynamic.literal(reportType = reportType.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingRegistrationTaskReportsRequest]
  }
  
  @scala.inline
  implicit class ListThingRegistrationTaskReportsRequestMutableBuilder[Self <: ListThingRegistrationTaskReportsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReportType(value: ReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
