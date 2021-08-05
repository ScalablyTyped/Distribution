package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRequestHeaderParams extends StObject {
  
  /** HTTP request header name */
  var name: String
  
  /** HTTP request header value */
  var value: String
}
object SetRequestHeaderParams {
  
  inline def apply(name: String, value: String): SetRequestHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRequestHeaderParams]
  }
  
  extension [Self <: SetRequestHeaderParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
