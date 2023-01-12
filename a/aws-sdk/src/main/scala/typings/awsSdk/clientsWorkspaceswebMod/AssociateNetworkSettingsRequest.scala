package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateNetworkSettingsRequest extends StObject {
  
  /**
    * The ARN of the network settings.
    */
  var networkSettingsArn: ARN
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object AssociateNetworkSettingsRequest {
  
  inline def apply(networkSettingsArn: ARN, portalArn: ARN): AssociateNetworkSettingsRequest = {
    val __obj = js.Dynamic.literal(networkSettingsArn = networkSettingsArn.asInstanceOf[js.Any], portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateNetworkSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateNetworkSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setNetworkSettingsArn(value: ARN): Self = StObject.set(x, "networkSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
