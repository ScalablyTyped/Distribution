package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFilter extends js.Object {
  /** Matches if the header name contains all of the specified strings. */
  var nameContains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Matches if the header name is equal to the specified string. */
  var nameEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header name starts with the specified string. */
  var namePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header name ends with the specified string. */
  var nameSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header value contains all of the specified strings. */
  var valueContains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Matches if the header value is equal to the specified string. */
  var valueEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header value starts with the specified string. */
  var valuePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header value ends with the specified string. */
  var valueSuffix: js.UndefOr[java.lang.String] = js.undefined
}

