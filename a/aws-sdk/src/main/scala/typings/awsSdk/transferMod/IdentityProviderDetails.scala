package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderDetails extends js.Object {
  /**
    * Provides the type of InvocationRole used to authenticate the user account.
    */
  var InvocationRole: js.UndefOr[Role] = js.native
  /**
    * Contains the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typings.awsSdk.transferMod.Url] = js.native
}

object IdentityProviderDetails {
  @scala.inline
  def apply(InvocationRole: Role = null, Url: Url = null): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    if (InvocationRole != null) __obj.updateDynamic("InvocationRole")(InvocationRole.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderDetails]
  }
}

