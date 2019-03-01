package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: java.lang.String
  var expiry: js.UndefOr[java.lang.String] = js.undefined
  var httpOnly: scala.Boolean
  var name: java.lang.String
  var path: java.lang.String
  var secure: scala.Boolean
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    httpOnly: scala.Boolean,
    name: java.lang.String,
    path: java.lang.String,
    secure: scala.Boolean,
    value: java.lang.String,
    expiry: java.lang.String = null
  ): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("httpOnly")(httpOnly)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("value")(value)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry)
    __obj.asInstanceOf[Cookie]
  }
}

