package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sets the request header of the specified name to the specified value.
  * If a header with the specified name did not exist before, a new one is created.
  * Header name comparison is always case-insensitive.
  * Each request header name occurs only once in each request.
  */
trait SetRequestHeader
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.SetRequestHeader
}
object SetRequestHeader {
  
  inline def apply(instanceType: String): SetRequestHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "SetRequestHeader")
    __obj.asInstanceOf[SetRequestHeader]
  }
  
  extension [Self <: SetRequestHeader](x: Self) {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.SetRequestHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
