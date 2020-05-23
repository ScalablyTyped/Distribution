package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedAuthentication extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
    */
  var SamlProviderArn: js.UndefOr[String] = js.native
}

object FederatedAuthentication {
  @scala.inline
  def apply(SamlProviderArn: String = null): FederatedAuthentication = {
    val __obj = js.Dynamic.literal()
    if (SamlProviderArn != null) __obj.updateDynamic("SamlProviderArn")(SamlProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedAuthentication]
  }
}

