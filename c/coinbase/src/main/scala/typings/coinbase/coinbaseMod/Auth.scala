package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  /**
    * Authentication method e.g. "oauth"
    */
  var method: String
  var oauth_meta: js.UndefOr[js.Any] = js.undefined
  /**
    * Permissions for this user e.g. "wallet:user:read"
    */
  var scopes: js.Array[String]
}

object Auth {
  @scala.inline
  def apply(method: String, scopes: js.Array[String], oauth_meta: js.Any = null): Auth = {
    val __obj = js.Dynamic.literal(method = method, scopes = scopes)
    if (oauth_meta != null) __obj.updateDynamic("oauth_meta")(oauth_meta)
    __obj.asInstanceOf[Auth]
  }
}

