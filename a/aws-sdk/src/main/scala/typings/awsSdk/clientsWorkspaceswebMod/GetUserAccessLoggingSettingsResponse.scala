package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserAccessLoggingSettingsResponse extends StObject {
  
  /**
    * The user access logging settings.
    */
  var userAccessLoggingSettings: js.UndefOr[UserAccessLoggingSettings] = js.undefined
}
object GetUserAccessLoggingSettingsResponse {
  
  inline def apply(): GetUserAccessLoggingSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserAccessLoggingSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserAccessLoggingSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setUserAccessLoggingSettings(value: UserAccessLoggingSettings): Self = StObject.set(x, "userAccessLoggingSettings", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLoggingSettingsUndefined: Self = StObject.set(x, "userAccessLoggingSettings", js.undefined)
  }
}
