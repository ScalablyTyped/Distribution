package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserSettingsRequest extends StObject {
  
  /**
    * The ARN of the user settings.
    */
  var userSettingsArn: ARN
}
object DeleteUserSettingsRequest {
  
  inline def apply(userSettingsArn: ARN): DeleteUserSettingsRequest = {
    val __obj = js.Dynamic.literal(userSettingsArn = userSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserSettingsRequest]
  }
  
  extension [Self <: DeleteUserSettingsRequest](x: Self) {
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
  }
}
