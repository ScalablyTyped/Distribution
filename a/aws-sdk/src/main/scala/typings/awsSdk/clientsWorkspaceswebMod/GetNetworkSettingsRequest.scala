package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkSettingsRequest extends StObject {
  
  /**
    * The ARN of the network settings.
    */
  var networkSettingsArn: ARN
}
object GetNetworkSettingsRequest {
  
  inline def apply(networkSettingsArn: ARN): GetNetworkSettingsRequest = {
    val __obj = js.Dynamic.literal(networkSettingsArn = networkSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
  }
}
