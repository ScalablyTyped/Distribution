package typings
package csurfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  var cookie: js.UndefOr[csurfLib.csurfMod.CookieOptions | scala.Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[
    js.Function1[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
      java.lang.String
    ]
  ] = js.undefined
}

object Anon_Cookie {
  @scala.inline
  def apply(
    cookie: csurfLib.csurfMod.CookieOptions | scala.Boolean = null,
    ignoreMethods: js.Array[java.lang.String] = null,
    sessionKey: java.lang.String = null,
    value: /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request => java.lang.String = null
  ): Anon_Cookie = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (ignoreMethods != null) __obj.updateDynamic("ignoreMethods")(ignoreMethods)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[Anon_Cookie]
  }
}

