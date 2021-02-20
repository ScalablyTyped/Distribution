package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledInstancesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    availability-zone - The Availability Zone (for example, us-west-2a).    instance-type - The instance type (for example, c4.large).    network-platform - The network platform (EC2-Classic or EC2-VPC).    platform - The platform (Linux/UNIX or Windows).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value is 100. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The Scheduled Instance IDs.
    */
  var ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet] = js.native
  
  /**
    * The time period for the first schedule to start.
    */
  var SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest] = js.native
}
object DescribeScheduledInstancesRequest {
  
  @scala.inline
  def apply(): DescribeScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledInstancesRequest]
  }
  
  @scala.inline
  implicit class DescribeScheduledInstancesRequestMutableBuilder[Self <: DescribeScheduledInstancesRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduledInstanceIds(value: ScheduledInstanceIdRequestSet): Self = StObject.set(x, "ScheduledInstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstanceIdsUndefined: Self = StObject.set(x, "ScheduledInstanceIds", js.undefined)
    
    @scala.inline
    def setScheduledInstanceIdsVarargs(value: ScheduledInstanceId*): Self = StObject.set(x, "ScheduledInstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setSlotStartTimeRange(value: SlotStartTimeRangeRequest): Self = StObject.set(x, "SlotStartTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotStartTimeRangeUndefined: Self = StObject.set(x, "SlotStartTimeRange", js.undefined)
  }
}
