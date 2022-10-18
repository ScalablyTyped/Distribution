package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserSettingsRequest extends StObject {
  
  /**
    * The ARN of the user settings.
    */
  var userSettingsArn: ARN
}
object GetUserSettingsRequest {
  
  inline def apply(userSettingsArn: ARN): GetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(userSettingsArn = userSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserSettingsRequest]
  }
  
  extension [Self <: GetUserSettingsRequest](x: Self) {
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
  }
}
