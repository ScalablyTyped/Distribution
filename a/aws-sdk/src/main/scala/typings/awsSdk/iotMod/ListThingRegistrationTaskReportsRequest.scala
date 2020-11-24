package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingRegistrationTaskReportsRequest extends js.Object {
  
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
  implicit class ListThingRegistrationTaskReportsRequestOps[Self <: ListThingRegistrationTaskReportsRequest] (val x: Self) extends AnyVal {
    
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
    def setReportType(value: ReportType): Self = this.set("reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: TaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
