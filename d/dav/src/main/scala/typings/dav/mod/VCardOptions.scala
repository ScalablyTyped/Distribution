package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.VCard> */
trait VCardOptions extends js.Object {
  var addressBook: js.UndefOr[AddressBook] = js.undefined
  var addressData: js.UndefOr[String] = js.undefined
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object VCardOptions {
  @scala.inline
  def apply(
    addressBook: AddressBook = null,
    addressData: String = null,
    constructor: /* options */ js.UndefOr[VCardOptions] => js.Any = null,
    data: String = null,
    etag: String = null,
    url: String = null
  ): VCardOptions = {
    val __obj = js.Dynamic.literal()
    if (addressBook != null) __obj.updateDynamic("addressBook")(addressBook.asInstanceOf[js.Any])
    if (addressData != null) __obj.updateDynamic("addressData")(addressData.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VCardOptions]
  }
}

