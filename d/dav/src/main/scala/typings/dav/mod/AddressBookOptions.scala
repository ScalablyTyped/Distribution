package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.AddressBook> */
trait AddressBookOptions extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var ctag: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var objects: js.UndefOr[js.Array[VCard]] = js.undefined
  var reports: js.UndefOr[js.Array[String]] = js.undefined
  var resourcetype: js.UndefOr[String] = js.undefined
  var syncToken: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AddressBookOptions {
  @scala.inline
  def apply(
    account: Account = null,
    constructor: /* options */ js.UndefOr[AddressBookOptions] => js.Any = null,
    ctag: String = null,
    data: String = null,
    description: String = null,
    displayName: String = null,
    objects: js.Array[VCard] = null,
    reports: js.Array[String] = null,
    resourcetype: String = null,
    syncToken: String = null,
    url: String = null
  ): AddressBookOptions = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (ctag != null) __obj.updateDynamic("ctag")(ctag.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (resourcetype != null) __obj.updateDynamic("resourcetype")(resourcetype.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressBookOptions]
  }
}

