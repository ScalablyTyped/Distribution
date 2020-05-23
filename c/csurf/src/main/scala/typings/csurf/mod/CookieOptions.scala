package typings.csurf.mod

import typings.expressServeStaticCore.expressServeStaticCoreStrings.lax
import typings.expressServeStaticCore.expressServeStaticCoreStrings.none
import typings.expressServeStaticCore.expressServeStaticCoreStrings.strict
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions
  extends typings.expressServeStaticCore.mod.CookieOptions {
  var key: js.UndefOr[String] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    encode: /* val */ String => String = null,
    expires: Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    path: String = null,
    sameSite: Boolean | lax | strict | none = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    signed: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOptions]
  }
}

