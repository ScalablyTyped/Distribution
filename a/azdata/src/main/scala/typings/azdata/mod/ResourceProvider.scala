package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceProvider extends js.Object {
  def createFirewallRule(account: Account, firewallruleInfo: FirewallRuleInfo): Thenable[CreateFirewallRuleResponse]
  def handleFirewallRule(errorCode: Double, errorMessage: String, connectionTypeId: String): Thenable[HandleFirewallRuleResponse]
}

object ResourceProvider {
  @scala.inline
  def apply(
    createFirewallRule: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse],
    handleFirewallRule: (Double, String, String) => Thenable[HandleFirewallRuleResponse]
  ): ResourceProvider = {
    val __obj = js.Dynamic.literal(createFirewallRule = js.Any.fromFunction2(createFirewallRule), handleFirewallRule = js.Any.fromFunction3(handleFirewallRule))
    __obj.asInstanceOf[ResourceProvider]
  }
}

