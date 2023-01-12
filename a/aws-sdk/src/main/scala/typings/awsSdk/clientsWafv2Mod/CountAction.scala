package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountAction extends StObject {
  
  /**
    * Defines custom handling for the web request. For information about customizing web requests and responses, see Customizing web requests and responses in WAF in the WAF Developer Guide. 
    */
  var CustomRequestHandling: js.UndefOr[typings.awsSdk.clientsWafv2Mod.CustomRequestHandling] = js.undefined
}
object CountAction {
  
  inline def apply(): CountAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountAction] (val x: Self) extends AnyVal {
    
    inline def setCustomRequestHandling(value: CustomRequestHandling): Self = StObject.set(x, "CustomRequestHandling", value.asInstanceOf[js.Any])
    
    inline def setCustomRequestHandlingUndefined: Self = StObject.set(x, "CustomRequestHandling", js.undefined)
  }
}
