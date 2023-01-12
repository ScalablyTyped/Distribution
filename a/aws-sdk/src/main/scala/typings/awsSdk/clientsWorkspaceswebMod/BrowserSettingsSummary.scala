package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSettingsSummary extends StObject {
  
  /**
    * The ARN of the browser settings.
    */
  var browserSettingsArn: js.UndefOr[ARN] = js.undefined
}
object BrowserSettingsSummary {
  
  inline def apply(): BrowserSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSettingsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSettingsSummary] (val x: Self) extends AnyVal {
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setBrowserSettingsArnUndefined: Self = StObject.set(x, "browserSettingsArn", js.undefined)
  }
}
