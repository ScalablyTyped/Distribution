package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddResponseHeaderParams extends StObject {
  
  /** HTTP response header name */
  var name: String
  
  /** HTTP response header value */
  var value: String
}
object AddResponseHeaderParams {
  
  inline def apply(name: String, value: String): AddResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResponseHeaderParams]
  }
  
  extension [Self <: AddResponseHeaderParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
