package typings
package cookiesLib.cookiesMod.CookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: java.lang.String
  var expires: stdLib.Date
  var httpOnly: scala.Boolean
  var maxAge: scala.Double
  /**
    * "maxage" is deprecated, use "maxAge" instead
    */
  var maxage: scala.Double
  var name: java.lang.String
  var overwrite: scala.Boolean
  var path: java.lang.String
  var sameSite: scala.Boolean
  var secure: scala.Boolean
  var value: java.lang.String
  def toHeader(): java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    expires: stdLib.Date,
    httpOnly: scala.Boolean,
    maxAge: scala.Double,
    maxage: scala.Double,
    name: java.lang.String,
    overwrite: scala.Boolean,
    path: java.lang.String,
    sameSite: scala.Boolean,
    secure: scala.Boolean,
    toHeader: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    value: java.lang.String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires, httpOnly = httpOnly, maxAge = maxAge, maxage = maxage, name = name, overwrite = overwrite, path = path, sameSite = sameSite, secure = secure, toHeader = toHeader, toString = toString, value = value)
  
    __obj.asInstanceOf[Cookie]
  }
}

