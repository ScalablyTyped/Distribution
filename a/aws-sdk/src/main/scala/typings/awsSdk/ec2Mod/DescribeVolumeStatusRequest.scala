package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumeStatusRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    action.code - The action code for the event (for example, enable-volume-io).    action.description - A description of the action.    action.event-id - The event ID associated with the action.    availability-zone - The Availability Zone of the instance.    event.description - A description of the event.    event.event-id - The event ID.    event.event-type - The event type (for io-enabled: passed | failed; for io-performance: io-performance:degraded | io-performance:severely-degraded | io-performance:stalled).    event.not-after - The latest end time for the event.    event.not-before - The earliest start time for the event.    volume-status.details-name - The cause for volume-status.status (io-enabled | io-performance).    volume-status.details-status - The status of volume-status.details-name (for io-enabled: passed | failed; for io-performance: normal | degraded | severely-degraded | stalled).    volume-status.status - The status of the volume (ok | impaired | warning | insufficient-data).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of volume results returned by DescribeVolumeStatus in paginated output. When this parameter is used, the request only returns MaxResults results in a single page along with a NextToken response element. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. This value can be between 5 and 1000; if MaxResults is given a value larger than 1000, only 1000 results are returned. If this parameter is not used, then DescribeVolumeStatus returns all results. You cannot specify this parameter and the volume IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The NextToken value to include in a future DescribeVolumeStatus request. When the results of the request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the volumes. Default: Describes all your volumes.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.native
}
object DescribeVolumeStatusRequest {
  
  @scala.inline
  def apply(): DescribeVolumeStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumeStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeVolumeStatusRequestMutableBuilder[Self <: DescribeVolumeStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setVolumeIds(value: VolumeIdStringList): Self = StObject.set(x, "VolumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdsUndefined: Self = StObject.set(x, "VolumeIds", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: VolumeId*): Self = StObject.set(x, "VolumeIds", js.Array(value :_*))
  }
}
