package typings.cookiebotSdk

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventMap extends StObject {
  
  var CookiebotOnAccept: Event
  
  var CookiebotOnConsentReady: Event
  
  var CookiebotOnDecline: Event
  
  var CookiebotOnDialogDisplay: Event
  
  var CookiebotOnDialogInit: Event
  
  var CookiebotOnLoad: Event
  
  var CookiebotOnTagsExecuted: Event
}
object WindowEventMap {
  
  inline def apply(
    CookiebotOnAccept: Event,
    CookiebotOnConsentReady: Event,
    CookiebotOnDecline: Event,
    CookiebotOnDialogDisplay: Event,
    CookiebotOnDialogInit: Event,
    CookiebotOnLoad: Event,
    CookiebotOnTagsExecuted: Event
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(CookiebotOnAccept = CookiebotOnAccept.asInstanceOf[js.Any], CookiebotOnConsentReady = CookiebotOnConsentReady.asInstanceOf[js.Any], CookiebotOnDecline = CookiebotOnDecline.asInstanceOf[js.Any], CookiebotOnDialogDisplay = CookiebotOnDialogDisplay.asInstanceOf[js.Any], CookiebotOnDialogInit = CookiebotOnDialogInit.asInstanceOf[js.Any], CookiebotOnLoad = CookiebotOnLoad.asInstanceOf[js.Any], CookiebotOnTagsExecuted = CookiebotOnTagsExecuted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowEventMap] (val x: Self) extends AnyVal {
    
    inline def setCookiebotOnAccept(value: Event): Self = StObject.set(x, "CookiebotOnAccept", value.asInstanceOf[js.Any])
    
    inline def setCookiebotOnConsentReady(value: Event): Self = StObject.set(x, "CookiebotOnConsentReady", value.asInstanceOf[js.Any])
    
    inline def setCookiebotOnDecline(value: Event): Self = StObject.set(x, "CookiebotOnDecline", value.asInstanceOf[js.Any])
    
    inline def setCookiebotOnDialogDisplay(value: Event): Self = StObject.set(x, "CookiebotOnDialogDisplay", value.asInstanceOf[js.Any])
    
    inline def setCookiebotOnDialogInit(value: Event): Self = StObject.set(x, "CookiebotOnDialogInit", value.asInstanceOf[js.Any])
    
    inline def setCookiebotOnLoad(value: Event): Self = StObject.set(x, "CookiebotOnLoad", value.asInstanceOf[js.Any])
    
    inline def setCookiebotOnTagsExecuted(value: Event): Self = StObject.set(x, "CookiebotOnTagsExecuted", value.asInstanceOf[js.Any])
  }
}
