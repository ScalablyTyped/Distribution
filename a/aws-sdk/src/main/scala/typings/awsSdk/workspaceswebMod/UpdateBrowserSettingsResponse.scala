package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBrowserSettingsResponse extends StObject {
  
  /**
    * The browser settings.
    */
  var browserSettings: BrowserSettings
}
object UpdateBrowserSettingsResponse {
  
  inline def apply(browserSettings: BrowserSettings): UpdateBrowserSettingsResponse = {
    val __obj = js.Dynamic.literal(browserSettings = browserSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrowserSettingsResponse]
  }
  
  extension [Self <: UpdateBrowserSettingsResponse](x: Self) {
    
    inline def setBrowserSettings(value: BrowserSettings): Self = StObject.set(x, "browserSettings", value.asInstanceOf[js.Any])
  }
}
