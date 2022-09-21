package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBrowserSettingsResponse extends StObject {
  
  /**
    * The ARN of the browser settings.
    */
  var browserSettingsArn: ARN
}
object CreateBrowserSettingsResponse {
  
  inline def apply(browserSettingsArn: ARN): CreateBrowserSettingsResponse = {
    val __obj = js.Dynamic.literal(browserSettingsArn = browserSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBrowserSettingsResponse]
  }
  
  extension [Self <: CreateBrowserSettingsResponse](x: Self) {
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
  }
}
