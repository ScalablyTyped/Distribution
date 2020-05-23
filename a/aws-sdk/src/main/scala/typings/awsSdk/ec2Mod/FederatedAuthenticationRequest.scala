package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedAuthenticationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
    */
  var SAMLProviderArn: js.UndefOr[String] = js.native
}

object FederatedAuthenticationRequest {
  @scala.inline
  def apply(SAMLProviderArn: String = null): FederatedAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    if (SAMLProviderArn != null) __obj.updateDynamic("SAMLProviderArn")(SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedAuthenticationRequest]
  }
}

