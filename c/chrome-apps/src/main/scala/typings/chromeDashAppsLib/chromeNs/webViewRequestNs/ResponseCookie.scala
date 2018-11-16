package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A specification of a cookie in HTTP Responses.
         */


trait ResponseCookie extends js.Object {
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[java.lang.String] = js.undefined
  /** Existence of the HttpOnly cookie attribute. */
  var httpOnly: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Name of a cookie. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[java.lang.String] = js.undefined
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

