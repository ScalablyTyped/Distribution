package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes the request header of the specified name.
  * Do not use SetRequestHeader and RemoveRequestHeader with
  * the same header name on the same request.
  * Each request header name occurs only once in each request.
  */
trait RemoveRequestHeader
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  /* protected */ val typeGuard: typings.chromeApps.chromeAppsStrings.RemoveRequestHeader
}
object RemoveRequestHeader {
  
  inline def apply(instanceType: String): RemoveRequestHeader = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "RemoveRequestHeader")
    __obj.asInstanceOf[RemoveRequestHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveRequestHeader] (val x: Self) extends AnyVal {
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.RemoveRequestHeader): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
