package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFirewallRuleResponse extends js.Object {
  var errorMessage: String
  var result: Boolean
}

object CreateFirewallRuleResponse {
  @scala.inline
  def apply(errorMessage: String, result: Boolean): CreateFirewallRuleResponse = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFirewallRuleResponse]
  }
}

