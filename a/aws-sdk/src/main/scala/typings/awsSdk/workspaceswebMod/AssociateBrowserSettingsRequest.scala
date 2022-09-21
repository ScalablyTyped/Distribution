package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateBrowserSettingsRequest extends StObject {
  
  /**
    * The ARN of the browser settings.
    */
  var browserSettingsArn: ARN
  
  /**
    * The ARN of the web portal.
    */
  var portalArn: ARN
}
object AssociateBrowserSettingsRequest {
  
  inline def apply(browserSettingsArn: ARN, portalArn: ARN): AssociateBrowserSettingsRequest = {
    val __obj = js.Dynamic.literal(browserSettingsArn = browserSettingsArn.asInstanceOf[js.Any], portalArn = portalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateBrowserSettingsRequest]
  }
  
  extension [Self <: AssociateBrowserSettingsRequest](x: Self) {
    
    inline def setBrowserSettingsArn(value: ARN): Self = StObject.set(x, "browserSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
  }
}
