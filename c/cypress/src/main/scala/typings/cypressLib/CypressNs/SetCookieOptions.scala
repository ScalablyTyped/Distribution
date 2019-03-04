package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCookieOptions
  extends Loggable
     with Timeoutable {
  var domain: java.lang.String
  var expiry: scala.Double
  var httpOnly: scala.Boolean
  var path: java.lang.String
  var secure: scala.Boolean
}

object SetCookieOptions {
  @scala.inline
  def apply(
    domain: java.lang.String,
    expiry: scala.Double,
    httpOnly: scala.Boolean,
    log: scala.Boolean,
    path: java.lang.String,
    secure: scala.Boolean,
    timeout: scala.Double
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal(domain = domain, expiry = expiry, httpOnly = httpOnly, log = log, path = path, secure = secure, timeout = timeout)
  
    __obj.asInstanceOf[SetCookieOptions]
  }
}

