package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: String
  var expiry: js.UndefOr[String] = js.undefined
  var httpOnly: Boolean
  var name: String
  var path: String
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
    expiry: String = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, httpOnly = httpOnly, name = name, path = path, secure = secure, value = value)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry)
    __obj.asInstanceOf[Cookie]
  }
}

