package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRequestHeaderParams extends js.Object {
  /** HTTP request header name (case-insensitive) */
  var name: String
}

object RemoveRequestHeaderParams {
  @scala.inline
  def apply(name: String): RemoveRequestHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveRequestHeaderParams]
  }
}

