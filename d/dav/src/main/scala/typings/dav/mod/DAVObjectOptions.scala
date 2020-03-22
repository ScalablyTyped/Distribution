package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.DAVObject> */
trait DAVObjectOptions extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* options */ this.type, js.Any]] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DAVObjectOptions {
  @scala.inline
  def apply(
    constructor: DAVObjectOptions => js.Any = null,
    data: String = null,
    etag: String = null,
    url: String = null
  ): DAVObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DAVObjectOptions]
  }
}

