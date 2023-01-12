package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveResponseCookie extends StObject {
  
  var filter: ResponseCookie
}
object RemoveResponseCookie {
  
  inline def apply(filter: ResponseCookie): RemoveResponseCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResponseCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveResponseCookie] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ResponseCookie): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
