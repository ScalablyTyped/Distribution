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
  def apply(
    PrincipalArn: String,
    RoleArn: String,
    SAMLAssertion: String,
    DurationSeconds: js.UndefOr[Double] = js.undefined,
    Policy: String = null
  ): SAMLCredentialsParams = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SAMLAssertion = SAMLAssertion.asInstanceOf[js.Any])
    if (!js.isUndefined(DurationSeconds)) __obj.updateDynamic("DurationSeconds")(DurationSeconds.get.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLCredentialsParams]
  }
}

