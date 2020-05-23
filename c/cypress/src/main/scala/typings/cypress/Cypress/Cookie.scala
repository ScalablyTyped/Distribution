package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: String
  var expiry: js.UndefOr[String] = js.undefined
  var httpOnly: Boolean
  var name: String
  var path: String
  var sameSite: js.UndefOr[SameSiteStatus] = js.undefined
  var secure: Boolean
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String,
    expiry: String = null,
    sameSite: SameSiteStatus = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

