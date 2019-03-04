package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResponseHeaderParams extends js.Object {
  /** HTTP request header name (case-insensitive). */
  var name: java.lang.String
  /** HTTP request header value (case-insensitive). */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RemoveResponseHeaderParams {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String = null): RemoveResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RemoveResponseHeaderParams]
  }
}

