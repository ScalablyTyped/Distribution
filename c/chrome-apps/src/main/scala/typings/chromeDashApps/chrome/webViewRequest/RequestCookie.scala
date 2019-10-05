package typings.chromeDashApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter or specification of a cookie in HTTP Requests.
  */
trait RequestCookie extends js.Object {
  /** Name of a cookie. */
  var name: js.UndefOr[String] = js.undefined
  /** Value of a AddRequestCookie, may be padded in double-quotes. */
  var value: js.UndefOr[String] = js.undefined
}

object RequestCookie {
  @scala.inline
  def apply(name: String = null, value: String = null): RequestCookie = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RequestCookie]
  }
}

