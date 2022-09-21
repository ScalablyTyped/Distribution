package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplaceRootVolumeTasksRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filter to use:    instance-id - The ID of the instance for which the root volume replacement task was created.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeReplaceRootVolumeTasksMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the root volume replacement task to view.
    */
  var ReplaceRootVolumeTaskIds: js.UndefOr[typings.awsSdk.ec2Mod.ReplaceRootVolumeTaskIds] = js.undefined
}
object DescribeReplaceRootVolumeTasksRequest {
  
  inline def apply(): DescribeReplaceRootVolumeTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplaceRootVolumeTasksRequest]
  }
  
  extension [Self <: DescribeReplaceRootVolumeTasksRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: DescribeReplaceRootVolumeTasksMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReplaceRootVolumeTaskIds(value: ReplaceRootVolumeTaskIds): Self = StObject.set(x, "ReplaceRootVolumeTaskIds", value.asInstanceOf[js.Any])
    
    inline def setReplaceRootVolumeTaskIdsUndefined: Self = StObject.set(x, "ReplaceRootVolumeTaskIds", js.undefined)
    
    inline def setReplaceRootVolumeTaskIdsVarargs(value: ReplaceRootVolumeTaskId*): Self = StObject.set(x, "ReplaceRootVolumeTaskIds", js.Array(value*))
  }
}
