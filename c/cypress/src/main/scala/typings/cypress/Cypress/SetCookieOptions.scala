package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCookieOptions
  extends Loggable
     with Timeoutable {
  var domain: String
  var expiry: Double
  var httpOnly: Boolean
  var path: String
  var secure: Boolean
}

object SetCookieOptions {
  @scala.inline
  def apply(
    domain: String,
    expiry: Double,
    httpOnly: Boolean,
    log: Boolean,
    path: String,
    secure: Boolean,
    timeout: Double
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal(domain = domain, expiry = expiry, httpOnly = httpOnly, log = log, path = path, secure = secure, timeout = timeout)
  
    __obj.asInstanceOf[SetCookieOptions]
  }
}

