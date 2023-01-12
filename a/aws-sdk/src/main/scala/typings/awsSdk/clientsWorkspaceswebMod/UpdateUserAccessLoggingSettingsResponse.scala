package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserAccessLoggingSettingsResponse extends StObject {
  
  /**
    * The user access logging settings.
    */
  var userAccessLoggingSettings: UserAccessLoggingSettings
}
object UpdateUserAccessLoggingSettingsResponse {
  
  inline def apply(userAccessLoggingSettings: UserAccessLoggingSettings): UpdateUserAccessLoggingSettingsResponse = {
    val __obj = js.Dynamic.literal(userAccessLoggingSettings = userAccessLoggingSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserAccessLoggingSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUserAccessLoggingSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setUserAccessLoggingSettings(value: UserAccessLoggingSettings): Self = StObject.set(x, "userAccessLoggingSettings", value.asInstanceOf[js.Any])
  }
}
