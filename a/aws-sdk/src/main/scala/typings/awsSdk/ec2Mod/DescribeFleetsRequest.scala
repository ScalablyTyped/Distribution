package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    activity-status - The progress of the EC2 Fleet ( error | pending-fulfillment | pending-termination | fulfilled).    excess-capacity-termination-policy - Indicates whether to terminate running instances if the target capacity is decreased below the current EC2 Fleet size (true | false).    fleet-state - The state of the EC2 Fleet (submitted | active | deleted | failed | deleted-running | deleted-terminating | modifying).    replace-unhealthy-instances - Indicates whether EC2 Fleet should replace unhealthy instances (true | false).    type - The type of request (instant | request | maintain).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The ID of the EC2 Fleets.
    */
  var FleetIds: js.UndefOr[FleetIdSet] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetsRequest {
  
  inline def apply(): DescribeFleetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsRequest]
  }
  
  extension [Self <: DescribeFleetsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setFleetIds(value: FleetIdSet): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    inline def setFleetIdsUndefined: Self = StObject.set(x, "FleetIds", js.undefined)
    
    inline def setFleetIdsVarargs(value: FleetId*): Self = StObject.set(x, "FleetIds", js.Array(value :_*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
