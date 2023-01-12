package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPortalResponse extends StObject {
  
  /**
    * The web portal.
    */
  var portal: js.UndefOr[Portal] = js.undefined
}
object GetPortalResponse {
  
  inline def apply(): GetPortalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPortalResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPortalResponse] (val x: Self) extends AnyVal {
    
    inline def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
  }
}
