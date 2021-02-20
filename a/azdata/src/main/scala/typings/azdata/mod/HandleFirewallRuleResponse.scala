package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleFirewallRuleResponse extends StObject {
  
  var ipAddress: String = js.native
  
  var result: Boolean = js.native
}
object HandleFirewallRuleResponse {
  
  @scala.inline
  def apply(ipAddress: String, result: Boolean): HandleFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleFirewallRuleResponse]
  }
  
  @scala.inline
  implicit class HandleFirewallRuleResponseMutableBuilder[Self <: HandleFirewallRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
