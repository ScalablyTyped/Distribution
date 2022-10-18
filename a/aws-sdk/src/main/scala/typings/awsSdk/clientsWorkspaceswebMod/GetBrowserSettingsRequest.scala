package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBrowserSettingsRequest extends StObject {
  
  /**
    * The ARN of the browser settings.
    */
  var browserSettingsArn: ARN
}
object GetBrowserSettingsRequest {
  
  inline def apply(browserSettingsArn: ARN): GetBrowserSettingsRequest = {
    val __obj = js.Dynamic.literal(browserSettingsArn = browserSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrowserSettingsRequest]
  }
  
  extension [Self <: GetBrowserSettingsRequest](x: Self) {
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
  }
}
