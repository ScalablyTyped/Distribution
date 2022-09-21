package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamPoolAllocationsResult extends StObject {
  
  /**
    * The IPAM pool allocations you want information on.
    */
  var IpamPoolAllocations: js.UndefOr[IpamPoolAllocationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object GetIpamPoolAllocationsResult {
  
  inline def apply(): GetIpamPoolAllocationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIpamPoolAllocationsResult]
  }
  
  extension [Self <: GetIpamPoolAllocationsResult](x: Self) {
    
    inline def setIpamPoolAllocations(value: IpamPoolAllocationSet): Self = StObject.set(x, "IpamPoolAllocations", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolAllocationsUndefined: Self = StObject.set(x, "IpamPoolAllocations", js.undefined)
    
    inline def setIpamPoolAllocationsVarargs(value: IpamPoolAllocation*): Self = StObject.set(x, "IpamPoolAllocations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
