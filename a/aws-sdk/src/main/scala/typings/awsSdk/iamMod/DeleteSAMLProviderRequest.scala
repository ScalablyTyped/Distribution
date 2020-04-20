package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSAMLProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider to delete.
    */
  var SAMLProviderArn: arnType = js.native
}

object DeleteSAMLProviderRequest {
  @scala.inline
  def apply(SAMLProviderArn: arnType): DeleteSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSAMLProviderRequest]
  }
}

