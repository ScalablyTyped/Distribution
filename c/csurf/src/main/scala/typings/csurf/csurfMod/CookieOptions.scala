package typings.csurf.csurfMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreStrings.auto
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.CookieOptions {
  var key: String
}

object CookieOptions {
  @scala.inline
  def apply(
    key: String,
    domain: String = null,
    encode: /* val */ String => Unit = null,
    expires: Date | Boolean = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    path: String = null,
    sameSite: Boolean | String = null,
    secure: Boolean | auto = null,
    signed: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[CookieOptions]
  }
}

