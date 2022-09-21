package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceStatusRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    availability-zone - The Availability Zone of the instance.    event.code - The code for the scheduled event (instance-reboot | system-reboot | system-maintenance | instance-retirement | instance-stop).    event.description - A description of the event.    event.instance-event-id - The ID of the event whose date and time you are modifying.    event.not-after - The latest end time for the scheduled event (for example, 2014-09-15T17:15:20.000Z).    event.not-before - The earliest start time for the scheduled event (for example, 2014-09-15T17:15:20.000Z).    event.not-before-deadline - The deadline for starting the event (for example, 2014-09-15T17:15:20.000Z).    instance-state-code - The code for the instance state, as a 16-bit unsigned integer. The high byte is used for internal purposes and should be ignored. The low byte is set based on the state represented. The valid values are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64 (stopping), and 80 (stopped).    instance-state-name - The state of the instance (pending | running | shutting-down | terminated | stopping | stopped).    instance-status.reachability - Filters on instance status where the name is reachability (passed | failed | initializing | insufficient-data).    instance-status.status - The status of the instance (ok | impaired | initializing | insufficient-data | not-applicable).    system-status.reachability - Filters on system status where the name is reachability (passed | failed | initializing | insufficient-data).    system-status.status - The system status of the instance (ok | impaired | initializing | insufficient-data | not-applicable).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * When true, includes the health status for all instances. When false, includes the health status for running instances only. Default: false 
    */
  var IncludeAllInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance IDs. Default: Describes all your instances. Constraints: Maximum 100 explicitly specified instance IDs.
    */
  var InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 5 and 1000. You cannot specify this parameter and the instance IDs parameter in the same call.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInstanceStatusRequest {
  
  inline def apply(): DescribeInstanceStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceStatusRequest]
  }
  
  extension [Self <: DescribeInstanceStatusRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIncludeAllInstances(value: Boolean): Self = StObject.set(x, "IncludeAllInstances", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllInstancesUndefined: Self = StObject.set(x, "IncludeAllInstances", js.undefined)
    
    inline def setInstanceIds(value: InstanceIdStringList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
