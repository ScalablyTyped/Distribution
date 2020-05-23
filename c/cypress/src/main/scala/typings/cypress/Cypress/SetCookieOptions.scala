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
  var sameSite: SameSiteStatus
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
    sameSite: SameSiteStatus,
    secure: Boolean,
    timeout: Double
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieOptions]
  }
}

