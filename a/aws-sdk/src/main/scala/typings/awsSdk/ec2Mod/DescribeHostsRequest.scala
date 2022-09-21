package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHostsRequest extends StObject {
  
  /**
    * The filters.    auto-placement - Whether auto-placement is enabled or disabled (on | off).    availability-zone - The Availability Zone of the host.    client-token - The idempotency token that you provided when you allocated the host.    host-reservation-id - The ID of the reservation assigned to this host.    instance-type - The instance type size that the Dedicated Host is configured to support.    state - The allocation state of the Dedicated Host (available | under-assessment | permanent-failure | released | released-permanent-failure).    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filter: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
    */
  var HostIds: js.UndefOr[RequestHostIdList] = js.undefined
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error. You cannot specify this parameter and the host IDs parameter in the same request.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeHostsRequest {
  
  inline def apply(): DescribeHostsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostsRequest]
  }
  
  extension [Self <: DescribeHostsRequest](x: Self) {
    
    inline def setFilter(value: FilterList): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setFilterVarargs(value: Filter*): Self = StObject.set(x, "Filter", js.Array(value*))
    
    inline def setHostIds(value: RequestHostIdList): Self = StObject.set(x, "HostIds", value.asInstanceOf[js.Any])
    
    inline def setHostIdsUndefined: Self = StObject.set(x, "HostIds", js.undefined)
    
    inline def setHostIdsVarargs(value: DedicatedHostId*): Self = StObject.set(x, "HostIds", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
