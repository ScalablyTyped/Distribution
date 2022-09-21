package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressesAttributeRequest extends StObject {
  
  /**
    * [EC2-VPC] The allocation IDs.
    */
  var AllocationIds: js.UndefOr[typings.awsSdk.ec2Mod.AllocationIds] = js.undefined
  
  /**
    * The attribute of the IP address.
    */
  var Attribute: js.UndefOr[AddressAttributeName] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[AddressMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeAddressesAttributeRequest {
  
  inline def apply(): DescribeAddressesAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesAttributeRequest]
  }
  
  extension [Self <: DescribeAddressesAttributeRequest](x: Self) {
    
    inline def setAllocationIds(value: AllocationIds): Self = StObject.set(x, "AllocationIds", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdsUndefined: Self = StObject.set(x, "AllocationIds", js.undefined)
    
    inline def setAllocationIdsVarargs(value: AllocationId*): Self = StObject.set(x, "AllocationIds", js.Array(value*))
    
    inline def setAttribute(value: AddressAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxResults(value: AddressMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
