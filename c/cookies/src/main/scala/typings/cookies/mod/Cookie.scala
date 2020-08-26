package typings.cookies.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  var domain: String = js.native
  var expires: Date = js.native
  var httpOnly: Boolean = js.native
  var maxAge: Double = js.native
  /**
    * "maxage" is deprecated, use "maxAge" instead
    */
  var maxage: Double = js.native
  var name: String = js.native
  var overwrite: Boolean = js.native
  var path: String = js.native
  var sameSite: Boolean = js.native
  var secure: Boolean = js.native
  var value: String = js.native
  def toHeader(): String = js.native
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    expires: Date,
    httpOnly: Boolean,
    maxAge: Double,
    maxage: Double,
    name: String,
    overwrite: Boolean,
    path: String,
    sameSite: Boolean,
    secure: Boolean,
    toHeader: () => String,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], maxage = maxage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], toHeader = js.Any.fromFunction0(toHeader), value = value.asInstanceOf[js.Any])
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSameSite(value: Boolean): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def setToHeader(value: () => String): Self = this.set("toHeader", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

