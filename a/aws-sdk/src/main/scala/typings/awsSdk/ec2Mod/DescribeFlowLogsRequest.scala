package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowLogsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    deliver-log-status - The status of the logs delivery (SUCCESS | FAILED).    log-destination-type - The type of destination to which the flow log publishes data. Possible destination types include cloud-watch-logs and s3.    flow-log-id - The ID of the flow log.    log-group-name - The name of the log group.    resource-id - The ID of the VPC, subnet, or network interface.    traffic-type - The type of traffic (ACCEPT | REJECT | ALL).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filter: js.UndefOr[FilterList] = js.undefined
  
  /**
    * One or more flow log IDs. Constraint: Maximum of 1000 flow log IDs.
    */
  var FlowLogIds: js.UndefOr[FlowLogIdList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFlowLogsRequest {
  
  @scala.inline
  def apply(): DescribeFlowLogsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowLogsRequest]
  }
  
  @scala.inline
  implicit class DescribeFlowLogsRequestMutableBuilder[Self <: DescribeFlowLogsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterList): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: Filter*): Self = StObject.set(x, "Filter", js.Array(value :_*))
    
    @scala.inline
    def setFlowLogIds(value: FlowLogIdList): Self = StObject.set(x, "FlowLogIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogIdsUndefined: Self = StObject.set(x, "FlowLogIds", js.undefined)
    
    @scala.inline
    def setFlowLogIdsVarargs(value: VpcFlowLogId*): Self = StObject.set(x, "FlowLogIds", js.Array(value :_*))
    
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
