package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateUserAccessLoggingSettingsResponse extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
  
  /**
    * The ARN of the user access logging settings.
    */
  var userAccessLoggingSettingsArn: ARN
}
object AssociateUserAccessLoggingSettingsResponse {
  
  inline def apply(portalArn: ARN, userAccessLoggingSettingsArn: ARN): AssociateUserAccessLoggingSettingsResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], userAccessLoggingSettingsArn = userAccessLoggingSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateUserAccessLoggingSettingsResponse]
  }
  
  extension [Self <: AssociateUserAccessLoggingSettingsResponse](x: Self) {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLoggingSettingsArn(value: ARN): Self = StObject.set(x, "userAccessLoggingSettingsArn", value.asInstanceOf[js.Any])
  }
}
