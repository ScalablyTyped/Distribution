package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBrowserSettingsResponse extends StObject {
  
  /**
    * The browser settings.
    */
  var browserSettings: js.UndefOr[BrowserSettings] = js.undefined
}
object GetBrowserSettingsResponse {
  
  inline def apply(): GetBrowserSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBrowserSettingsResponse]
  }
  
  extension [Self <: GetBrowserSettingsResponse](x: Self) {
    
    inline def setBrowserSettings(value: BrowserSettings): Self = StObject.set(x, "browserSettings", value.asInstanceOf[js.Any])
    
    inline def setBrowserSettingsUndefined: Self = StObject.set(x, "browserSettings", js.undefined)
  }
}
