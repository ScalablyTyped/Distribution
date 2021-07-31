package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowScheduleRequest extends StObject {
  
  /**
    * Filters used to limit the range of results. For example, you can limit maintenance window executions to only those scheduled before or after a certain date and time.
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * The type of resource you want to retrieve information about. For example, "INSTANCE".
    */
  var ResourceType: js.UndefOr[MaintenanceWindowResourceType] = js.undefined
  
  /**
    * The instance ID or key/value pair to retrieve information about.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
  
  /**
    * The ID of the maintenance window to retrieve information about.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}
object DescribeMaintenanceWindowScheduleRequest {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowScheduleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleRequest]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowScheduleRequestMutableBuilder[Self <: DescribeMaintenanceWindowScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: PatchOrchestratorFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: PatchOrchestratorFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaintenanceWindowSearchMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceType(value: MaintenanceWindowResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
