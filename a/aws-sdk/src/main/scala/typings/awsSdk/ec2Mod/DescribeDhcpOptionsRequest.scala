package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDhcpOptionsRequest extends StObject {
  
  /**
    * The IDs of one or more DHCP options sets. Default: Describes all your DHCP options sets.
    */
  var DhcpOptionsIds: js.UndefOr[DhcpOptionsIdStringList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    dhcp-options-id - The ID of a DHCP options set.    key - The key for one of the options (for example, domain-name).    value - The value for one of the options.    owner-id - The ID of the AWS account that owns the DHCP options set.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeDhcpOptionsMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeDhcpOptionsRequest {
  
  @scala.inline
  def apply(): DescribeDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDhcpOptionsRequest]
  }
  
  @scala.inline
  implicit class DescribeDhcpOptionsRequestMutableBuilder[Self <: DescribeDhcpOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDhcpOptionsIds(value: DhcpOptionsIdStringList): Self = StObject.set(x, "DhcpOptionsIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsIdsUndefined: Self = StObject.set(x, "DhcpOptionsIds", js.undefined)
    
    @scala.inline
    def setDhcpOptionsIdsVarargs(value: DhcpOptionsId*): Self = StObject.set(x, "DhcpOptionsIds", js.Array(value :_*))
    
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
    def setMaxResults(value: DescribeDhcpOptionsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
