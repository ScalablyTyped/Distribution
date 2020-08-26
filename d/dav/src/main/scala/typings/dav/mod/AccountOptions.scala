package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Account> */
@js.native
trait AccountOptions extends js.Object {
  var addressBooks: js.UndefOr[js.Array[AddressBook]] = js.native
  var calendars: js.UndefOr[js.Array[Calendar]] = js.native
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  var credentials: js.UndefOr[Credentials] = js.native
  var homeUrl: js.UndefOr[String] = js.native
  var principalUrl: js.UndefOr[String] = js.native
  var rootUrl: js.UndefOr[String] = js.native
  var server: js.UndefOr[String] = js.native
}

object AccountOptions {
  @scala.inline
  def apply(): AccountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountOptions]
  }
  @scala.inline
  implicit class AccountOptionsOps[Self <: AccountOptions] (val x: Self) extends AnyVal {
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
    def setAddressBooksVarargs(value: AddressBook*): Self = this.set("addressBooks", js.Array(value :_*))
    @scala.inline
    def setAddressBooks(value: js.Array[AddressBook]): Self = this.set("addressBooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressBooks: Self = this.set("addressBooks", js.undefined)
    @scala.inline
    def setCalendarsVarargs(value: Calendar*): Self = this.set("calendars", js.Array(value :_*))
    @scala.inline
    def setCalendars(value: js.Array[Calendar]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[AccountOptions] => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setHomeUrl(value: String): Self = this.set("homeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeUrl: Self = this.set("homeUrl", js.undefined)
    @scala.inline
    def setPrincipalUrl(value: String): Self = this.set("principalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalUrl: Self = this.set("principalUrl", js.undefined)
    @scala.inline
    def setRootUrl(value: String): Self = this.set("rootUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootUrl: Self = this.set("rootUrl", js.undefined)
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

