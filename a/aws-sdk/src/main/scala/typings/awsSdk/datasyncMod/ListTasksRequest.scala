package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksRequest extends StObject {
  
  /**
    * You can use API filters to narrow down the list of resources returned by ListTasks. For example, to retrieve all tasks on a specific source location, you can use ListTasks with filter name LocationId and Operator Equals with the ARN for the location.
    */
  var Filters: js.UndefOr[TaskFilters] = js.undefined
  
  /**
    * The maximum number of tasks to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.datasyncMod.MaxResults] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin the next list of tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.undefined
}
object ListTasksRequest {
  
  @scala.inline
  def apply(): ListTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksRequest]
  }
  
  @scala.inline
  implicit class ListTasksRequestMutableBuilder[Self <: ListTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: TaskFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: TaskFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
