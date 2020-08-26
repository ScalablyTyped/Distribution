package typings.awsSdk.samlCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SAMLCredentialsParams extends js.Object {
  /**
    * The duration, in seconds, of the role session.
    * The minimum duration is 15 minutes.
    * The maximum duration is 12 hours.
    */
  var DurationSeconds: js.UndefOr[Double] = js.native
  /**
    * An IAM policy in JSON format.
    * The policy plain text must be 2048 bytes or shorter.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
    */
  var PrincipalArn: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that the caller is assuming.
    */
  var RoleArn: String = js.native
  /**
    * The base-64 encoded SAML authentication response provided by the IdP.
    */
  var SAMLAssertion: String = js.native
}

object SAMLCredentialsParams {
  @scala.inline
  def apply(PrincipalArn: String, RoleArn: String, SAMLAssertion: String): SAMLCredentialsParams = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SAMLAssertion = SAMLAssertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLCredentialsParams]
  }
  @scala.inline
  implicit class SAMLCredentialsParamsOps[Self <: SAMLCredentialsParams] (val x: Self) extends AnyVal {
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
    def setPrincipalArn(value: String): Self = this.set("PrincipalArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSAMLAssertion(value: String): Self = this.set("SAMLAssertion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationSeconds(value: Double): Self = this.set("DurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("DurationSeconds", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
  
}

