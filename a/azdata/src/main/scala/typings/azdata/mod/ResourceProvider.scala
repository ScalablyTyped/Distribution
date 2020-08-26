package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceProvider extends js.Object {
  def createFirewallRule(account: Account, firewallruleInfo: FirewallRuleInfo): Thenable[CreateFirewallRuleResponse] = js.native
  def handleFirewallRule(errorCode: Double, errorMessage: String, connectionTypeId: String): Thenable[HandleFirewallRuleResponse] = js.native
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
  @scala.inline
  implicit class ResourceProviderOps[Self <: ResourceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateFirewallRule(value: (Account, FirewallRuleInfo) => Thenable[CreateFirewallRuleResponse]): Self = this.set("createFirewallRule", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleFirewallRule(value: (Double, String, String) => Thenable[HandleFirewallRuleResponse]): Self = this.set("handleFirewallRule", js.Any.fromFunction3(value))
  }
  
}

