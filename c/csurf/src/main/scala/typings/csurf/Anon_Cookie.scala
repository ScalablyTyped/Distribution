package typings.csurf

import typings.csurf.csurfMod.CookieOptions
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
}

object Anon_Cookie {
  @scala.inline
  def apply(
    cookie: CookieOptions | Boolean = null,
    ignoreMethods: js.Array[String] = null,
    sessionKey: String = null,
    value: /* req */ Request => String = null
  ): Anon_Cookie = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (ignoreMethods != null) __obj.updateDynamic("ignoreMethods")(ignoreMethods)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[Anon_Cookie]
  }
}

