package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  /**
    * What WAF should do if the body is larger than WAF can inspect. WAF does not support inspecting the entire contents of the body of a web request when the body exceeds 8 KB (8192 bytes). Only the first 8 KB of the request body are forwarded to WAF by the underlying host service.  The options for oversize handling are the following:    CONTINUE - Inspect the body normally, according to the rule inspection criteria.     MATCH - Treat the web request as matching the rule statement. WAF applies the rule action to the request.    NO_MATCH - Treat the web request as not matching the rule statement.   You can combine the MATCH or NO_MATCH settings for oversize handling with your rule and web ACL action settings, so that you block any request whose body is over 8 KB.  Default: CONTINUE 
    */
  var OversizeHandling: js.UndefOr[typings.awsSdk.clientsWafv2Mod.OversizeHandling] = js.undefined
}
object Body {
  
  inline def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    inline def setOversizeHandling(value: OversizeHandling): Self = StObject.set(x, "OversizeHandling", value.asInstanceOf[js.Any])
    
    inline def setOversizeHandlingUndefined: Self = StObject.set(x, "OversizeHandling", js.undefined)
  }
}
