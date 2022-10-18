package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserSettingsResponse extends StObject {
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The user settings.
    */
  var userSettings: js.UndefOr[UserSettingsList] = js.undefined
}
object ListUserSettingsResponse {
  
  inline def apply(): ListUserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserSettingsResponse]
  }
  
  extension [Self <: ListUserSettingsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUserSettings(value: UserSettingsList): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "userSettings", js.undefined)
    
    inline def setUserSettingsVarargs(value: UserSettingsSummary*): Self = StObject.set(x, "userSettings", js.Array(value*))
  }
}
