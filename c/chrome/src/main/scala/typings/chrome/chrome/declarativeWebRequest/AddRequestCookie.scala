package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRequestCookie extends StObject {
  
  var cookie: RequestCookie = js.native
}
object AddRequestCookie {
  
  @scala.inline
  def apply(cookie: RequestCookie): AddRequestCookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRequestCookie]
  }
  
  @scala.inline
  implicit class AddRequestCookieMutableBuilder[Self <: AddRequestCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: RequestCookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
