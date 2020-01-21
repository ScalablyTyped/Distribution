package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateWebsiteAuthorizationProviderResponse extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.native
}

object AssociateWebsiteAuthorizationProviderResponse {
  @scala.inline
  def apply(AuthorizationProviderId: Id = null): AssociateWebsiteAuthorizationProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthorizationProviderId != null) __obj.updateDynamic("AuthorizationProviderId")(AuthorizationProviderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateWebsiteAuthorizationProviderResponse]
  }
}

