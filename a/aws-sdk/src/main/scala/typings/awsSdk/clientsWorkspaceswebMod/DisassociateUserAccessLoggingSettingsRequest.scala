package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateUserAccessLoggingSettingsRequest extends StObject {
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object DisassociateUserAccessLoggingSettingsRequest {
  
  inline def apply(portalArn: ARN): DisassociateUserAccessLoggingSettingsRequest = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateUserAccessLoggingSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateUserAccessLoggingSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
