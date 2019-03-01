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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("httpOnly")(httpOnly)
    __obj.updateDynamic("maxAge")(maxAge)
    __obj.updateDynamic("maxage")(maxage)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("overwrite")(overwrite)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("sameSite")(sameSite)
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("toHeader")(toHeader)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Cookie]
  }
}

