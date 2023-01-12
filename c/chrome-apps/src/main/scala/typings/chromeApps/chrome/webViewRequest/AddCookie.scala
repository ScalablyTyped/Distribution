package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCookie[T] extends StObject {
  
  /**
    * Cookie to be added to the request.
    * No field may be undefined.
    * The name and value need to be specified.
    */
  var cookie: T
}
object AddCookie {
  
  inline def apply[T](cookie: T): AddCookie[T] = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCookie[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCookie[?], T] (val x: Self & AddCookie[T]) extends AnyVal {
    
    inline def setCookie(value: T): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
