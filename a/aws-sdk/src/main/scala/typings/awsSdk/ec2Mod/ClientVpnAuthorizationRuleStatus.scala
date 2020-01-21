package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnAuthorizationRuleStatus extends js.Object {
  /**
    * The state of the authorization rule.
    */
  var Code: js.UndefOr[ClientVpnAuthorizationRuleStatusCode] = js.native
  /**
    * A message about the status of the authorization rule, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClientVpnAuthorizationRuleStatus {
  @scala.inline
  def apply(Code: ClientVpnAuthorizationRuleStatusCode = null, Message: String = null): ClientVpnAuthorizationRuleStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientVpnAuthorizationRuleStatus]
  }
}

