package typings.chrome.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[String] = js.undefined
  var httpOnly: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[String] = js.undefined
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
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ResponseCookie]
  }
}

