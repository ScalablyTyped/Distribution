package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePublicIpv4PoolsRequest extends StObject {
  
  /**
    * One or more filters.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[PoolMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * The IDs of the address pools.
    */
  var PoolIds: js.UndefOr[PublicIpv4PoolIdStringList] = js.undefined
}
object DescribePublicIpv4PoolsRequest {
  
  inline def apply(): DescribePublicIpv4PoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePublicIpv4PoolsRequest]
  }
  
  extension [Self <: DescribePublicIpv4PoolsRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: PoolMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPoolIds(value: PublicIpv4PoolIdStringList): Self = StObject.set(x, "PoolIds", value.asInstanceOf[js.Any])
    
    inline def setPoolIdsUndefined: Self = StObject.set(x, "PoolIds", js.undefined)
    
    inline def setPoolIdsVarargs(value: Ipv4PoolEc2Id*): Self = StObject.set(x, "PoolIds", js.Array(value :_*))
  }
}
