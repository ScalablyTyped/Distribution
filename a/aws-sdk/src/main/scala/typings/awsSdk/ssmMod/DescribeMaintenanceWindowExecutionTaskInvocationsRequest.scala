package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowExecutionTaskInvocationsRequest extends StObject {
  
  /**
    * Optional filters used to scope down the returned task invocations. The supported filter key is STATUS with the corresponding values PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The ID of the specific task in the maintenance window task that should be retrieved.
    */
  var TaskId: MaintenanceWindowExecutionTaskId = js.native
  
  /**
    * The ID of the maintenance window execution the task is part of.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}
object DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
  
  @scala.inline
  def apply(TaskId: MaintenanceWindowExecutionTaskId, WindowExecutionId: MaintenanceWindowExecutionId): DescribeMaintenanceWindowExecutionTaskInvocationsRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsRequest]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowExecutionTaskInvocationsRequestMutableBuilder[Self <: DescribeMaintenanceWindowExecutionTaskInvocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: MaintenanceWindowFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: MaintenanceWindowFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaintenanceWindowMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTaskId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
