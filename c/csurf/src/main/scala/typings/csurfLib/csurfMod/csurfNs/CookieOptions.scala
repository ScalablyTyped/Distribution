package typings
package csurfLib.csurfMod.csurfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.CookieOptions {
  var key: java.lang.String
}

object CookieOptions {
  @scala.inline
  def apply(
    key: java.lang.String,
    domain: java.lang.String = null,
    encode: js.Function1[/* val */ java.lang.String, scala.Unit] = null,
    expires: stdLib.Date | scala.Boolean = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    sameSite: scala.Boolean | java.lang.String = null,
    secure: scala.Boolean | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreLibStrings.auto = null,
    signed: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (encode != null) __obj.updateDynamic("encode")(encode)
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

