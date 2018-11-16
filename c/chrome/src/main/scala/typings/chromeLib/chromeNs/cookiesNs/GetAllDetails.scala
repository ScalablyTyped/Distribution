package typings
package chromeLib.chromeNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetAllDetails extends js.Object {
  /** Optional. Restricts the retrieved cookies to those whose domains match or are subdomains of this one.  */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Filters the cookies by name.  */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Restricts the retrieved cookies to those whose path exactly matches this string.  */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Filters the cookies by their Secure property.  */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Filters out session vs. persistent cookies.  */
  var session: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.  */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Restricts the retrieved cookies to those that would match the given URL.  */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

