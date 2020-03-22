package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Account> */
trait AccountOptions extends js.Object {
  var addressBooks: js.UndefOr[js.Array[AddressBook]] = js.undefined
  var calendars: js.UndefOr[js.Array[Calendar]] = js.undefined
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var credentials: js.UndefOr[Credentials] = js.undefined
  var homeUrl: js.UndefOr[String] = js.undefined
  var principalUrl: js.UndefOr[String] = js.undefined
  var rootUrl: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[String] = js.undefined
}

object AccountOptions {
  @scala.inline
  def apply(
    addressBooks: js.Array[AddressBook] = null,
    calendars: js.Array[Calendar] = null,
    constructor: /* options */ js.UndefOr[AccountOptions] => js.Any = null,
    credentials: Credentials = null,
    homeUrl: String = null,
    principalUrl: String = null,
    rootUrl: String = null,
    server: String = null
  ): AccountOptions = {
    val __obj = js.Dynamic.literal()
    if (addressBooks != null) __obj.updateDynamic("addressBooks")(addressBooks.asInstanceOf[js.Any])
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (homeUrl != null) __obj.updateDynamic("homeUrl")(homeUrl.asInstanceOf[js.Any])
    if (principalUrl != null) __obj.updateDynamic("principalUrl")(principalUrl.asInstanceOf[js.Any])
    if (rootUrl != null) __obj.updateDynamic("rootUrl")(rootUrl.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountOptions]
  }
}

