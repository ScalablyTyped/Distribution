package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportImageTasksRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter tasks using the task-state filter and one of the following values: active, completed, deleting, or deleted.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the import image tasks.
    */
  var ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImportImageTasksRequest {
  
  @scala.inline
  def apply(): DescribeImportImageTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportImageTasksRequest]
  }
  
  @scala.inline
  implicit class DescribeImportImageTasksRequestMutableBuilder[Self <: DescribeImportImageTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setImportTaskIds(value: ImportTaskIdList): Self = StObject.set(x, "ImportTaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdsUndefined: Self = StObject.set(x, "ImportTaskIds", js.undefined)
    
    @scala.inline
    def setImportTaskIdsVarargs(value: ImportImageTaskId*): Self = StObject.set(x, "ImportTaskIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
