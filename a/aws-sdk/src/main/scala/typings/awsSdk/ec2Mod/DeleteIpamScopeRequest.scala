package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIpamScopeRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the scope to delete.
    */
  var IpamScopeId: typings.awsSdk.ec2Mod.IpamScopeId
}
object DeleteIpamScopeRequest {
  
  inline def apply(IpamScopeId: IpamScopeId): DeleteIpamScopeRequest = {
    val __obj = js.Dynamic.literal(IpamScopeId = IpamScopeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpamScopeRequest]
  }
  
  extension [Self <: DeleteIpamScopeRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
  }
}
