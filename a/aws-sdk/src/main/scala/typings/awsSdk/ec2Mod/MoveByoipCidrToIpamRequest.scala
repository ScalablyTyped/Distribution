package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveByoipCidrToIpamRequest extends StObject {
  
  /**
    * The BYOIP CIDR.
    */
  var Cidr: String
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPAM pool ID.
    */
  var IpamPoolId: typings.awsSdk.ec2Mod.IpamPoolId
  
  /**
    * The Amazon Web Services account ID of the owner of the IPAM pool.
    */
  var IpamPoolOwner: String
}
object MoveByoipCidrToIpamRequest {
  
  inline def apply(Cidr: String, IpamPoolId: IpamPoolId, IpamPoolOwner: String): MoveByoipCidrToIpamRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], IpamPoolId = IpamPoolId.asInstanceOf[js.Any], IpamPoolOwner = IpamPoolOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveByoipCidrToIpamRequest]
  }
  
  extension [Self <: MoveByoipCidrToIpamRequest](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolOwner(value: String): Self = StObject.set(x, "IpamPoolOwner", value.asInstanceOf[js.Any])
  }
}
