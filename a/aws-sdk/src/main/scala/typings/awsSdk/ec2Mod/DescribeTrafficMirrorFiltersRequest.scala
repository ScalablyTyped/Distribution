package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrafficMirrorFiltersRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. The possible values are:    description: The Traffic Mirror filter description.    traffic-mirror-filter-id: The ID of the Traffic Mirror filter.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TrafficMirroringMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterIds: js.UndefOr[TrafficMirrorFilterIdList] = js.native
}
object DescribeTrafficMirrorFiltersRequest {
  
  @scala.inline
  def apply(): DescribeTrafficMirrorFiltersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorFiltersRequest]
  }
  
  @scala.inline
  implicit class DescribeTrafficMirrorFiltersRequestMutableBuilder[Self <: DescribeTrafficMirrorFiltersRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: TrafficMirroringMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterIds(value: TrafficMirrorFilterIdList): Self = StObject.set(x, "TrafficMirrorFilterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterIdsUndefined: Self = StObject.set(x, "TrafficMirrorFilterIds", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterIdsVarargs(value: TrafficMirrorFilterId*): Self = StObject.set(x, "TrafficMirrorFilterIds", js.Array(value :_*))
  }
}
