package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRequestHeaderParams extends js.Object {
  /** HTTP request header name (case-insensitive) */
  var name: java.lang.String
}

object RemoveRequestHeaderParams {
  @scala.inline
  def apply(name: java.lang.String): RemoveRequestHeaderParams = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[RemoveRequestHeaderParams]
  }
}

