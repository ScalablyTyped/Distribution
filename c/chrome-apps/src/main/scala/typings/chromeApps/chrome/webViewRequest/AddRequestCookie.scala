package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
trait AddRequestCookie
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.AddRequestCookie
}
object AddRequestCookie {
  
  inline def apply(instanceType: String): AddRequestCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "AddRequestCookie")
    __obj.asInstanceOf[AddRequestCookie]
  }
  
  extension [Self <: AddRequestCookie](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.AddRequestCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
