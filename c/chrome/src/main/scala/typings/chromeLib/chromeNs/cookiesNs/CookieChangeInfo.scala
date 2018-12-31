package typings
package chromeLib.chromeNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieChangeInfo extends js.Object {
  /**
    * Since Chrome 12.
    * The underlying reason behind the cookie's change.
    */
  var cause: java.lang.String
  /** Information about the cookie that was set or removed. */
  var cookie: Cookie
  /** True if a cookie was removed. */
  var removed: scala.Boolean
}

