package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBrowserSettingsRequest extends StObject {
  
  /**
    * The ARN of the browser settings.
    */
  var browserSettingsArn: ARN
}
object DeleteBrowserSettingsRequest {
  
  inline def apply(browserSettingsArn: ARN): DeleteBrowserSettingsRequest = {
    val __obj = js.Dynamic.literal(browserSettingsArn = browserSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBrowserSettingsRequest]
  }
  
  extension [Self <: DeleteBrowserSettingsRequest](x: Self) {
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
  }
}
