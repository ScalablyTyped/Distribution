package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClientVpnIngressResult extends js.Object {
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.native
}

object AuthorizeClientVpnIngressResult {
  @scala.inline
  def apply(): AuthorizeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeClientVpnIngressResult]
  }
  @scala.inline
  implicit class AuthorizeClientVpnIngressResultOps[Self <: AuthorizeClientVpnIngressResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

