package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceProvider extends StObject {
  
  def createFirewallRule(account: Account, firewallruleInfo: FirewallRuleInfo): Thenable[CreateFirewallRuleResponse]
  
  def handleFirewallRule(errorCode: Double, errorMessage: String, connectionTypeId: String): Thenable[HandleFirewallRuleResponse]
}
object ResourceProvider {
  
  inline def apply(
    createFirewallRule: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse],
    handleFirewallRule: (Double, String, String) => Thenable[HandleFirewallRuleResponse]
  ): ResourceProvider = {
    val __obj = js.Dynamic.literal(createFirewallRule = js.Any.fromFunction2(createFirewallRule), handleFirewallRule = js.Any.fromFunction3(handleFirewallRule))
    __obj.asInstanceOf[ResourceProvider]
  }
  
  extension [Self <: ResourceProvider](x: Self) {
    
    inline def setCreateFirewallRule(value: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse]): Self = StObject.set(x, "createFirewallRule", js.Any.fromFunction2(value))
    
    inline def setHandleFirewallRule(value: (Double, String, String) => Thenable[HandleFirewallRuleResponse]): Self = StObject.set(x, "handleFirewallRule", js.Any.fromFunction3(value))
  }
}
