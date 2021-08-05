package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDhcpOptionsRequest extends StObject {
  
  /**
    * The ID of the DHCP options set.
    */
  var DhcpOptionsId: typings.awsSdk.ec2Mod.DhcpOptionsId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object DeleteDhcpOptionsRequest {
  
  inline def apply(DhcpOptionsId: DhcpOptionsId): DeleteDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDhcpOptionsRequest]
  }
  
  extension [Self <: DeleteDhcpOptionsRequest](x: Self) {
    
    inline def setDhcpOptionsId(value: DhcpOptionsId): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
