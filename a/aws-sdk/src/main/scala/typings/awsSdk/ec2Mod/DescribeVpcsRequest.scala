package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    cidr - The primary IPv4 CIDR block of the VPC. The CIDR block you specify must exactly match the VPC's CIDR block for information to be returned for the VPC. Must contain the slash followed by one or two digits (for example, /28).    cidr-block-association.cidr-block - An IPv4 CIDR block associated with the VPC.    cidr-block-association.association-id - The association ID for an IPv4 CIDR block associated with the VPC.    cidr-block-association.state - The state of an IPv4 CIDR block associated with the VPC.    dhcp-options-id - The ID of a set of DHCP options.    ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR block associated with the VPC.    ipv6-cidr-block-association.ipv6-pool - The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.    ipv6-cidr-block-association.association-id - The association ID for an IPv6 CIDR block associated with the VPC.    ipv6-cidr-block-association.state - The state of an IPv6 CIDR block associated with the VPC.    isDefault - Indicates whether the VPC is the default VPC.    owner-id - The ID of the AWS account that owns the VPC.    state - The state of the VPC (pending | available).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcsMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more VPC IDs. Default: Describes all your VPCs.
    */
  var VpcIds: js.UndefOr[VpcIdStringList] = js.native
}
object DescribeVpcsRequest {
  
  @scala.inline
  def apply(): DescribeVpcsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcsRequest]
  }
  
  @scala.inline
  implicit class DescribeVpcsRequestMutableBuilder[Self <: DescribeVpcsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: DescribeVpcsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcIds(value: VpcIdStringList): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    @scala.inline
    def setVpcIdsVarargs(value: VpcId*): Self = StObject.set(x, "VpcIds", js.Array(value :_*))
  }
}
