package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionIpamPoolCidrRequest extends StObject {
  
  /**
    * The CIDR you want to assign to the IPAM pool.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * A signed document that proves that you are authorized to bring a specified IP address range to Amazon using BYOIP. This option applies to public pools only.
    */
  var CidrAuthorizationContext: js.UndefOr[IpamCidrAuthorizationContext] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the IPAM pool to which you want to assign a CIDR.
    */
  var IpamPoolId: typings.awsSdk.ec2Mod.IpamPoolId
}
object ProvisionIpamPoolCidrRequest {
  
  inline def apply(IpamPoolId: IpamPoolId): ProvisionIpamPoolCidrRequest = {
    val __obj = js.Dynamic.literal(IpamPoolId = IpamPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionIpamPoolCidrRequest]
  }
  
  extension [Self <: ProvisionIpamPoolCidrRequest](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrAuthorizationContext(value: IpamCidrAuthorizationContext): Self = StObject.set(x, "CidrAuthorizationContext", value.asInstanceOf[js.Any])
    
    inline def setCidrAuthorizationContextUndefined: Self = StObject.set(x, "CidrAuthorizationContext", js.undefined)
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
  }
}
