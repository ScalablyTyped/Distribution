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
}

