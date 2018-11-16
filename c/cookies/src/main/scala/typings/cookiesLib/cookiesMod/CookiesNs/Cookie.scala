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

