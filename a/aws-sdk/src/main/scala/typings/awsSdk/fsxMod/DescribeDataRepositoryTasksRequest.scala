package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDataRepositoryTasksRequest extends StObject {
  
  /**
    * (Optional) You can use filters to narrow the DescribeDataRepositoryTasks response to include just tasks for specific file systems, or tasks in a specific lifecycle state.
    */
  var Filters: js.UndefOr[DataRepositoryTaskFilters] = js.native
  
  var MaxResults: js.UndefOr[typings.awsSdk.fsxMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
  
  /**
    * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
    */
  var TaskIds: js.UndefOr[typings.awsSdk.fsxMod.TaskIds] = js.native
}
object DescribeDataRepositoryTasksRequest {
  
  @scala.inline
  def apply(): DescribeDataRepositoryTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksRequest]
  }
  
  @scala.inline
  implicit class DescribeDataRepositoryTasksRequestMutableBuilder[Self <: DescribeDataRepositoryTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: DataRepositoryTaskFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DataRepositoryTaskFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTaskIds(value: TaskIds): Self = StObject.set(x, "TaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdsUndefined: Self = StObject.set(x, "TaskIds", js.undefined)
    
    @scala.inline
    def setTaskIdsVarargs(value: TaskId*): Self = StObject.set(x, "TaskIds", js.Array(value :_*))
  }
}
