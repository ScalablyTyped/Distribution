package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Declarative event action that redirects a network request.  */
trait RedirectRequest
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RedirectRequest
}
object RedirectRequest {
  
  inline def apply(instanceType: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RedirectRequest")
    __obj.asInstanceOf[RedirectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RedirectRequest): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
