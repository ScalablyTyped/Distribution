package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallRuleResponse extends StObject {
  
  /**
    * Contains error message, if request could not be handled.
    */
  var errorMessage: String
  
  /**
    * Whether or not request can be handled.
    */
  var result: Boolean
}
object CreateFirewallRuleResponse {
  
  inline def apply(errorMessage: String, result: Boolean): CreateFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFirewallRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
