package typings.cookiebotSdk

import typings.cookiebotSdk.anon.Consent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Cookiebot: js.UndefOr[Consent] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setCookiebot(value: Consent): Self = StObject.set(x, "Cookiebot", value.asInstanceOf[js.Any])
    
    inline def setCookiebotUndefined: Self = StObject.set(x, "Cookiebot", js.undefined)
  }
}
