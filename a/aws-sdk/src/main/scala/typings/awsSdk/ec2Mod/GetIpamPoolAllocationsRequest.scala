package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamPoolAllocationsRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters for the request. For more information about filtering, see Filtering CLI output.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The ID of the allocation.
    */
  var IpamPoolAllocationId: js.UndefOr[typings.awsSdk.ec2Mod.IpamPoolAllocationId] = js.undefined
  
  /**
    * The ID of the IPAM pool you want to see the allocations for.
    */
  var IpamPoolId: typings.awsSdk.ec2Mod.IpamPoolId
  
  /**
    * The maximum number of results you would like returned per page.
    */
  var MaxResults: js.UndefOr[GetIpamPoolAllocationsMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object GetIpamPoolAllocationsRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): GetIpamPoolAllocationsRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpamPoolAllocationsRequest]
  }
  
  extension [Self <: GetIpamPoolAllocationsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIpamPoolAllocationId(value: IpamPoolAllocationId): Self = StObject.set(x, "IpamPoolAllocationId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolAllocationIdUndefined: Self = StObject.set(x, "IpamPoolAllocationId", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: GetIpamPoolAllocationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
