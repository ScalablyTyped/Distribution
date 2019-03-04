package typings
package cookieUnderscoreJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var domain: java.lang.String
  var expires: scala.Double | java.lang.String | stdLib.Date
  var path: java.lang.String
  var secure: scala.Boolean
}

object Options {
  @scala.inline
  def apply(
    domain: java.lang.String,
    expires: scala.Double | java.lang.String | stdLib.Date,
    path: java.lang.String,
    secure: scala.Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires.asInstanceOf[js.Any], path = path, secure = secure)
  
    __obj.asInstanceOf[Options]
  }
}

