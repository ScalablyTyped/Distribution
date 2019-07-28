package typings.cookies.cookiesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: String
  var expires: Date
  var httpOnly: Boolean
  var maxAge: Double
  /**
    * "maxage" is deprecated, use "maxAge" instead
    */
  var maxage: Double
  var name: String
  var overwrite: Boolean
  var path: String
  var sameSite: Boolean
  var secure: Boolean
  var value: String
  def toHeader(): String
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
    toString: () => String,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires, httpOnly = httpOnly, maxAge = maxAge, maxage = maxage, name = name, overwrite = overwrite, path = path, sameSite = sameSite, secure = secure, toHeader = js.Any.fromFunction0(toHeader), toString = js.Any.fromFunction0(toString), value = value)
  
    __obj.asInstanceOf[Cookie]
  }
}

