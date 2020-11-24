package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrafficMirrorTargetsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. The possible values are:    description: The Traffic Mirror target description.    network-interface-id: The ID of the Traffic Mirror session network interface.    network-load-balancer-arn: The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the session.    owner-id: The ID of the account that owns the Traffic Mirror session.    traffic-mirror-target-id: The ID of the Traffic Mirror target.  
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
    * The ID of the Traffic Mirror targets.
    */
  var TrafficMirrorTargetIds: js.UndefOr[TrafficMirrorTargetIdList] = js.native
}
object DescribeTrafficMirrorTargetsRequest {
  
  @scala.inline
  def apply(): DescribeTrafficMirrorTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorTargetsRequest]
  }
  
  @scala.inline
  implicit class DescribeTrafficMirrorTargetsRequestOps[Self <: DescribeTrafficMirrorTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: TrafficMirroringMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorTargetIdsVarargs(value: TrafficMirrorTargetId*): Self = this.set("TrafficMirrorTargetIds", js.Array(value :_*))
    
    @scala.inline
    def setTrafficMirrorTargetIds(value: TrafficMirrorTargetIdList): Self = this.set("TrafficMirrorTargetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorTargetIds: Self = this.set("TrafficMirrorTargetIds", js.undefined)
  }
}
