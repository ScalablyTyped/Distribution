package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of a cookie in HTTP Responses.
  */
trait ResponseCookie extends js.Object {
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[java.lang.String] = js.undefined
  /** Existence of the HttpOnly cookie attribute. */
  var httpOnly: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Name of a cookie. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[java.lang.String] = js.undefined
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseCookie {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: java.lang.String = null,
    httpOnly: java.lang.String = null,
    maxAge: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    name: java.lang.String = null,
    path: java.lang.String = null,
    secure: java.lang.String = null,
    value: java.lang.String = null
  ): ResponseCookie = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly)
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ResponseCookie]
  }
}

