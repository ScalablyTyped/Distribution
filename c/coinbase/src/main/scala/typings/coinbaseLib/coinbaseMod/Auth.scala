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

