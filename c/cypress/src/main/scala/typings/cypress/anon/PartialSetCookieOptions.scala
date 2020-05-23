package typings.cypress.anon

import typings.cypress.Cypress.SameSiteStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.SetCookieOptions> */
trait PartialSetCookieOptions extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expiry: js.UndefOr[Double] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var sameSite: js.UndefOr[SameSiteStatus] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialSetCookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    expiry: js.UndefOr[Double] = js.undefined,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    sameSite: SameSiteStatus = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialSetCookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(expiry)) __obj.updateDynamic("expiry")(expiry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSetCookieOptions]
  }
}

