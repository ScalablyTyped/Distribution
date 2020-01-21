package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSAMLProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.native
}

object CreateSAMLProviderResponse {
  @scala.inline
  def apply(SAMLProviderArn: arnType = null): CreateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (SAMLProviderArn != null) __obj.updateDynamic("SAMLProviderArn")(SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSAMLProviderResponse]
  }
}

