package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountPasswordPolicyResponse extends js.Object {
  /**
    * A structure that contains details about the account's password policy.
    */
  var PasswordPolicy: typings.awsSdk.iamMod.PasswordPolicy = js.native
}

object GetAccountPasswordPolicyResponse {
  @scala.inline
  def apply(PasswordPolicy: PasswordPolicy): GetAccountPasswordPolicyResponse = {
    val __obj = js.Dynamic.literal(PasswordPolicy = PasswordPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountPasswordPolicyResponse]
  }
  @scala.inline
  implicit class GetAccountPasswordPolicyResponseOps[Self <: GetAccountPasswordPolicyResponse] (val x: Self) extends AnyVal {
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
    def setPasswordPolicy(value: PasswordPolicy): Self = this.set("PasswordPolicy", value.asInstanceOf[js.Any])
  }
  
}

