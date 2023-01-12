package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserSettingsResponse extends StObject {
  
  /**
    * The ARN of the user settings.
    */
  var userSettingsArn: ARN
}
object CreateUserSettingsResponse {
  
  inline def apply(userSettingsArn: ARN): CreateUserSettingsResponse = {
    val __obj = js.Dynamic.literal(userSettingsArn = userSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
  }
}
