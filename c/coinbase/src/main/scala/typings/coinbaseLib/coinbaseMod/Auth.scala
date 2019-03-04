package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  /**
    * Authentication method e.g. "oauth"
    */
  var method: java.lang.String
  var oauth_meta: js.UndefOr[js.Any] = js.undefined
  /**
    * Permissions for this user e.g. "wallet:user:read"
    */
  var scopes: js.Array[java.lang.String]
}

object Auth {
  @scala.inline
  def apply(method: java.lang.String, scopes: js.Array[java.lang.String], oauth_meta: js.Any = null): Auth = {
    val __obj = js.Dynamic.literal(method = method, scopes = scopes)
    if (oauth_meta != null) __obj.updateDynamic("oauth_meta")(oauth_meta)
    __obj.asInstanceOf[Auth]
  }
}

