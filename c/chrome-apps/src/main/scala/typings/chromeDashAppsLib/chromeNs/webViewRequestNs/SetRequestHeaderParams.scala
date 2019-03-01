package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRequestHeaderParams extends js.Object {
  /** HTTP request header name */
  var name: java.lang.String
  /** HTTP request header value */
  var value: java.lang.String
}

object SetRequestHeaderParams {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): SetRequestHeaderParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SetRequestHeaderParams]
  }
}

