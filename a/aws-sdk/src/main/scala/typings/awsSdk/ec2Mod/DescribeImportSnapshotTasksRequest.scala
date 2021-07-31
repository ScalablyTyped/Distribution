package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportSnapshotTasksRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A list of import snapshot task IDs.
    */
  var ImportTaskIds: js.UndefOr[ImportSnapshotTaskIdList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImportSnapshotTasksRequest {
  
  @scala.inline
  def apply(): DescribeImportSnapshotTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportSnapshotTasksRequest]
  }
  
  @scala.inline
  implicit class DescribeImportSnapshotTasksRequestMutableBuilder[Self <: DescribeImportSnapshotTasksRequest] (val x: Self) extends AnyVal {
    
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
    def setImportTaskIds(value: ImportSnapshotTaskIdList): Self = StObject.set(x, "ImportTaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdsUndefined: Self = StObject.set(x, "ImportTaskIds", js.undefined)
    
    @scala.inline
    def setImportTaskIdsVarargs(value: ImportSnapshotTaskId*): Self = StObject.set(x, "ImportTaskIds", js.Array(value :_*))
    
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
