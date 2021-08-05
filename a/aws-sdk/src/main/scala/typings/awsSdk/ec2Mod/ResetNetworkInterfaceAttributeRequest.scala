package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetNetworkInterfaceAttributeRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
  
  /**
    * The source/destination checking attribute. Resets the value to true.
    */
  var SourceDestCheck: js.UndefOr[String] = js.undefined
}
object ResetNetworkInterfaceAttributeRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): ResetNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetNetworkInterfaceAttributeRequest]
  }
  
  extension [Self <: ResetNetworkInterfaceAttributeRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheck(value: String): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
