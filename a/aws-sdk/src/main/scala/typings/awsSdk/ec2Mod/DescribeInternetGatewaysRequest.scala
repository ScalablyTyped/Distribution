package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInternetGatewaysRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    attachment.state - The current state of the attachment between the gateway and the VPC (available). Present only if a VPC is attached.    attachment.vpc-id - The ID of an attached VPC.    internet-gateway-id - The ID of the Internet gateway.    owner-id - The ID of the AWS account that owns the internet gateway.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * One or more internet gateway IDs. Default: Describes all your internet gateways.
    */
  var InternetGatewayIds: js.UndefOr[InternetGatewayIdList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeInternetGatewaysMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeInternetGatewaysRequest {
  
  @scala.inline
  def apply(): DescribeInternetGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInternetGatewaysRequest]
  }
  
  @scala.inline
  implicit class DescribeInternetGatewaysRequestMutableBuilder[Self <: DescribeInternetGatewaysRequest] (val x: Self) extends AnyVal {
    
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
    def setInternetGatewayIds(value: InternetGatewayIdList): Self = StObject.set(x, "InternetGatewayIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternetGatewayIdsUndefined: Self = StObject.set(x, "InternetGatewayIds", js.undefined)
    
    @scala.inline
    def setInternetGatewayIdsVarargs(value: InternetGatewayId*): Self = StObject.set(x, "InternetGatewayIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeInternetGatewaysMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
