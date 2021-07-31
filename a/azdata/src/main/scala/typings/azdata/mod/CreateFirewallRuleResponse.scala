package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallRuleResponse extends StObject {
  
  var errorMessage: String
  
  var result: Boolean
}
object CreateFirewallRuleResponse {
  
  @scala.inline
  def apply(errorMessage: String, result: Boolean): CreateFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallRuleResponse]
  }
  
  @scala.inline
  implicit class CreateFirewallRuleResponseMutableBuilder[Self <: CreateFirewallRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
