package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResponseHeaderParams extends js.Object {
  /** HTTP request header name (case-insensitive). */
  var name: String
  /** HTTP request header value (case-insensitive). */
  var value: js.UndefOr[String] = js.undefined
}

object RemoveResponseHeaderParams {
  @scala.inline
  def apply(name: String, value: String = null): RemoveResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResponseHeaderParams]
  }
}

