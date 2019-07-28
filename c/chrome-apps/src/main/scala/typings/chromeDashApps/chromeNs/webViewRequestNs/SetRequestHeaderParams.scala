package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRequestHeaderParams extends js.Object {
  /** HTTP request header name */
  var name: String
  /** HTTP request header value */
  var value: String
}

object SetRequestHeaderParams {
  @scala.inline
  def apply(name: String, value: String): SetRequestHeaderParams = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[SetRequestHeaderParams]
  }
}

