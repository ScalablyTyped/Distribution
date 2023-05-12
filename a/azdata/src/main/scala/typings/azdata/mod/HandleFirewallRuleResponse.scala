package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleFirewallRuleResponse extends StObject {
  
  /**
    * Contains error message, if request could not be handled.
    */
  var errorMessage: String
  
  /**
    * If handled, the default IP address to send back; so users can tell what their blocked IP is.
    */
  var ipAddress: String
  
  /**
    * Whether or not request can be handled.
    */
  var result: Boolean
}
object HandleFirewallRuleResponse {
  
  inline def apply(errorMessage: String, ipAddress: String, result: Boolean): HandleFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFirewallRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandleFirewallRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
