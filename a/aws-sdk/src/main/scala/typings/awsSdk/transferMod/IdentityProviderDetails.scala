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
    * Provides the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typings.awsSdk.transferMod.Url] = js.native
}

object IdentityProviderDetails {
  @scala.inline
  def apply(): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderDetails]
  }
  @scala.inline
  implicit class IdentityProviderDetailsOps[Self <: IdentityProviderDetails] (val x: Self) extends AnyVal {
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
    def setInvocationRole(value: Role): Self = this.set("InvocationRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocationRole: Self = this.set("InvocationRole", js.undefined)
    @scala.inline
    def setUrl(value: Url): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

