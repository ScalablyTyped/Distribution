package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes one or more cookies of response.
  * Note that it is preferred to use the Cookies API because this is computationally less expensive.
  */
trait RemoveResponseCookie
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RemoveResponseCookie
}
object RemoveResponseCookie {
  
  inline def apply(instanceType: String): RemoveResponseCookie = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RemoveResponseCookie")
    __obj.asInstanceOf[RemoveResponseCookie]
  }
  
  extension [Self <: RemoveResponseCookie](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RemoveResponseCookie): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
