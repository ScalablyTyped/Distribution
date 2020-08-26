package typings.csurf.anon

import typings.csurf.mod.CookieOptions
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.native
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary, _, _, ParsedQs], String]] = js.native
}

object Cookie {
  @scala.inline
  def apply(): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cookie]
  }
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCookie(value: CookieOptions | Boolean): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setIgnoreMethodsVarargs(value: String*): Self = this.set("ignoreMethods", js.Array(value :_*))
    @scala.inline
    def setIgnoreMethods(value: js.Array[String]): Self = this.set("ignoreMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreMethods: Self = this.set("ignoreMethods", js.undefined)
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    @scala.inline
    def setValue(value: /* req */ Request[ParamsDictionary, _, _, ParsedQs] => String): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

