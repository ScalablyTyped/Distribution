package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveRequestHeaderParams extends StObject {
  
  /** HTTP request header name (case-insensitive) */
  var name: String
}
object RemoveRequestHeaderParams {
  
  inline def apply(name: String): RemoveRequestHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRequestHeaderParams]
  }
  
  extension [Self <: RemoveRequestHeaderParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
