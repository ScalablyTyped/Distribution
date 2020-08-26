package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowNewBrowserTab extends js.Object {
  var allowNewBrowserTab: js.UndefOr[Boolean] = js.native
  var authorization: js.UndefOr[String] = js.native
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.native
  var deepLinkReturnUrl: js.UndefOr[String] = js.native
  var ignoreHistoryChanges: js.UndefOr[Boolean] = js.native
  var profileId: js.UndefOr[String] = js.native
}

object AllowNewBrowserTab {
  @scala.inline
  def apply(): AllowNewBrowserTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowNewBrowserTab]
  }
  @scala.inline
  implicit class AllowNewBrowserTabOps[Self <: AllowNewBrowserTab] (val x: Self) extends AnyVal {
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
    def setAllowNewBrowserTab(value: Boolean): Self = this.set("allowNewBrowserTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNewBrowserTab: Self = this.set("allowNewBrowserTab", js.undefined)
    @scala.inline
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setDeepLinkReturnUrl(value: String): Self = this.set("deepLinkReturnUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLinkReturnUrl: Self = this.set("deepLinkReturnUrl", js.undefined)
    @scala.inline
    def setIgnoreHistoryChanges(value: Boolean): Self = this.set("ignoreHistoryChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreHistoryChanges: Self = this.set("ignoreHistoryChanges", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
  }
  
}

