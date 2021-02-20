package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectRequest extends StObject {
  
  var redirectUrl: String = js.native
}
object RedirectRequest {
  
  @scala.inline
  def apply(redirectUrl: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
  
  @scala.inline
  implicit class RedirectRequestMutableBuilder[Self <: RedirectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
  }
}
