package typings
package chromeLib.chromeNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetDetails extends js.Object {
  /** Optional. The domain of the cookie. If omitted, the cookie becomes a host-only cookie.  */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.  */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Whether the cookie should be marked as HttpOnly. Defaults to false.  */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The name of the cookie. Empty by default if omitted.  */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The path of the cookie. Defaults to the path portion of the url parameter.  */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Whether the cookie should be marked as Secure. Defaults to false.  */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.  */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /** The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail. */
  var url: java.lang.String
  /** Optional. The value of the cookie. Empty by default if omitted.  */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

