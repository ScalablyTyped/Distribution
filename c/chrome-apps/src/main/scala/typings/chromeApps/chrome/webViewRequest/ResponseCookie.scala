package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of a cookie in HTTP Responses.
  */
trait ResponseCookie extends js.Object {
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[String] = js.undefined
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[String] = js.undefined
  /** Existence of the HttpOnly cookie attribute. */
  var httpOnly: js.UndefOr[String] = js.undefined
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[integer] = js.undefined
  /** Name of a cookie. */
  var name: js.UndefOr[String] = js.undefined
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[String] = js.undefined
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[String] = js.undefined
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[String] = js.undefined
}

object ResponseCookie {
  @scala.inline
  def apply(
    domain: String = null,
    expires: String = null,
    httpOnly: String = null,
    maxAge: Int | Double = null,
    name: String = null,
    path: String = null,
    secure: String = null,
    value: String = null
  ): ResponseCookie = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCookie]
  }
}

