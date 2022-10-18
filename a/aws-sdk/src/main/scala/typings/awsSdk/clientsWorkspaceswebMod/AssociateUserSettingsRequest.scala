package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateUserSettingsRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
  
  /**
    * The ARN of the user settings.
    */
  var userSettingsArn: ARN
}
object AssociateUserSettingsRequest {
  
  inline def apply(portalArn: ARN, userSettingsArn: ARN): AssociateUserSettingsRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], userSettingsArn = userSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateUserSettingsRequest]
  }
  
  extension [Self <: AssociateUserSettingsRequest](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
  }
}
