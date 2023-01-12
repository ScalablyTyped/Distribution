package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkSettingsRequest extends StObject {
  
  /**
    * The ARN of the network settings.
    */
  var networkSettingsArn: ARN
}
object DeleteNetworkSettingsRequest {
  
  inline def apply(networkSettingsArn: ARN): DeleteNetworkSettingsRequest = {
    val __obj = js.Dynamic.literal(networkSettingsArn = networkSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNetworkSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
  }
}
