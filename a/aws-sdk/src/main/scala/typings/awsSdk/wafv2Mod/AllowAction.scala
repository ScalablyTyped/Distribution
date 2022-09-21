package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowAction extends StObject {
  
  /**
    * Defines custom handling for the web request. For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide. 
    */
  var CustomRequestHandling: js.UndefOr[typings.awsSdk.wafv2Mod.CustomRequestHandling] = js.undefined
}
object AllowAction {
  
  inline def apply(): AllowAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAction]
  }
  
  extension [Self <: AllowAction](x: Self) {
    
    inline def setCustomRequestHandling(value: CustomRequestHandling): Self = StObject.set(x, "CustomRequestHandling", value.asInstanceOf[js.Any])
    
    inline def setCustomRequestHandlingUndefined: Self = StObject.set(x, "CustomRequestHandling", js.undefined)
  }
}
