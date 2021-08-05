package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectRequest extends StObject {
  
  var redirectUrl: String
}
object RedirectRequest {
  
  inline def apply(redirectUrl: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
  
  extension [Self <: RedirectRequest](x: Self) {
    
    inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
  }
}
