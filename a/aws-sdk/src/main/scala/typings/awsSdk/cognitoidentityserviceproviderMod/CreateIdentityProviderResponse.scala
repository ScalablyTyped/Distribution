package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityProviderResponse extends js.Object {
  /**
    * The newly created identity provider object.
    */
  var IdentityProvider: IdentityProviderType = js.native
}

object CreateIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): CreateIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderResponse]
  }
}

