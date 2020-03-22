package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFirewallRuleResponse extends js.Object {
  var ipAddress: String
  var result: Boolean
}

object HandleFirewallRuleResponse {
  @scala.inline
  def apply(ipAddress: String, result: Boolean): HandleFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandleFirewallRuleResponse]
  }
}

