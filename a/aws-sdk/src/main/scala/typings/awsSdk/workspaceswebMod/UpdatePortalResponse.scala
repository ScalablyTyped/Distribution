package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortalResponse extends StObject {
  
  /**
    * The web portal.
    */
  var portal: js.UndefOr[Portal] = js.undefined
}
object UpdatePortalResponse {
  
  inline def apply(): UpdatePortalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePortalResponse]
  }
  
  extension [Self <: UpdatePortalResponse](x: Self) {
    
    inline def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
  }
}
