package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptchaAction extends StObject {
  
  /**
    * Defines custom handling for the web request, used when the CAPTCHA inspection determines that the request's token is valid and unexpired. For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide. 
    */
  var CustomRequestHandling: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CustomRequestHandling] = js.undefined
}
object CaptchaAction {
  
  inline def apply(): CaptchaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptchaAction]
  }
  
  extension [Self <: CaptchaAction](x: Self) {
    
    inline def setCustomRequestHandling(value: CustomRequestHandling): Self = StObject.set(x, "CustomRequestHandling", value.asInstanceOf[js.Any])
    
    inline def setCustomRequestHandlingUndefined: Self = StObject.set(x, "CustomRequestHandling", js.undefined)
  }
}
