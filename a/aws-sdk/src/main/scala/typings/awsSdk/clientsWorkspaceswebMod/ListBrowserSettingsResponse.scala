package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBrowserSettingsResponse extends StObject {
  
  /**
    * The browser settings.
    */
  var browserSettings: js.UndefOr[BrowserSettingsList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListBrowserSettingsResponse {
  
  inline def apply(): ListBrowserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBrowserSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBrowserSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setBrowserSettings(value: BrowserSettingsList): Self = StObject.set(x, "browserSettings", value.asInstanceOf[js.Any])
    
    inline def setBrowserSettingsUndefined: Self = StObject.set(x, "browserSettings", js.undefined)
    
    inline def setBrowserSettingsVarargs(value: BrowserSettingsSummary*): Self = StObject.set(x, "browserSettings", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
