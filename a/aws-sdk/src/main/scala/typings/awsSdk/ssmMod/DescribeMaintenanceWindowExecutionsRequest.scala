package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowExecutionsRequest extends StObject {
  
  /**
    * Each entry in the array is a structure containing: Key (string, between 1 and 128 characters) Values (array of strings, each string is between 1 and 256 characters) The supported Keys are ExecutedBefore and ExecutedAfter with the value being a date/time string such as 2016-11-04T05:00:00Z.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * The ID of the maintenance window whose executions should be retrieved.
    */
  var WindowId: MaintenanceWindowId
}
object DescribeMaintenanceWindowExecutionsRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): DescribeMaintenanceWindowExecutionsRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsRequest]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowExecutionsRequestMutableBuilder[Self <: DescribeMaintenanceWindowExecutionsRequest] (val x: Self) extends AnyVal {
    
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
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
