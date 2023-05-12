package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceProvider extends StObject {
  
  /**
    * Creates a firewall rule for the given account
    * @param account Account with which firewall rule request will be made.
    * @param firewallruleInfo Firewall rule creation information
    */
  def createFirewallRule(account: Account, firewallruleInfo: FirewallRuleInfo): Thenable[CreateFirewallRuleResponse]
  
  /**
    * Handles the response from the firewall rule creation request
    * @param errorCode Error code from the firewall rule creation request
    * @param errorMessage Error message from the firewall rule creation request
    * @param connectionTypeId Connection type id of the firewall rule creation request
    */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceProvider] (val x: Self) extends AnyVal {
    
    inline def setCreateFirewallRule(value: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse]): Self = StObject.set(x, "createFirewallRule", js.Any.fromFunction2(value))
    
    inline def setHandleFirewallRule(value: (Double, String, String) => Thenable[HandleFirewallRuleResponse]): Self = StObject.set(x, "handleFirewallRule", js.Any.fromFunction3(value))
  }
}
