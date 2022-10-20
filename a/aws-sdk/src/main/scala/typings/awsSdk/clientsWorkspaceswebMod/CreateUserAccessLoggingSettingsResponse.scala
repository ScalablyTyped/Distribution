package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserAccessLoggingSettingsResponse extends StObject {
  
  /**
    * The ARN of the user access logging settings.
    */
  var userAccessLoggingSettingsArn: ARN
}
object CreateUserAccessLoggingSettingsResponse {
  
  inline def apply(userAccessLoggingSettingsArn: ARN): CreateUserAccessLoggingSettingsResponse = {
    val __obj = js.Dynamic.literal(userAccessLoggingSettingsArn = userAccessLoggingSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserAccessLoggingSettingsResponse]
  }
  
  extension [Self <: CreateUserAccessLoggingSettingsResponse](x: Self) {
    
    inline def setUserAccessLoggingSettingsArn(value: ARN): Self = StObject.set(x, "userAccessLoggingSettingsArn", value.asInstanceOf[js.Any])
  }
}
