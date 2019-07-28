package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResponseHeaderParams extends js.Object {
  /** HTTP response header name */
  var name: String
  /** HTTP response header value */
  var value: String
}

object AddResponseHeaderParams {
  @scala.inline
  def apply(name: String, value: String): AddResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[AddResponseHeaderParams]
  }
}

