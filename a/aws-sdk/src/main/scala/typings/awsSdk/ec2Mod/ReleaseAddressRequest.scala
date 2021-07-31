package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseAddressRequest extends StObject {
  
  /**
    * [EC2-VPC] The allocation ID. Required for EC2-VPC.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.ec2Mod.AllocationId] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses. If you provide an incorrect network border group, you will receive an InvalidAddress.NotFound error. For more information, see Error Codes.  You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will receive an InvalidParameterCombination error. For more information, see Error Codes. 
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.undefined
  
  /**
    * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object ReleaseAddressRequest {
  
  @scala.inline
  def apply(): ReleaseAddressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseAddressRequest]
  }
  
  @scala.inline
  implicit class ReleaseAddressRequestMutableBuilder[Self <: ReleaseAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
