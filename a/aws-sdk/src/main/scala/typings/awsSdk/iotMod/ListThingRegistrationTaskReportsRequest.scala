package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingRegistrationTaskReportsRequest extends StObject {
  
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of task report.
    */
  var reportType: ReportType
  
  /**
    * The id of the task.
    */
  var taskId: TaskId
}
object ListThingRegistrationTaskReportsRequest {
  
  inline def apply(reportType: ReportType, taskId: TaskId): ListThingRegistrationTaskReportsRequest = {
    val __obj = js.Dynamic.literal(reportType = reportType.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingRegistrationTaskReportsRequest]
  }
  
  extension [Self <: ListThingRegistrationTaskReportsRequest](x: Self) {
    
    inline def setMaxResults(value: RegistryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReportType(value: ReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
