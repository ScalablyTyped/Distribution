package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleFirewallRuleResponse extends js.Object {
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
  implicit class HandleFirewallRuleResponseOps[Self <: HandleFirewallRuleResponse] (val x: Self) extends AnyVal {
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

