package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserAccessLoggingSettingsResponse extends StObject {
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The user access logging settings.
    */
  var userAccessLoggingSettings: js.UndefOr[UserAccessLoggingSettingsList] = js.undefined
}
object ListUserAccessLoggingSettingsResponse {
  
  inline def apply(): ListUserAccessLoggingSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserAccessLoggingSettingsResponse]
  }
  
  extension [Self <: ListUserAccessLoggingSettingsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUserAccessLoggingSettings(value: UserAccessLoggingSettingsList): Self = StObject.set(x, "userAccessLoggingSettings", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLoggingSettingsUndefined: Self = StObject.set(x, "userAccessLoggingSettings", js.undefined)
    
    inline def setUserAccessLoggingSettingsVarargs(value: UserAccessLoggingSettingsSummary*): Self = StObject.set(x, "userAccessLoggingSettings", js.Array(value*))
  }
}
