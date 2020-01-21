package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSAMLProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider that was updated.
    */
  var SAMLProviderArn: js.UndefOr[arnType] = js.native
}

object UpdateSAMLProviderResponse {
  @scala.inline
  def apply(SAMLProviderArn: arnType = null): UpdateSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (SAMLProviderArn != null) __obj.updateDynamic("SAMLProviderArn")(SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSAMLProviderResponse]
  }
}

