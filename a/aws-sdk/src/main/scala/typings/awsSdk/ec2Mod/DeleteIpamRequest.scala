package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamRequest extends StObject {
  
  /**
    * Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the pools in private scopes. You cannot delete the IPAM with this option if there is a pool in your public scope. If you use this option, IPAM does the following:   Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.  No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource will no longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.    Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.   Deletes all IPAM pools in private scopes.   Deletes all non-default private scopes in the IPAM.   Deletes the default public and private scopes and the IPAM.  
    */
  var Cascade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM to delete.
    */
  var IpamId: typings.awsSdk.ec2Mod.IpamId
}
object DeleteIpamRequest {
  
  inline def apply(IpamId: IpamId): DeleteIpamRequest = {
    val __obj = js.Dynamic.literal(IpamId = IpamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpamRequest]
  }
  
  extension [Self <: DeleteIpamRequest](x: Self) {
    
    inline def setCascade(value: Boolean): Self = StObject.set(x, "Cascade", value.asInstanceOf[js.Any])
    
    inline def setCascadeUndefined: Self = StObject.set(x, "Cascade", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamId(value: IpamId): Self = StObject.set(x, "IpamId", value.asInstanceOf[js.Any])
  }
}
