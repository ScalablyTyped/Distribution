package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserSettingsResponse extends StObject {
  
  /**
    * The user settings.
    */
  var userSettings: js.UndefOr[UserSettings] = js.undefined
}
object GetUserSettingsResponse {
  
  inline def apply(): GetUserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "userSettings", js.undefined)
  }
}
