package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[java.lang.String] = js.undefined
  var httpOnly: js.UndefOr[java.lang.String] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseCookie {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: java.lang.String = null,
    httpOnly: java.lang.String = null,
    maxAge: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    secure: java.lang.String = null,
    value: java.lang.String = null
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

