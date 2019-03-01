package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResponseHeaderParams extends js.Object {
  /** HTTP response header name */
  var name: java.lang.String
  /** HTTP response header value */
  var value: java.lang.String
}

object AddResponseHeaderParams {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): AddResponseHeaderParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AddResponseHeaderParams]
  }
}

