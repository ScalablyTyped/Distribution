package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddResponseCookie extends StObject {
  
  var cookie: ResponseCookie
}
object AddResponseCookie {
  
  inline def apply(cookie: ResponseCookie): AddResponseCookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResponseCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddResponseCookie] (val x: Self) extends AnyVal {
    
    inline def setCookie(value: ResponseCookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
