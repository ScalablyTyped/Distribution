package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetAddressAttributeRequest extends StObject {
  
  /**
    * [EC2-VPC] The allocation ID.
    */
  var AllocationId: typings.awsSdk.ec2Mod.AllocationId
  
  /**
    * The attribute of the IP address.
    */
  var Attribute: AddressAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object ResetAddressAttributeRequest {
  
  inline def apply(AllocationId: AllocationId, Attribute: AddressAttributeName): ResetAddressAttributeRequest = {
    val __obj = js.Dynamic.literal(AllocationId = AllocationId.asInstanceOf[js.Any], Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetAddressAttributeRequest]
  }
  
  extension [Self <: ResetAddressAttributeRequest](x: Self) {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAttribute(value: AddressAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
