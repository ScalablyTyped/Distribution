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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("expiry")(expiry)
    __obj.updateDynamic("httpOnly")(httpOnly)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[SetCookieOptions]
  }
}

